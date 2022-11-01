package com.kodilla.good.patterns.allegro.user;

public class NotRegisteredUser implements User{
    private final String name;

    public NotRegisteredUser(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
