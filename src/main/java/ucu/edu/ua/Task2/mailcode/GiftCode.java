package ucu.edu.ua.Task2.mailcode;

import ucu.edu.ua.Task2.Client;

public class GiftCode implements MailCode {
    @Override
    public String generate(Client client){
        return "Dear " + client.getName() + ", we have a gift for you!";
    }
}
