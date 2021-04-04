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
public class Sport extends Mobil{
    int jumlah;
    int harga;

    public Sport(int jumlah, int harga) {
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    //Overload
    public Sport(int jumlah) {
        this.jumlah = jumlah;
    }
    
    
    @Override
    float total(){
        return jumlah*harga;
    }
    
    float total(int jumlah){
        return jumlah;
    }
    
    
}
