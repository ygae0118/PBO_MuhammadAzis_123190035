/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert2_123190035.Inheritence;

/**
 *
 * @author user
 */
public class Toyota extends Mobil {
    public void tampil(){
        String bensin="Pertalite";
    
        Mobil m  = new Mobil();
    
        m.inputData("SUV", "Toyota", "Silver");
        m.tampilData();
            System.out.println("Jenis Bahan Bakar :"+bensin);
    
    }
}
