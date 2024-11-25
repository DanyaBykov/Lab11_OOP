import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import ucu.edu.ua.Task2.*;
import ucu.edu.ua.Task2.mailcode.*;

public class TestTask2 {
    private Client client;
    private MailCode mailCode;
    private MailCode mailCode2;
    public void setup(){
        client = new Client("Danya", LocalDate.of(1988, 12, 12), "Male");
        mailCode = new GiftCode();
        mailCode2 = new HappyBirthDayCode();
    }
    @Test
    public void testMailBox() {
        MailBox mailBox = new MailBox();
        MailInfo mailInfo = new MailInfo(client, mailCode);
        MailInfo mailInfo2 = new MailInfo(client, mailCode2);

        mailBox.addMailInfo(mailInfo);
        mailBox.addMailInfo(mailInfo2);
        List<MailInfo> mails = mailBox.getMailInfos();

        assertEquals(2, mails.size());
        
    }

    @Test
    public void testSendAll() {
        Client client1 = new Client("Alice", LocalDate.of(1990, 1, 1), "Female");
        Client client2 = new Client("Bob", LocalDate.of(1992, 5, 15), "Male");

        MailInfo birthdayMail = new MailInfo(client1, new HappyBirthDayCode());
        MailInfo giftMail = new MailInfo(client2, new GiftCode());

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);

        mailBox.sendAll();

        assertEquals(0, mailBox.getMailInfos().size());
    }
}
