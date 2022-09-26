package com.kodilla.exception.test;

public class ExceptionHandling{

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            System.out.println(secondChallenge.probablyIWillThrowException(-1,0));
        }catch(Exception e){
            System.out.println("Coś się stało i sie nie odstanie");
        }finally {
            System.out.println("zakładam że o to chodziło w zadaniu");
        }
    }

}
