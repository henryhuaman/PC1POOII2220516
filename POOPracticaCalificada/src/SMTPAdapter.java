/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class SMTPAdapter extends MailAdapter{
    SMTP smtp;

    public SMTPAdapter(SMTP smtp) {
        this.smtp = smtp;
    }
    
    
    @Override
    void send(String mail) {
        smtp.api(mail);
    }
    
}
