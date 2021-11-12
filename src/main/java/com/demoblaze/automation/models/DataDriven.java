package com.demoblaze.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataDriven {

    private String username, password, email, name, message;


    Faker faker = new Faker(new Locale("en-US"));

    public DataDriven(){

        this.username = "Juanpa9621";
        this.password = "H0L4";
        this.email = faker.internet().emailAddress();
        this.name= faker.name().fullName();
        this.message = "This is a test";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
