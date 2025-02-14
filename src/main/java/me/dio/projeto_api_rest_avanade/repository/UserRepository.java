package me.dio.projeto_api_rest_avanade.repository;

import me.dio.projeto_api_rest_avanade.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
