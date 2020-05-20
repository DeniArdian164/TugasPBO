import javax.swing.*;
import java.awt.*;

public class ViewAboutUs extends JFrame {

    JPanel panel = new JPanel();

    JLabel lJudul = new JLabel("PERPUSTAKAAN");
    JLabel lSambutan = new JLabel("ABOUT US");
    JLabel lSambutan1 = new JLabel("Responsi Praktikum PBO A");
    JLabel lSambutan2 = new JLabel("Awang Deni Ardianto");

    JButton bHome = new JButton("HOME");
    JButton bPinjam = new JButton("PINJAM");
    JButton bTampil = new JButton("TAMPIL");
    JButton bAbout = new JButton("ABOUT US");
    JButton bLogout = new JButton("LOG OUT");

    public ViewAboutUs(){
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

        panel.add(lJudul);
        lJudul.setBounds(250,20,100,20);
        lJudul.setVisible(true);
        panel.add(lSambutan);
        lSambutan.setBounds(250,70,200,20);
        lSambutan.setVisible(true);
        panel.add(lSambutan1);
        lSambutan1.setBounds(250,90,200,20);
        lSambutan1.setVisible(true);
        panel.add(lSambutan2);
        lSambutan2.setBounds(250,110,200,20);
        lSambutan2.setVisible(true);

        panel.add(bHome);
        bHome.setBounds (20,20,100,40);
        bHome.setVisible(true);
        panel.add(bPinjam);
        bPinjam.setBounds(20,70,100,40);
        bPinjam.setVisible(true);
        panel.add(bTampil);
        bTampil.setBounds(20,130,100,40);
        bTampil.setVisible(true);
        panel.add(bAbout);
        bAbout.setBounds(20,180,100,40);
        bAbout.setVisible(true);
        panel.add(bLogout);
        bLogout.setBounds(450, 20, 100, 40);
    }
}