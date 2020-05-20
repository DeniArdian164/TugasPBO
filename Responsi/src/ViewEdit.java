import javax.swing.*;
import java.awt.*;

public class ViewEdit extends JFrame {

    JPanel panel = new JPanel();

    JLabel lTitle = new JLabel("PERPUSTAKAAN");
    JLabel lTitle1 = new JLabel("FORM EDIT");

    JLabel lId = new JLabel("");
    JLabel lIdA = new JLabel("ID ANGGOTA ");
    JTextField tfIdA = new JTextField();
    JLabel lNama = new JLabel("NAMA ");
    JTextField tfNama = new JTextField();
    JLabel lIdB = new JLabel("ID BUKU ");
    JTextField tfIdB = new JTextField();
    JLabel lJudulBuku = new JLabel("JUDUL BUKU ");
    JTextField tfJudulBuku = new JTextField();

    JButton bBatal = new JButton("Batal");
    JButton bEdit = new JButton("Edit");

    public ViewEdit(){
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

        panel.add(lId);
        lId.setVisible(false);
        panel.add(lTitle);
        lTitle.setBounds(250, 50, 100,20);
        panel.add(lTitle1);
        lTitle1.setBounds(270, 100, 100,20);
        panel.add(lIdA);
        lIdA.setBounds(180, 150, 100,20);
        panel.add(lNama);
        lNama.setBounds(180, 200, 100,20);
        panel.add(lIdB);
        lIdB.setBounds(180, 250, 100,20);
        panel.add(lJudulBuku);
        lJudulBuku.setBounds(180, 300, 100,20);

        panel.add(tfIdA);
        tfIdA.setBounds(280, 150, 150, 20);
        panel.add(tfNama);
        tfNama.setBounds(280, 200, 150, 20);
        panel.add(tfIdB);
        tfIdB.setBounds(280, 250, 150, 20);
        panel.add(tfJudulBuku);
        tfJudulBuku.setBounds(280,300,150,20);


        bBatal.setBounds(200, 350, 100, 20);
        bEdit.setBounds(320, 350, 100, 20);
        panel.add(bEdit);
        panel.add(bBatal);
    }

    public String getId(){
        return lId.getText();
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