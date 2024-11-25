package ucu.edu.ua.Task2;

import lombok.AllArgsConstructor;
import lombok.ToString;
import ucu.edu.ua.Task2.mailcode.MailCode;

@AllArgsConstructor
@ToString
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate(){
        return mailCode.generate(client);
    }

    public Client getClient() {
        return client;
    }

    public MailCode getMailCode() {
        return mailCode;
    }
}
