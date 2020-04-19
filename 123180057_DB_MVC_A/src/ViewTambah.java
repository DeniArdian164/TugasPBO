import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class ViewTambah extends JFrame {
    
    JLabel lJudul,lNama,lNoHP,lUmur,lEmail;
    JTextField tfNama,tfNoHP,tfUmur,tfEmail;
    JButton btnSubmit,btnCancel,btnOutput;
    
   
    
    public ViewTambah() {
        setTitle("Tambah Data");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        
  
        lNama = new JLabel("Nama");
        lNoHP = new JLabel("No HP");
        lUmur = new JLabel("Umur");
        lEmail = new JLabel("Email");
        tfNama = new JTextField();
        tfNoHP = new JTextField();
        tfUmur = new JTextField();
        tfEmail = new JTextField();
        btnSubmit = new JButton("Submit");
        btnOutput = new JButton("Output");
        
     
        add(lNama);
        add(lNoHP);
        add(lUmur);
        add(lEmail);
        add(tfNama);
        add(tfNoHP);
        add(tfUmur);
        add(tfEmail);
        add(btnSubmit);
        add(btnOutput);
        
        
        
 
        lNama.setBounds(50, 20, 100, 20);
        lNoHP.setBounds(50, 60, 100, 20);
        lUmur.setBounds(50, 100, 100, 20);
        lEmail.setBounds(50, 140, 100, 20);
        
        tfNama.setBounds(150, 20, 180, 20);
        tfNoHP.setBounds(150, 60, 180, 20);
        tfUmur.setBounds(150, 100, 180, 20);
        tfEmail.setBounds(150, 140, 180, 20);  
        
        btnSubmit.setBounds(85, 200, 80, 20);
        btnOutput.setBounds(185, 200, 100, 20);
        
    }
    
    public String getNama () {
        return tfNama.getText();
    }
    public String getNoHP () {
        return tfNoHP.getText();
    }
    public String getUmur () {
        return tfUmur.getText();
    }
    public String getEmail () {
        return tfEmail.getText();
    }

}