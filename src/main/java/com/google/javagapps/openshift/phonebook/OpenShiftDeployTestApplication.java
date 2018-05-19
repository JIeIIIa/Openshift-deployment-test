package com.google.javagapps.openshift.phonebook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpenShiftDeployTestApplication {
    @Value("${MYSQL_SERVICE_HOST}")
    private String host;

    @Value("${MYSQL_SERVICE_PORT}")
    private String port;

    @Value("${MYSQL_USER}")
    private String user;

    @Value("${MYSQL_PASSWORD}")
    private String password;

    @Bean
    public Object testInfo() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("MYSQL_SERVICE_HOST = " + host);
        System.out.println("MYSQL_SERVICE_PORT = " + port);
        System.out.println("MYSQL_SERVICE_USERNAME = " + user);
        System.out.println("MYSQL_SERVICE_PASSWORD = " + password);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        return new Object();
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenShiftDeployTestApplication.class, args);
    }
}
