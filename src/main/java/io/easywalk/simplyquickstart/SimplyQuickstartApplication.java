package io.easywalk.simplyquickstart;

import io.easywalk.simply.controllable.EnableSimplyControllable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSimplyControllable
@SpringBootApplication
public class SimplyQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplyQuickstartApplication.class, args);
    }

}
