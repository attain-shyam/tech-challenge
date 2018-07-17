package io.spring.GradleDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Users {

    private Long id;
    private String name;
    private String teamName;
//    private Integer salary;
    private String address;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

//    public Integer getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Integer salary) {
//        this.salary = salary;
//    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (!id.equals(users.id)) return false;
        if (name != null ? !name.equals(users.name) : users.name != null) return false;
        if (teamName != null ? !teamName.equals(users.teamName) : users.teamName != null) return false;
        return address != null ? address.equals(users.address) : users.address == null;

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
