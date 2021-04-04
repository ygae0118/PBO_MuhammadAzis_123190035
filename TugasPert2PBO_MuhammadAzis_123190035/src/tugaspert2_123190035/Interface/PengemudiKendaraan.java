/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert2_123190035.Interface;

/**
 *
 * @author user
 */
public class PengemudiKendaraan {
    private Kendaraan kendaraan;

    public PengemudiKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    void jalankanMobil(){
        this.kendaraan.jalankan();
    }

    void berhentikanMobil(){
        this.kendaraan.berhentikan();
    }

    void nyalakanLampu(){
        this.kendaraan.nyalakan();
    }

    void matikanLampu(){
        this.kendaraan.matikan();
    }
}
