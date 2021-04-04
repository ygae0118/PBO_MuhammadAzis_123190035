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
public abstract class Kendaraan {
    private String jenis;
    private String merek;
    private String warna;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

/*  public void namaHewan() {

        System.out.println("\n Method didalam abstract class hewan");
        System.out.println("Nama hewan :"+nama);
    }
*/
    
    abstract double unit();
}
