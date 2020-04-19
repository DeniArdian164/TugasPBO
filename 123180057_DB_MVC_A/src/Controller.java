import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {
    
    public Controller(Model model, ViewTambah tambah, ViewTampil tampil, ViewUpdate update, ViewDelete delete) {
        
        
        
        tampil.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambah.setVisible(true);
                tampil.setVisible(false);
            }
        });
        
        tampil.btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete.setVisible(true);
                tampil.setVisible(false);
            }
        });
        
        tambah.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = tambah.getNama();
                String NoHP = tambah.getNoHP();
                String Umur = tambah.getUmur();
                String Email = tambah.getEmail();
                
                model.inputData(Nama, NoHP, Umur, Email);
                String contact[][] = model.outputData();
                tampil.tabel.setModel(new JTable(contact, tampil.kolom).getModel());
                tampil.setVisible(true);
                tambah.setVisible(false);
                tambah.tfNama.setText(null);
                tambah.tfNoHP.setText(null);
                tambah.tfUmur.setText(null);
                tambah.tfEmail.setText(null);
            }
        });
        
        tambah.btnOutput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contact[][] = model.outputData();
                tampil.tabel.setModel(new JTable(contact, tampil.kolom).getModel());
                tampil.setVisible(true);
                tambah.setVisible(false);
                tambah.tfNama.setText(null);
                tambah.tfNoHP.setText(null);
                tambah.tfUmur.setText(null);
                tambah.tfEmail.setText(null);
            }
        });
        
        tampil.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = tampil.tabel.getSelectedRow();
                int column = tampil.tabel.getSelectedColumn();
                
                String pilih = tampil.tabel.getValueAt(row, 0). toString();
                System.out.println(pilih);
                
                int updateData = JOptionPane.showConfirmDialog(null, "Update Data " + pilih + " ?", "Pilihan", JOptionPane.YES_NO_OPTION);
                if (updateData == 0) {
                    update.lNamaFix.setText(pilih);
                    tampil.setVisible(false);
                    update.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Update Data");
                }
            }
        });
        
        update.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = update.lNamaFix.getText();
                String NoHP = update.tfNoHP.getText();
                String Umur = update.tfUmur.getText();
                String Email = update.tfEmail.getText();
                model.updateData(Nama, NoHP, Umur, Email);
                String contact[][] = model.outputData();
                tampil.tabel.setModel(new JTable(contact, tampil.kolom).getModel());
                update.setVisible(false);
                tampil.setVisible(true);
                update.tfNoHP.setText(null);
                update.tfUmur.setText(null);
                update.tfEmail.setText(null);
            }
        });
        
        update.btnCancel.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                update.setVisible(false);
                tampil.setVisible(true);
                update.tfNoHP.setText(null);
                update.tfUmur.setText(null);
                update.tfEmail.setText(null);
             }
         });
        
        delete.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = delete.getNama();
                
                model.deleteData(Nama);
                String contact[][] = model.outputData();
                tampil.tabel.setModel(new JTable(contact, tampil.kolom).getModel());
                tampil.setVisible(true);
                delete.setVisible(false);
                delete.tfNama.setText(null);
            }
        });
        
        delete.btnCancel.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 delete.setVisible(false);
                 tampil.setVisible(true);
                 delete.tfNama.setText(null);
             }
         });
        
    }
    
}