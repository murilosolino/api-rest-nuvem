package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

    public User findById(Long id);

    public User create (User userToCreate);
}
