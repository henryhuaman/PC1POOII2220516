/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class SendGridAdapter extends MailAdapter{
    SendGrid sendGrid;

    public SendGridAdapter(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }
    
    
    @Override
    void send(String mail) {
        sendGrid.api(mail);
    }
    
}
