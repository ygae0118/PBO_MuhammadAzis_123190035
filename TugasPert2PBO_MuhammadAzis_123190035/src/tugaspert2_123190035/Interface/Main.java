/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert2_123190035.Interface;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Interface");
        //Interface objek Mobil
        Kendaraan Mobil = new Mobil();
        PengemudiKendaraan Sopir = new PengemudiKendaraan(Mobil);

        Scanner input = new Scanner(System.in);
        String aksi;

        while(true) {
            System.out.println("Interface - Objek Mobil");
            System.out.println("1.Jalankan Mobil");
            System.out.println("2.Berhentikan Mobil");
            System.out.println("3.Nyalakan Lampu");
            System.out.println("4.Matikan Lampu");
            System.out.println("5.Keluar");
            System.out.println("Pilih menu pilihan diatas :");
            aksi = input.nextLine();


            if(aksi.equalsIgnoreCase("1")) {
                System.out.println("");
                Sopir.jalankanMobil();
                System.out.println("\n");
            } else if (aksi.equalsIgnoreCase("2")) {
                System.out.println("");
                Sopir.berhentikanMobil();
                System.out.println("\n");
            } else if (aksi.equalsIgnoreCase("3")) {
                System.out.println("");
                Sopir.nyalakanLampu();
                System.out.println("\n");
            } else if (aksi.equalsIgnoreCase("4")) {
                System.out.println("");
                Sopir.matikanLampu();
                System.out.println("\n");
            } else if (aksi.equalsIgnoreCase("5")) {
                System.exit(5);
            } else {
                System.out.println("Pilihan Anda Salah");
            }

        }

    }

}
