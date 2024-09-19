package com.pw5.pw5.service;

import com.pw5.pw5.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> findAllUsers();
    UserModel findUserById(Long id);
    UserModel createUser(UserModel user);
    UserModel updateUser(UserModel user);
    void deleteUser(Long id);
}
