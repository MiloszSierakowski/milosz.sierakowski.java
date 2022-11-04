package com.kodilla.good.patterns.challenges.allegro.information_service;

import com.kodilla.good.patterns.challenges.allegro.User;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Drogi " + user.getName() + " Twoje zamowienie zostalo zlozone poprawnie, oczekuj na dalsze informacje");
    }
}
