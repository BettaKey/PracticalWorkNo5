package com.pw5.pw5.repository;
import com.pw5.pw5.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryUserDAO {

    private List<UserModel> users = new ArrayList<>();

    public List<UserModel> findAll() {
        return users;
    }

    public UserModel findById(Long id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
    }

    public UserModel save(UserModel user) {
        users.add(user);
        return user;
    }

    public void delete(Long id) {
        users.removeIf(u -> u.getId().equals(id));
    }
}
