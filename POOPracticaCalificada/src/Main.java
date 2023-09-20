/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        SendGrid sg = new SendGrid("mensaje");
        SMTP smtp = new SMTP("mensaje");
        
        
        SendGridAdapter adapter1 = new SendGridAdapter(sg);
        SMTPAdapter adapter2 = new SMTPAdapter(smtp);
        
        adapter1.send("mail");
        adapter2.send("mail");
        
        
        
    }
    
}
