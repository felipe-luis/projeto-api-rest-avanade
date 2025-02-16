package me.dio.service;

import me.dio.projeto_api_rest_avanade.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
