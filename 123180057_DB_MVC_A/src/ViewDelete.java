import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class ViewDelete extends JFrame {
    
    
    JLabel lDeskripsi1 = new JLabel("Masukkan Nama");
    JLabel lDeskripsi2 = new JLabel("yang ingin dihapus!");
    JLabel lNama = new JLabel("Nama");
    JTextField tfNama = new JTextField();
    JButton btnDelete = new JButton("Delete");
    JButton btnCancel = new JButton("Cancel");
    
    GroupLayout gpPanelBottom, gpPanelTop, gpPanelMiddle;
    
    public ViewDelete() {
        setTitle("Delete Data");
        setSize(400,400);
        setVisible(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        lDeskripsi1.setFont(new Font("COURIER NEW", Font.BOLD, 18));
        lDeskripsi2.setFont(new Font("COURIER NEW", Font.BOLD, 18));
        lNama.setFont(new Font("COURIER NEW", Font.BOLD, 20));

        

     add(lDeskripsi1);
     add(lDeskripsi2);
     add(lNama);
     add(tfNama);
     add(btnDelete);
     add(btnCancel);
        

        lDeskripsi1.setBounds(70, 20, 300, 20);
        lDeskripsi2.setBounds(90, 40, 300, 20);
        lNama.setBounds(50, 90, 100, 20);
        tfNama.setBounds(150, 90, 180, 20);
        
        btnDelete.setBounds(85, 170, 80, 20);
        btnCancel.setBounds(185, 170, 100, 20);
        
    }
    
    public String getNama () {
        return tfNama.getText();
    }

}