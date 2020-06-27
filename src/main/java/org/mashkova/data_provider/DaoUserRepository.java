package org.mashkova.data_provider;

import org.mashkova.utilities.User;

import java.util.List;

public class DaoUserRepository implements UserRepository {
    @Override
    public List<User> findAllUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addUser(User user) {
        throw new UnsupportedOperationException();
    }
}
