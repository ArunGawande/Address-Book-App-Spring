package com.bridgelabz.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Slf4j
@EnableSwagger2
public class AddressbookApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AddressbookApplication.class, args);
        log.info("AddressBook App Startedin {} Environment....!!!",
                context.getEnvironment().getProperty("environment"));

    }

}
