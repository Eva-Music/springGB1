package org.mashkova.data_provider;

import org.mashkova.utilities.User;

import java.util.List;

public interface UserRepository {

    List<User> findAllUsers();
    void addUser(User user);
}
