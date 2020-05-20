import javax.swing.*;
import java.awt.*;

public class ViewSignIn extends JFrame {

    JPanel panel = new JPanel();

    JLabel lLogin = new JLabel("LOGIN");
    JLabel lUsername = new JLabel("USERNAME");
    JTextField tfUsername = new JTextField();
    JLabel lPassword = new JLabel("PASSWORD");
    JPasswordField tfPassword = new JPasswordField();

    JButton bLogin = new JButton("MASUK");
    JButton bDaftar = new JButton("DAFTAR");
    JButton bKembali = new JButton("KEMBALI");

    public ViewSignIn(){
        setDefaultCloseOperation(3);
        setLocation(350, 100);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        setSize(600, 500);
        setTitle("PERPUSTAKAAN");

        panel.setBounds(0,0,600,500);
        panel.setBackground(Color.YELLOW);
        panel.setBorder(BorderFactory.createLineBorder(Color.white));
        panel.setVisible(true);
        panel.setLayout(null);
        add(panel);

        panel.add(lLogin);
        lLogin.setBounds(300,100,100,20);
        lLogin.setVisible(true);
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
        panel.add(bLogin);
        bLogin.setBounds(190,250,100,20);
        bLogin.setVisible(true);
        panel.add(bDaftar);
        bDaftar.setBounds(310,250,100,20);
        bDaftar.setVisible(true);
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