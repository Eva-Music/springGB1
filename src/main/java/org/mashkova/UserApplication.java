package org.mashkova;

import org.mashkova.configs.UserApplicationConfig;
import org.mashkova.utilities.User;
import org.mashkova.utilities.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserApplicationConfig.class);

        UserService userService = context.getBean("service",
                UserService.class);

        userService.printAllUsers();

        User user = context.getBean("user", User.class);
        userService.addUser(user);

        userService.printAllUsers();

        context.close();
    }
}
