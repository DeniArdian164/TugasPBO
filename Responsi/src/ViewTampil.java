import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewTampil extends JFrame {

    JPanel panelKiri = new JPanel();
    JPanel panelKanan = new JPanel();

    JLabel lTitle = new JLabel("PERPUSTAKAAN");

    JLabel lText = new JLabel("List buku");

    public JTable table;
    public DefaultTableModel tableModel;
    JScrollPane scrollPane;

    public Object coloumnName[] = {"Id", "ID", "Nama", "ID Buku", "Judul Buku"};

    JButton bHome = new JButton("Home");
    JButton bPinjam = new JButton("Pinjam");
    JButton bTampil = new JButton("Tampil");
    JButton bAbout = new JButton("About Us");
    JButton bHapus = new JButton("Hapus");
    JButton bEdit = new JButton("Edit");
    JButton bLogout = new JButton("Logout");

    public ViewTampil() {
        tableModel = new DefaultTableModel(coloumnName, 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        setDefaultCloseOperation(3);
        setLocation(350, 100);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        setSize(600, 500);
        setTitle("PERPUSTAKAAN");

        panelKiri.setBounds(0, 0, 400, 500);
        panelKiri.setBackground(Color.YELLOW);
        panelKiri.setBorder(BorderFactory.createLineBorder(Color.white));
        panelKiri.setVisible(true);
        panelKiri.setLayout(null);
        add(panelKiri);

        panelKanan.setBounds(400, 0, 200, 500);
        panelKanan.setBackground(Color.YELLOW);
        panelKanan.setBorder(BorderFactory.createLineBorder(Color.white));
        panelKanan.setVisible(true);
        panelKanan.setLayout(null);
        add(panelKanan);

        lTitle.setBounds(150, 25, 100, 20);
        lText.setBounds(120, 150, 200,20);

        bHapus.setBounds(90, 100, 100, 20);
        bEdit.setBounds(210, 100, 100, 20);
        bHome.setBounds(50, 150, 100, 40);
        bPinjam.setBounds(50, 200, 100, 40);
        bTampil.setBounds(50, 250, 100, 40);
        bAbout.setBounds(50, 300, 100, 40);
        bLogout.setBounds(50, 20, 100, 40);


        scrollPane.setBounds(20,180, 360, 270);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelKiri.add(lTitle);
        panelKiri.add(lText);
        panelKiri.add(bHapus);
        panelKiri.add(bEdit);
        panelKiri.add(scrollPane);


        panelKanan.add(bHome);
        panelKanan.add(bPinjam);
        panelKanan.add(bTampil);
        panelKanan.add(bAbout);
        panelKanan.add(bLogout);
    }
}