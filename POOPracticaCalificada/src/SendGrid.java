/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class SendGrid {
    String request;

    public SendGrid(String request) {
        this.request = request;
    }
    
    
    
    public void api(String request){
        System.out.println("te llego un reporte sobre "+request);
    }
}
