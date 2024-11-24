package ucu.edu.ua.Task2.mailcode;

import ucu.edu.ua.Task2.Client;

public class HappyBirthDayCode implements MailCode {
    @Override
    public String generate(Client client){
        return "Happy Birthday, dear " + client.getName() + "!";
    }
    
}
