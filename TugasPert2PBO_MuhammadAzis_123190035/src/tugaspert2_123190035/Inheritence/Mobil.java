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
public class Mobil {
    String jenis;
    String merek;
    String warna;
    
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis  = jenis;
    }
    
    public String getMerek(){
        return merek;
    }

    public void setMerek(String merek){
        this.merek = merek;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void tampilData(){
        System.out.println("Jenis Mobil :"+getJenis());
        System.out.println("Merek Mobil :"+getMerek());
        System.out.println("Warna Mobil :"+getWarna());
    }
    
    public void inputData(String j, String m, String w){
        setJenis(j);
        setMerek(m);
        setWarna(w);
    }
}
    
    

