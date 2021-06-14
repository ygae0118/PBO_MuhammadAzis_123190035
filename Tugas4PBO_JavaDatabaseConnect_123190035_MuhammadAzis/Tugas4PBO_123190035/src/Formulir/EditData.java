package Formulir;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;
import java.lang.String;

public class EditData {
    public static void main(String[] args) {
        new Edit();
    }
}

class Edit extends JFrame implements ActionListener{
    Connect connector = new Connect();
    String no;
    String tmpEmail, tmpUsername, tmpPassword, tmpNama, tmpTmptLahir;
    String tmpTglLahir, tmpJk, tmpDomisili, tmpDeskripsi;
    int cocok, hitung;
    
    
    
    JLabel lbEmail = new JLabel("Email");
    JLabel lbUsername = new JLabel("Username");
    JLabel lbPassword = new JLabel("Password");
    JLabel lbNama = new JLabel("Nama Lengkap");
    JLabel lbTmptLahir = new JLabel("Tempat Lahir");
    JLabel lbTglLahir = new JLabel("Tanggal Lahir");
    JLabel lbJk = new JLabel("Jenis Kel");
    JLabel lbDomisili = new JLabel("Domisili");
    JLabel lbDeskripsi = new JLabel("Deskripsi Diri");
    
    JTextField femail = new JTextField(30);
    JTextField fusername = new JTextField(30);
    JTextField fpassword = new JTextField(20);
    JTextField fnama = new JTextField(30);
    JTextField ftmpatLahir = new JTextField(30);
    JTextField ftglLahir = new JTextField(18);
    JTextField fjk = new JTextField(18);
    JTextField fdomisili = new JTextField(25);
    JTextField fdeskripsi = new JTextField(100);
    JTextField fvalidation = new JTextField(100);
    
    JLabel fno = new JLabel ("");
    
    JButton btnCheck = new JButton("CEK");
    JButton btnSubmit = new JButton("SIMPAN");
    JButton btnData = new JButton("TAMPIL DATA");
    
