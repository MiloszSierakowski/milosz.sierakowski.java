package com.kodilla.good.patterns.allegro.user;

public class RegisteredUser implements User{
    private final String name;

    public RegisteredUser(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
