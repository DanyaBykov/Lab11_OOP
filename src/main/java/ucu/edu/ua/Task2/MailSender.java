package ucu.edu.ua.Task2;



public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        String message = mailInfo.getMailCode().generate(mailInfo.getClient());
        System.out.println("Sending email to " + mailInfo.getClient().getName() + ": " + message);
    }
}
