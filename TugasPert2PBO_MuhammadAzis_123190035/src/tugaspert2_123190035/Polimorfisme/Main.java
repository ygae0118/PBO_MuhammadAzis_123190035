/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert2_123190035.Polimorfisme;



/**
 *
 * @author user
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polimorfisme");
        //Sport sport = new Sport(1, 300000000);
        //SUV suv = new SUV(1, 180000000);
        
        //sport.total();
        //suv.total();
        
        Mobil mobilsport = new Sport(2, 300);
        Mobil mobilsuv = new SUV(3, 180);
        SUV mobilsuv2 = new SUV(3, 180);
            
            
            System.out.println("Total  Harga  Mobil Sport adalah "+mobilsport.total()+" Juta");
            System.out.println("Total  Harga  Mobil SUV adalah "+mobilsuv.total()+" Juta");
            System.out.println("Jumlah Mobil adalah "+mobilsuv.total());
       
        //sport.total();
        //suv.total();
        
}
}
