import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ViewUpdate extends JFrame {
    

    JLabel lNama = new JLabel("Nama");
    JLabel lNoHP = new JLabel("No HP");
    JLabel lUmur = new JLabel("Umur");
    JLabel lEmail = new JLabel("Email");
    JLabel lNamaFix = new JLabel();
    JTextField tfNoHP = new JTextField();
    JTextField tfUmur = new JTextField();
    JTextField tfEmail = new JTextField();
    JButton btnUpdate = new JButton("Update");
    JButton btnCancel = new JButton("Cancel");
    
    GroupLayout gpPanelBottom, gpPanelTop, gpPanelMiddle;
    
    public ViewUpdate() {
        setTitle("Update Data");
        setSize(400,400);
        setVisible(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        

        add(lNama);
        add(lNoHP);
        add(lUmur);
        add(lEmail);
        add(lNamaFix);
        add(tfNoHP);
        add(tfUmur);
        add(tfEmail);
        add(btnUpdate);
        add(btnCancel);
        

        lNama.setBounds(50, 20, 100, 20);
        lNamaFix.setBounds(150, 20, 180, 20);
        lNoHP.setBounds(50, 60, 100, 20);
        tfNoHP.setBounds(150, 60, 180, 20);
        lUmur.setBounds(50, 100, 100, 20);
        tfUmur.setBounds(150, 100, 180, 20);
        lEmail.setBounds(50, 140, 100, 20);
        tfEmail.setBounds(150, 140, 180, 20);
        
        btnUpdate.setBounds(85, 200, 80, 20);
        btnCancel.setBounds(185, 200, 100, 20);
        
    }
    
    
}