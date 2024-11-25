package ucu.edu.ua.Task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public List<MailInfo> getMailInfos() {
        return infos;
    }

    public void sendAll() {
        MailSender mailSender = new MailSender();
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
        infos.clear();
    }
}
