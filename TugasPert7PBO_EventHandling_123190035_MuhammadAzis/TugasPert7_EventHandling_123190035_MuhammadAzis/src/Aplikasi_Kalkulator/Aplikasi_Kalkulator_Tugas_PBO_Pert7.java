package Aplikasi_Kalkulator;

import javax.swing.*;
import java.awt.event.*;

public class Aplikasi_Kalkulator_Tugas_PBO_Pert7 {
    public static void main(String[] args) {
        GUIDE guide;
        guide = new GUIDE();
    }  
}

class GUIDE extends JFrame implements ActionListener{
    String Bilangan = " ";
    double Hasil;
    double angka[] = new double[500]; //Jumlah  Penyimpanan Angka Yang dapat Dihitung = 500
    int i = 0;
    int pilih[] = new int[500];       //Jumlah Penyimpanan Operasi Yang dapat Dilakukan = 500
    
    //Pendeklarasian Tombol Objek Aplikasi_Kalkulator_Tugas_PBO_Pert7
    
    JTextPane fcalc = new JTextPane();
    JButton bilanganNol = new JButton("0");
    JButton bilanganSatu = new JButton("1");
    JButton bilanganDua = new JButton("2");
    JButton bilanganTiga = new JButton("3");
    JButton bilanganEmpat = new JButton("4");
    JButton bilanganLima = new JButton("5");
    JButton bilanganEnam = new JButton("6");
    JButton bilanganTujuh = new JButton("7");
    JButton bilanganDelapan = new JButton("8");
    JButton bilanganSembilan = new JButton("9");
    JButton Perkalian = new JButton("*");
    JButton Pembagian = new JButton("/");
    JButton Penjumlahan = new JButton("+");
    JButton Kurang = new JButton("-");
    JButton samaDengan = new JButton("=");
    JButton Bersihkan = new JButton("Clear");
    JButton Koma = new JButton(".");
    
    //Set  Ukuran GUI Kalkulator
    public GUIDE(){
        setTitle("KALKULATOR ARITMATIKA");
        setSize(265,320);
        setLayout(null);
        add(fcalc);
        add(bilanganSatu);
	add(bilanganDua);
	add(bilanganTiga);
        add(Perkalian);
	add(bilanganEmpat);
	add(bilanganLima);
	add(bilanganEnam);
        add(Pembagian);
	add(bilanganTujuh);
	add(bilanganDelapan);
	add(bilanganSembilan);
        add(Penjumlahan);
	add(bilanganNol);
        add(Koma);
	add(samaDengan);
	add(Kurang);
	add(Bersihkan);
        
        //Ukuran Objek Tombol
        fcalc.setBounds(10,10,240,20);
        bilanganSatu.setBounds(10,40,50,20);
        bilanganDua.setBounds(70,40,50,20);
        bilanganTiga.setBounds(130,40,50,20);
        Perkalian.setBounds(190,40,50,20);
        bilanganEmpat.setBounds(10,80,50,20);
        bilanganLima.setBounds(70,80,50,20);
        bilanganEnam.setBounds(130,80,50,20);
        Pembagian.setBounds(190,80,50,20);
        bilanganTujuh.setBounds(10,120,50,20);
        bilanganDelapan.setBounds(70,120,50,20);
        bilanganSembilan.setBounds(130,120,50,20);
        Penjumlahan.setBounds(190,120,50,20);
        bilanganNol.setBounds(10,160,50,20);
        Koma.setBounds(70,160,50,20);
        samaDengan.setBounds(130,160,50,20);
        Kurang.setBounds(190,160,50,20);
        Bersihkan.setBounds(10,220,90,40);
        
	setVisible(true);
        
        //Event Handling
        
        bilanganNol.addActionListener(this);
        bilanganSatu.addActionListener(this);
        bilanganDua.addActionListener(this);
        bilanganTiga.addActionListener(this);
        bilanganEmpat.addActionListener(this);
        bilanganLima.addActionListener(this);
        bilanganEnam.addActionListener(this);
        bilanganTujuh.addActionListener(this);
        bilanganDelapan.addActionListener(this);
        bilanganSembilan.addActionListener(this);
        Koma.addActionListener(this);
        Perkalian.addActionListener(this);
        Pembagian.addActionListener(this);
        Penjumlahan.addActionListener(this);
        Kurang.addActionListener(this);
        samaDengan.addActionListener(this);
        Bersihkan.addActionListener(this);
        
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
            if(e.getSource() == bilanganNol){
                Bilangan+="0";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganSatu){
                Bilangan+="1";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganDua){
                Bilangan+="2";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganTiga){
                Bilangan+="3";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganEmpat){
                Bilangan+="4";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganLima){
                Bilangan+="5";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganEnam){
                Bilangan+="6";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganTujuh){
                Bilangan+="7";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganDelapan){
                Bilangan+="8";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == bilanganSembilan){
                Bilangan+="9";
                fcalc.setText(Bilangan);
            }
            if(e.getSource() == Koma){
                Bilangan+=".";
                fcalc.setText(Bilangan);
            }

            //Tempat Proses Penghitungan Bilangan Terjadi, Penghitungan Dapat Dilakukan Secara Beruntun
            //Dengan Mengikuti Dari Alur Hasil Penghitungan Pertama
            //Penghitungan Hanya Dapat Dilakukan 500 Kali Secara Beruntun
            //Misal 1+1 = 2, 2*8 = 16, 16-4 = 12, 12/6 = 2, . . . dst 
            
            if(e.getSource() == Perkalian){
                angka[i] = Double.parseDouble(Bilangan);
                Bilangan=" ";
                pilih[i]=3;
                i++;
            }
            if(e.getSource() == Pembagian){
                angka[i] = Double.parseDouble(Bilangan);
                Bilangan=" ";
                pilih[i]=4;
                i++;
            }
            if(e.getSource() == Penjumlahan){
                angka[i] = Double.parseDouble(Bilangan);
                Bilangan=" ";
                pilih[i]=1;
                i++;
            }
            if(e.getSource() == Kurang){
                angka[i] = Double.parseDouble(Bilangan);
                Bilangan=" ";
                pilih[i]=2;
                i++;
            }
            if(e.getSource() == samaDengan){
                angka[i] =Double.parseDouble(Bilangan);
                for(int j=0;j<i;j++){
                    
                    //Switch Case Pemilihan Operator Penghitungan Yang Ingin Digunakan
                    switch(pilih[j]){
                        
                    case 1:
                        if(j==0){
                            Hasil = angka[j]+angka[j+1];
                        }else Hasil = Hasil+angka[j+1];
                        Bilangan = Double.toString(Hasil);            
                        break;
                    case 2:
                        if(j==0){
                            Hasil = angka[j]-angka[j+1];
                        }else Hasil = Hasil-angka[j+1];
                        Bilangan = Double.toString(Hasil);            
                        break;
                    case 3:
                        if(j==0){
                            Hasil = angka[j]*angka[j+1];
                        }else Hasil = Hasil*angka[j+1];
                        Bilangan = Double.toString(Hasil);            
                        break;
                    case 4:
                        if(j==0){
                            Hasil = angka[j]/angka[j+1];
                        }else Hasil = Hasil/angka[j+1];
                        Bilangan = Double.toString(Hasil);            
                    break;           
                    }
                } 
                fcalc.setText(Bilangan);
                i=0;
            }
            if(e.getSource() == Bersihkan){
                fcalc.setText(null);
                Hasil=0;
                i=0;
                Bilangan=" ";
            }
        }

}
