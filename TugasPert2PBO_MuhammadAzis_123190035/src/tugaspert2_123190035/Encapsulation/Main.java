/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert2_123190035.Encapsulation;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Encapsulation");
        System.out.println("Data Pengguna Mobil");
        Scanner input = new Scanner(System.in);
        Pengguna pengguna = new Pengguna ("Budiman", "Laki-Laki", 19, "");
            System.out.println("Nama Pengguna   : "+pengguna.getNama());
            System.out.println("Jenis Kelamin   : "+pengguna.getJeniskelamin());
            System.out.println("Umur Pengguna   : "+pengguna.getUmur());
            System.out.println("Id Pengguna     : 12320BO"+pengguna.getUmur());
            
            System.out.println("\n");
            System.out.println("Masukan Data  Pengguna Baru Pengguna Mobil");
            System.out.println("Masukan Nama Baru   : ");
        String namaBaru = input.next();
            pengguna.setNama(namaBaru);
            System.out.println("Masukan Jenis Kelamin Baru  : ");
        String jeniskelaminBaru = input.next();
            pengguna.setJeniskelamin(jeniskelaminBaru);
            System.out.println("Masukan Umur Baru   :");
        int umurBaru = input.nextInt();
            pengguna.setUmur(umurBaru);
        
            System.out.println("Data Baru Pengguna Mobil");
            System.out.println("Nama Pengguna   : "+pengguna.getNama());
            System.out.println("Jenis Kelamin   : "+pengguna.getJeniskelamin());
            System.out.println("Umur Pengguna   : "+pengguna.getUmur());
            System.out.println("Id Pengguna     : 12320BO"+pengguna.getUmur());
            
    }
}
