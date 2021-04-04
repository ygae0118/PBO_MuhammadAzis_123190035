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
public class Mobil implements Kendaraan{
    private int Cahaya;
    private boolean Jalan;

    public Mobil() {

        this.Cahaya = 50;
    }
    
    @Override
    public void jalankan() {

        Jalan = true;
        System.out.println("Mobil Dijalankan");
        System.out.println("Brumm. . .  Brummm. . . Brummm. . .");
    }

    @Override
    public void berhentikan() {
        Jalan = false;
        System.out.println("Mobil Berhenti");
    }
    
    @Override
    public void nyalakan() {
        if (Jalan) {
            if (this.Cahaya == MAX_Cahaya) {

                System.out.println("Keterangan Cahaya Mobil MAX");
                System.out.println("Lampu Cahaya Mobil "+this.getCahaya()+" %");

            } else {

                this.Cahaya += 10;
                System.out.println("Lampu Cahaya Mobil sekarang "+this.getCahaya());

            }

        } else {

            System.out.println("Jalankan Mobil Terlebih Dahulu");

        }

    }

    public int getCahaya() {
        return this.Cahaya;
    }

    @Override
    public void matikan() {

        if (Jalan) {
            if (this.Cahaya == MIN_Cahaya) {

                System.out.println("Keterangan Cahaya Lampu Mobil MAX");
                System.out.println("Cahaya Lampu Mobil sudah"+this.getCahaya()+"%");

            } else {

                this.Cahaya += 10;
                System.out.println("Cahaya Lampu Mobil sekarang " + this.getCahaya());

            }

        } else {

            System.out.println("Jalankan Mobil Dahulu");

        }

    }
}

