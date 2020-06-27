package org.mashkova.utilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope(value = "singleton")
//@Scope(value = "prototype")
public class Constants {

    @Value("Telegram")
    public String socialNetwork;

}
