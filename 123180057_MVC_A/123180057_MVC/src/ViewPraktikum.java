import java.awt.*;

import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewPraktikum extends JFrame {

    JLabel lJudul = new JLabel("Data Mahasiswa");
    JLabel lNim = new JLabel("Nim      : ");
    JTextField tfnim = new JTextField();
    JLabel lNamaMhs = new JLabel ("Nama     : ");
    JTextField tfNamaMhs = new JTextField();
    JLabel lAlamatMhs = new JLabel ("Alamat   : ");
    JTextField tfAlamatMhs = new JTextField();

    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Batal");
    
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"NIM","Nama","Alamat"}; //membuat kolom dalam array

    public ViewPraktikum(){

        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(720, 550);
       

        //TABEL
        add(scrollPane);
        scrollPane.setBounds(110, 50, 480, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lJudul);
        lJudul.setFont(new Font("Courier New", Font.BOLD, 20));
        lJudul.setBounds(260, 5, 210, 30);
        add(lNim);
        lNim.setFont(new Font("Courier New", Font.BOLD, 12));
        lNim.setBounds(110, 260, 90, 20);
        add(tfnim);
        tfnim.setBounds(110, 285, 120, 20);
        add(lNamaMhs);
        lNamaMhs.setFont(new Font("Courier New", Font.BOLD, 12));
        lNamaMhs.setBounds(110, 310, 90, 20);
        add(tfNamaMhs);
        tfNamaMhs.setBounds(110, 335, 120, 20);
        add(lAlamatMhs);
        lAlamatMhs.setFont(new Font("Courier New", Font.BOLD, 12));
        lAlamatMhs.setBounds(110, 360, 90, 20);
        add(tfAlamatMhs);
        tfAlamatMhs.setBounds(110, 385, 120, 20);

        add(btnTambahPanel);
        btnTambahPanel.setBounds(110, 425, 90, 20);

        add(btnBatalPanel);
        btnBatalPanel.setBounds(240, 425, 90, 20);

        
    }
    public String getNim(){
        return tfnim.getText();
    }

    public String getNamaMhs(){
        return tfNamaMhs.getText();
    }

    public String getAlamatMhs(){
        return tfAlamatMhs.getText();
    }
}
