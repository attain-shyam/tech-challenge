package io.spring.GradleDemo.repository;

import io.spring.GradleDemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepository extends JpaRepository<Users,Long> {

    Users findByName(String name);
}
