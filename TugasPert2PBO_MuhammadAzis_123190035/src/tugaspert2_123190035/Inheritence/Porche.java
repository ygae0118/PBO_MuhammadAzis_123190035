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
public class Porche extends Mobil{
    public void tampil(){
        String bensin="Premium";
        
        Mobil m = new Mobil();
        
        m.inputData("Sport", "Porche", "Hitam");
        m.tampilData();
        
            System.out.println("Jenis Bahan Bakar   :"+bensin);
        
        
    }
}