    public Edit(){
        setTitle("FORM DAFTAR");
        setSize(500,450);

        
        setLayout(null);
        
        add(lbEmail);
        add(lbUsername);
        add(lbPassword);
        add(lbNama);
        add(lbTmptLahir);
        add(lbTglLahir);
        add(lbJk);
        add(lbDomisili);
        add(lbDeskripsi);
        
        add(femail);
        add(fusername);
        add(fpassword);
        add(fnama);
        add(ftmpatLahir);
        add(ftglLahir);
        add(fjk);
        add(fdomisili);
        add(fdeskripsi);
        add(fvalidation);
        
        add(fno);
        
        add(btnCheck);
        add(btnSubmit);
        add(btnData);
        
        //------------------------------------------------------
        
        lbEmail.setBounds(10, 15, 200, 20);
        lbUsername.setBounds(10, 45, 200, 20);
        lbPassword.setBounds(10, 75, 200, 20);
        lbNama.setBounds(10, 105, 200, 20);
        lbTmptLahir.setBounds(10, 135, 200, 20);
        lbTglLahir.setBounds(10, 165, 200, 20);
        lbJk.setBounds(10, 195, 200, 20);
        lbDomisili.setBounds(10, 225, 200, 20);
        lbDeskripsi.setBounds(10, 255, 200, 20);
        
        femail.setBounds(120, 15, 200, 20);
        fusername.setBounds(120, 45, 200, 20);
        fpassword.setBounds(120, 75, 200, 20);
        fnama.setBounds(120, 105, 200, 20);
        ftmpatLahir.setBounds(120, 135, 200, 20);
        ftglLahir.setBounds(120, 165, 200, 20);
        fjk.setBounds(120, 195, 200, 20);
        fdomisili.setBounds(120, 225, 200, 20);
        fdeskripsi.setBounds(120, 255, 200, 20);
        fvalidation.setBounds(160, 350, 150, 20);
        
        btnCheck.setBounds(10, 300, 130, 20);
        btnSubmit.setBounds(174, 300, 130, 20);
        btnData.setBounds(340, 300, 130, 20);
        setVisible(true);
        
        btnCheck.addActionListener(this);
        btnSubmit.addActionListener(this);
        btnData.addActionListener(this);
        
        try {
            File myObj = new File("form-pendaftaran.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(no == null) no = data;
                else if(tmpEmail == null) tmpEmail = data;
                else if(tmpUsername== null) tmpUsername = data;
                else if(tmpPassword == null) tmpPassword = data;
                else if(tmpNama == null) tmpNama = data;
                else if(tmpTmptLahir == null) tmpTmptLahir = data;
                else if(tmpTglLahir == null) tmpTglLahir = data;
                else if(tmpJk == null) tmpJk = data;
                else if(tmpDomisili == null) tmpDomisili = data;
                else if(tmpDeskripsi == null) tmpDeskripsi = data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        fno.setText(""+no);    
        femail.setText(""+tmpEmail);
        fusername.setText(""+tmpUsername);
        fpassword.setText(""+tmpPassword);
        fnama.setText(""+tmpNama);
        ftmpatLahir.setText(""+tmpTmptLahir);
        ftglLahir.setText(""+tmpTglLahir);
        fjk.setText(""+tmpJk);
        fdomisili.setText(""+tmpDomisili);
        fdeskripsi.setText(""+tmpDeskripsi);          
    }
    
    public void actionPerformed(java.awt.event.ActionEvent x){
        if(x.getSource() == btnCheck){
            cocok = 0;
            tmpEmail = femail.getText();
            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            if (tmpEmail.matches(regex));
            else { 
                femail.setText("Sesuai Format !!");
                cocok = 1;
            }
            
            tmpUsername = fusername.getText();
            Pattern form = Pattern.compile("[^a-zA-Z0-9]");
            Matcher equal = form.matcher(tmpUsername);
            boolean id = equal.find();
            if(id){ 
                fusername.setText("Font and Number Required !!!");
                cocok = 1;
            }
            
            tmpPassword = fpassword.getText();
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = pattern.matcher(tmpPassword);
            boolean pass = matcher.find();
            if(pass);
            else{
                fpassword.setText("Font, Number, Symbol Required !!!");
                cocok = 1;
            }
    
            tmpNama = fnama.getText();
            tmpTmptLahir = ftmpatLahir.getText();
            tmpTglLahir = ftglLahir.getText();
            tmpJk = fjk.getText();
            tmpDomisili = fdomisili.getText();
            tmpDeskripsi = fdeskripsi.getText();
            hitung = tmpDeskripsi.length();
            if(hitung > 200){ 
                fdeskripsi.setText("MAX 200 Lenght ");
                cocok = 1;
            }
        }
        
        if (x.getSource()==btnSubmit){
            if (cocok > 0) JOptionPane.showMessageDialog(null,"IncorrectDetect");
            
            else {
                try {
                    connector.statement = connector.koneksi.createStatement();
                    String sql = "update data set " + "no = '"+fno.getText()+"', " + "email = '"+femail.getText()+"', " + "username = '"+fusername.getText()+"', "
                                    + "password = '"+fpassword.getText()+"', " + "nama = '"+fnama.getText()+"', " + "tmpatlahir = '"+ftmpatLahir.getText()+"', " + "tgllahir = '"+ftglLahir.getText()+"', "
                                    + "jk = '"+fjk.getText()+"', " + "domisili = '"+fdomisili.getText()+"', " + "deskripsi = '"+fdeskripsi.getText()+"' " + "where no = '" + fno.getText() + "'";
                    connector.statement.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Data added", "Result ",JOptionPane.INFORMATION_MESSAGE);            
                    connector.statement.close();
                    connector.koneksi.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Data didnt added", "Result ", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } 
            }
        }
        if (x.getSource()==btnData){
            new Preview();
            dispose();
        }
    }
}
    

