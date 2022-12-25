package com.kodilla.good.patterns.food2door.information.service;

import com.kodilla.good.patterns.food2door.User;

public class EmailService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("Witaj " + user.getName() +
                " Twoje zamowienie zostalo przyjete i zostanie zrealizowane najszybciej jak sie da");
    }
}
