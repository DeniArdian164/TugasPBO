import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewTampil extends JFrame {
    JPanel pPanelMiddle = new JPanel();
    JPanel pPanelBottom = new JPanel();
    JPanel pPanelLine = new JPanel();

    JButton btnAdd = new JButton("Tambah Data");
    JButton btnDel = new JButton("Hapus Data");
    
    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"Nama", "No HP", "Umur", "Email"};
    
    GroupLayout gpPanelMiddle, gpPanelBottom, gpPanelLine;
    
    public ViewTampil() {
        setTitle("Output Data Kontak");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(600,500);
        setLocationRelativeTo(null);
        
        tabelModel = new DefaultTableModel(kolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
 
        
        gpPanelMiddle = new GroupLayout(pPanelMiddle);
        pPanelMiddle.setLayout(gpPanelMiddle);
        gpPanelBottom = new GroupLayout(pPanelBottom);
        pPanelBottom.setLayout(gpPanelBottom);
        gpPanelLine = new GroupLayout(pPanelLine);
        pPanelLine.setLayout(gpPanelLine);
        
   
        add(pPanelBottom);
        add(pPanelMiddle);
        add(pPanelLine);
        

        pPanelMiddle.add(scrollPane);
        pPanelBottom.add(btnAdd);
        pPanelBottom.add(btnDel);
        
      
        pPanelLine.setBounds(430, 70, 10, 450);
     
        pPanelBottom.setBounds(0, 380, 190, 450);

        pPanelMiddle.setBounds(0, 0, 430, 450);
   
        

        btnAdd.setBounds(10, 10, 120, 20);
        btnDel.setBounds(10, 40, 120, 20);
        scrollPane.setBounds(15, 15, 400, 350);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        
    }
    
}