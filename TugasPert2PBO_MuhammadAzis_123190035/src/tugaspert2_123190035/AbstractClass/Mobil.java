/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert2_123190035.AbstractClass;

/**
 *
 * @author user
 */
public class Mobil extends Kendaraan {
    int jumlah;

    public Mobil(int jumlah) {
        this.jumlah = jumlah;
        super.setJenis("Sport");
        super.setMerek("Porsche");
        super.setWarna("Silver");
    }
    
    @Override
    double unit() {
        return jumlah;
    }
    
      void gambaran(){
        System.out.println("Jenis Mobil adalah "+unit());
        System.out.println("Jenis Mobil adalah "+super.getJenis());
        System.out.println("Merek Mobil adalah "+super.getMerek());
        System.out.println("Warna Mobil adalah "+super.getWarna());
    }
}
