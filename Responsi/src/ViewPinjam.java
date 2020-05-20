import javax.swing.*;
import java.awt.*;

public class ViewPinjam extends JFrame {

    JPanel panelKiri = new JPanel();
    JPanel panelKanan = new JPanel();

    JLabel lTitle = new JLabel("PEMINJAMAN");
    JLabel lIdA = new JLabel("ID ANGGOTA");
    JTextField tfIdA = new JTextField();
    JLabel lNama = new JLabel("NAMA ");
    JTextField tfNama = new JTextField();
    JLabel lIdB = new JLabel("ID BUKU ");
    JTextField tfIdB = new JTextField();
    JLabel lJudulBuku = new JLabel("JUDUL BUKU ");
    JTextField tfJudulBuku = new JTextField();

    JButton bHome = new JButton("HOME");
    JButton bPinjam = new JButton("PINJAM");
    JButton bTampil = new JButton("TAMPIL");
    JButton bAbout = new JButton("ABOUT US");
    JButton bTambah = new JButton("TAMBAH");
    JButton bReset = new JButton("RESET");
    JButton bLogout = new JButton("LOG OUT");

    public ViewPinjam (){
        setDefaultCloseOperation(3);
        setLocation(350, 100);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        setSize(600, 500);
        setTitle("PERPUSTAKAAN");

        panelKiri.setBounds(0,0,400,500);
        panelKiri.setBackground(Color.YELLOW);
        panelKiri.setBorder(BorderFactory.createLineBorder(Color.white));
        panelKiri.setVisible(true);
        panelKiri.setLayout(null);
        add(panelKiri);

        panelKanan.setBounds(400,0,200,500);
        panelKanan.setBackground(Color.YELLOW);
        panelKanan.setBorder(BorderFactory.createLineBorder(Color.white));
        panelKanan.setVisible(true);
        panelKanan.setLayout(null);
        add(panelKanan);

        panelKiri.add(lTitle);
        lTitle.setBounds(200,100,100,20);
        panelKiri.add(lIdA);
        lIdA.setBounds(80,150,100,20);
        panelKiri.add(tfIdA);
        tfIdA.setBounds(180,150,150,20);
        panelKiri.add(lNama);
        lNama.setBounds(80,200,100,20);
        panelKiri.add(tfNama);
        tfNama.setBounds(180,200,150,20);
        panelKiri.add(lIdB);
        lIdB.setBounds(80,250,100,20);
        panelKiri.add(tfIdB);
        tfIdB.setBounds(180,250,150,20);
        panelKiri.add(lJudulBuku);
        lJudulBuku.setBounds(80,300,100,20);
        panelKiri.add(tfJudulBuku);
        tfJudulBuku.setBounds(180,300,150,20);

        panelKiri.add(bTambah);
        bTambah.setBounds(100,350,100,20);
        panelKiri.add(bReset);
        bReset.setBounds(225,350,100,20);


        panelKanan.add(bHome);
        bHome.setBounds(50,150,100,40);
        panelKanan.add(bPinjam);
        bPinjam.setBounds(50,200,100,40);
        panelKanan.add(bTampil);
        bTampil.setBounds(50,250,100,40);
        panelKanan.add(bAbout);
        bAbout.setBounds(50,300,100,40);
        panelKanan.add(bLogout);
        bLogout.setBounds(50, 20, 100, 40);
    }

    public String getIdA(){
        return tfIdA.getText();
    }

    public String getNama(){
        return tfNama.getText();
    }

    public String getIdB(){
        return tfIdB.getText();
    }

    public String getJudulBuku(){
        return tfJudulBuku.getText();
    }
}