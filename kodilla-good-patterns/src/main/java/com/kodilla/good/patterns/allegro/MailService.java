package com.kodilla.good.patterns.allegro;

public class MailService implements InformationService{
    public void inform(User user){
        System.out.println("Drogi " + user.getName() + " Twoje zamowienie zostalo zlozone poprawnie, oczekuj na dalsze informacje");
    }
}
