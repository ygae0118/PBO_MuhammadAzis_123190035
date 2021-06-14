package Formulir;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        Connect connect = new Connect();
        new SET();
    }
}

class SET extends JFrame implements ActionListener{
    JLabel title = new JLabel ("FORM DAFTAR");
    JButton tampil = new JButton("TAMPIL DATA");
    
    public SET(){
        setTitle("FORMULIR");
        setSize(400,200);
        setVisible(true);
        
        setLayout(null);
        add (title); 
        add(tampil);
        
        title.setBounds(150,10,120,20);
        tampil.setBounds(125,60,140,40);
        tampil.addActionListener(this);
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == tampil){
            new Preview(); 
            dispose();
        }
    }
}
