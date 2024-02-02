/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staratgy2;

/**
 *
 * @author hp
 */
public class Credit implements Payment{

    @Override
    public void pay() {
        System.out.println("pay with crdit ");
    }
    
}
 class PAypel implements Payment{

    @Override
    public void pay() {
        System.out.println("pay with PAypel ");
    }
    
}
