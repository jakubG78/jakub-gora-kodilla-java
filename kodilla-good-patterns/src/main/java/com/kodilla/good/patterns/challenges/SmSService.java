package com.kodilla.good.patterns.challenges;

public class SmSService implements InformationService {

    @Override
    public void inform(User user){
        System.out.println("Sending sms about order to: " + user.getName() +" " + user.getSurname());
    }
}
