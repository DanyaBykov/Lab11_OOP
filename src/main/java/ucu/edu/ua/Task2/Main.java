package ucu.edu.ua.Task2;

import java.time.LocalDate;

import ucu.edu.ua.Task2.mailcode.HappyBirthDayCode;
import ucu.edu.ua.Task2.mailcode.GiftCode;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alice", LocalDate.of(1990, 1, 1), "Female");
        Client client2 = new Client("Bob", LocalDate.of(1992, 5, 15), "Male");

        MailInfo birthdayMail = new MailInfo(client1, new HappyBirthDayCode());
        MailInfo giftMail = new MailInfo(client2, new GiftCode());

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);

        mailBox.sendAll();
    }
}
