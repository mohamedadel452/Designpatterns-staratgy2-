/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staratgy2;

/**
 *
 * @author hp
 */
public class Staratgy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Payment payment=new PAypel();
        Context  context=new Context(payment);
        context.pay();
        
        
        
    }
    
}
