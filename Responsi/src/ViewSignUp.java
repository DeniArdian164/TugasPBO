import javax.swing.*;
import java.awt.*;

public class ViewSignUp extends JFrame {

    JPanel panel = new JPanel();

    JLabel lTitle = new JLabel("SIGN UP");
    JLabel lUsername = new JLabel("USERNAME ");
    JTextField tfUsername = new JTextField();
    JLabel lPassword = new JLabel("PASSWORD");
    JTextField tfPassword = new JTextField();

    JButton bDaftar = new JButton("DAFTAR");
    JButton bBatal = new JButton("BATAL");
    JButton bKembali = new JButton("KEMBALI");

    public ViewSignUp() {
        setDefaultCloseOperation(3);
        setLocation(350, 100);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        setSize(600, 500);
        setTitle("PERPUSTAKAAN");
        panel.setBackground(Color.YELLOW);
        panel.setBounds(0,0,600,500);
        panel.setBorder(BorderFactory.createLineBorder(Color.white));
        panel.setVisible(true);
        panel.setLayout(null);
        add(panel);

        panel.add(lTitle);
        lTitle.setBounds(300,100,100,20);
        lTitle.setVisible(true);
        panel.add(lUsername);
        lUsername.setBounds(165,150,90,20);
        lUsername.setVisible(true);
        panel.add(lPassword);
        lPassword.setBounds(165,200,90,20);
        lPassword.setVisible(true);

        panel.add(tfUsername);
        tfUsername.setBounds(250,150,150,20);
        tfUsername.setVisible(true);
        panel.add(tfPassword);
        tfPassword.setBounds(250,200,150,20);
        tfPassword.setVisible(true);
        panel.add(bDaftar);
        bDaftar.setBounds(190,250,100,20);
        bDaftar.setVisible(true);
        panel.add(bBatal);
        bBatal.setBounds(310,250,100,20);
        bBatal.setVisible(true);
        panel.add(bKembali);
        bKembali.setBounds(250, 400, 100,20);
        bKembali.setVisible(true);
    }

    public String getUsername() {
        return tfUsername.getText();
    }

    public String getPassword(){
        return tfPassword.getText();
    }
}