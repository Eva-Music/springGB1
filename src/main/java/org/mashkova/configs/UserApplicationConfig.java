package org.mashkova.configs;

import org.mashkova.utilities.NameGetter;
import org.mashkova.utilities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@ComponentScan(basePackages = {"org.mashkova"})
public class UserApplicationConfig {

    @Bean
    public User user(){
        return new User(new BigDecimal(3), "Fedya", "fedya@mail.ru");
    }

    @Bean
    public NameGetter nameGetter(){
        NameGetter nameGetter = new NameGetter(user().getUsername());
        nameGetter.getWinnerName();
        return  nameGetter;
    }

}
