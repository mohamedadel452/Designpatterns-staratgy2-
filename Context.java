/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staratgy2;

/**
 *
 * @author hp
 */
public class Context {
    
    Payment payment;
    public Context(Payment  payment){
        this.payment=payment;
    }
    
    
    public void pay(){
        payment.pay();
    }
    
    
    
}
