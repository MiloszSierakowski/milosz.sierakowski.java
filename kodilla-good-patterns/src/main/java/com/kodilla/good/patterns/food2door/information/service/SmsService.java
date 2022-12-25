package com.kodilla.good.patterns.food2door.information.service;

import com.kodilla.good.patterns.food2door.User;

public class SmsService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Drogi " + user.getName() + " " + user.getSurname() +
                " Twoje zamowienie zostało przyjęte przez sklep");
    }
}
