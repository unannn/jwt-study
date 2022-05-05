package me.unannn.jwt.repository;

import me.unannn.jwt.config.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @EntityGraph(attributePaths = "authorities") //Eager 조회로 가져옴
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
