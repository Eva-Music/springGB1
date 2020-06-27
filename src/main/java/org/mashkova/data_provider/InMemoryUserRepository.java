package org.mashkova.data_provider;

import org.mashkova.utilities.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class InMemoryUserRepository implements UserRepository  {
    private List<User> users;

    @PostConstruct
    public void init(){
        this.users = new ArrayList<>();
        this.users.add(new User(new BigDecimal(1), "Olya", "olla@mail.ru"));
        this.users.add(new User(new BigDecimal(2), "Vasya", "vasya@mail.ru"));
    }

    public List<User> findAllUsers(){
        return Collections.unmodifiableList(users);
    }

    public void addUser(User user){
        users.add(user);
    }
}
