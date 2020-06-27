package org.mashkova.utilities;

import org.mashkova.data_provider.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component(value = "service")
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setInMemoryUserRepository(@Qualifier(value = "inMemoryUserRepository") UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void printAllUsers(){

        List<User> users = userRepository.findAllUsers();
        if(users != null) Stream.of(users).forEach(System.out::println);
    }

    public void addUser(User user){
        userRepository.addUser(user);
    }

}
