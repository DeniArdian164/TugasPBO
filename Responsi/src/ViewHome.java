import javax.swing.*;
import java.awt.*;

public class ViewHome extends JFrame {

    JPanel panel = new JPanel();

    JLabel lJudulHome = new JLabel("PERPUSTAKAAN");


    JButton bHome = new JButton("HOME");
    JButton bPinjam = new JButton("PINJAM");
    JButton bTampil = new JButton("TAMPIL");
    JButton bAboutUs = new JButton("ABOUT US");
    JButton bLogout = new JButton("LOG OUT");

    public ViewHome(){
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

        panel.add(lJudulHome);
        lJudulHome.setBounds(250,10, 100,20);
        lJudulHome.setVisible(true);


        panel.add(bHome);
        bHome.setBounds(20,20,100,40);
        bHome.setVisible(true);
        panel.add(bPinjam);
        bPinjam.setBounds(20,70,100,40);
        bPinjam.setVisible(true);
        panel.add(bTampil);
        bTampil.setBounds(20,130,100,40);
        bTampil.setVisible(true);
        panel.add(bAboutUs);
        bAboutUs.setBounds(20,180,100,40);
        bAboutUs.setVisible(true);
        panel.add(bLogout);
        bLogout.setBounds(450,20,100,40);
        bLogout.setVisible(true);
    }
}