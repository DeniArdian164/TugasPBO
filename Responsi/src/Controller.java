import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller implements ActionListener {

    Perpustakaan perpustakaan;

    ViewHome viewHome;
    ViewPinjam viewPinjam;
    ViewTampil viewTampil;
    ViewAboutUs viewAbout;
    ViewEdit viewEdit;
    Model modelMenu;

    public Controller(ViewHome viewHome, ViewPinjam viewPinjam, ViewTampil viewTampil, ViewAboutUs viewAbout, ViewEdit viewEdit, Model modelMenu) {
        this.viewHome = viewHome;
        this.viewPinjam = viewPinjam;
        this.viewTampil = viewTampil;
        this.viewAbout = viewAbout;
        this.viewEdit = viewEdit;
        this.modelMenu = modelMenu;
        buttonView();
        home();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewHome.bHome || e.getSource() == viewPinjam.bHome ||
                e.getSource() == viewTampil.bHome || e.getSource() == viewAbout.bHome){
            home();
        } else if (e.getSource() == viewHome.bPinjam || e.getSource() == viewPinjam.bPinjam ||
                e.getSource() == viewTampil.bPinjam || e.getSource() == viewAbout.bPinjam){
            pinjam();
        } else if (e.getSource() == viewHome.bTampil || e.getSource() == viewPinjam.bTampil ||
                e.getSource() == viewTampil.bTampil || e.getSource() == viewAbout.bTampil){
            tampil();
        } else if (e.getSource() == viewHome.bAboutUs || e.getSource() == viewPinjam.bAbout ||
                e.getSource() == viewTampil.bAbout || e.getSource() == viewAbout.bAbout) {
            about();
        } else if (e.getSource() == viewHome.bLogout || e.getSource() == viewPinjam.bLogout ||
                e.getSource() == viewTampil.bLogout || e.getSource() == viewAbout.bLogout){
            logout();
        } else if (e.getSource() == viewPinjam.bTambah){
            pinjamTambah();
        } else if (e.getSource() == viewPinjam.bReset){
            pinjamBatal();
        } else if (e.getSource() == viewTampil.bHapus){
            tampilHapus();
        } else if (e.getSource() == viewTampil.bEdit){
            edit(perpustakaan);
        } else if (e.getSource() == viewEdit.bBatal) {
            tampil();
        } else if (e.getSource() == viewEdit.bEdit) {
            editEdit();
        }
    }

    public void home(){
        resetView();
        viewHome.setVisible(true);
    }

    public void pinjam(){
        resetView();
        viewPinjam.setVisible(true);
    }

    public void tampil(){
        resetView();
        viewTampil.setVisible(true);
        tampilReset();
    }

    public void about(){
        resetView();
        viewAbout.setVisible(true);
    }

    public void edit(Perpustakaan perpustakaan){
        resetView();
        viewEdit.setVisible(true);

        viewEdit.lId.setText(perpustakaan.getId());

        viewEdit.tfIdA.setEnabled(false);
        viewEdit.tfIdA.setText(perpustakaan.getMemberId());
        viewEdit.tfNama.setText(perpustakaan.getMemberName());
        viewEdit.tfIdB.setText(perpustakaan.getBookId());
        viewEdit.tfJudulBuku.setText(perpustakaan.getBookName());
    }

    public void resetView(){
        viewHome.setVisible(false);
        viewPinjam.setVisible(false);
        viewTampil.setVisible(false);
        viewAbout.setVisible(false);
        viewEdit.setVisible(false);
    }

    public void buttonView(){
        viewHome.bHome.addActionListener(this);
        viewHome.bPinjam.addActionListener(this);
        viewHome.bTampil.addActionListener(this);
        viewHome.bAboutUs.addActionListener(this);
        viewHome.bLogout.addActionListener(this);

        viewPinjam.bTambah.addActionListener(this);
        viewPinjam.bReset.addActionListener(this);
        viewPinjam.bHome.addActionListener(this);
        viewPinjam.bPinjam.addActionListener(this);
        viewPinjam.bTampil.addActionListener(this);
        viewPinjam.bAbout.addActionListener(this);
        viewPinjam.bLogout.addActionListener(this);

        viewTampil.bHapus.addActionListener(this);
        viewTampil.bEdit.addActionListener(this);
        viewTampil.bHome.addActionListener(this);
        viewTampil.bPinjam.addActionListener(this);
        viewTampil.bTampil.addActionListener(this);
        viewTampil.bAbout.addActionListener(this);
        viewTampil.bLogout.addActionListener(this);
        viewTampil.table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                viewTampil.bHapus.setEnabled(true);
                viewTampil.bEdit.setEnabled(true);

                int row = viewTampil.table.getSelectedRow();
                String id = viewTampil.table.getValueAt(row, 0).toString();
                String memberId = viewTampil.table.getValueAt(row, 1).toString();
                String memberName = viewTampil.table.getValueAt(row, 2).toString();
                String bookId = viewTampil.table.getValueAt(row, 3).toString();
                String bookName = viewTampil.table.getValueAt(row, 4).toString();

                perpustakaan = new Perpustakaan(id, memberId, memberName, bookId, bookName);
            }
        });

        viewAbout.bHome.addActionListener(this);
        viewAbout.bPinjam.addActionListener(this);
        viewAbout.bTampil.addActionListener(this);
        viewAbout.bAbout.addActionListener(this);
        viewAbout.bLogout.addActionListener(this);

        viewEdit.bBatal.addActionListener(this);
        viewEdit.bEdit.addActionListener(this);
    }

    public void pinjamBatal(){
        viewPinjam.tfIdA.setText("");
        viewPinjam.tfNama.setText("");
        viewPinjam.tfIdB.setText("");
        viewPinjam.tfJudulBuku.setText("");
    }

    public void pinjamTambah(){
        String memberId = viewPinjam.getIdA();
        String memberName = viewPinjam.getNama();
        String bookId = viewPinjam.getIdB();
        String bookName = viewPinjam.getJudulBuku();

        if (memberId.equals("") || memberName.equals("") || bookId.equals("") || bookName.equals("")){
            JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
        } else {
            if (modelMenu.pinjamTambah(memberId, memberName, bookId, bookName) == 1){
                JOptionPane.showMessageDialog(null, "Berhasil Menambahkan");
                pinjamBatal();
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Menambahkan");
            }
        }
    }

    public void tampilReset(){
        viewTampil.bHapus.setEnabled(false);
        viewTampil.bEdit.setEnabled(false);

        String[][] data = modelMenu.getAllData();
        viewTampil.table.setModel(new JTable(data, viewTampil.coloumnName).getModel());
        viewTampil.table.getColumnModel().getColumn(0).setMinWidth(0);
        viewTampil.table.getColumnModel().getColumn(0).setMaxWidth(0);
        viewTampil.table.getColumnModel().getColumn(0).setWidth(0);
    }

    public void tampilHapus() {
        int input = JOptionPane.showConfirmDialog(null, "Ingin Menghapus ? ", "HAPUS", JOptionPane.YES_NO_OPTION);
        if (input == 0){
            if (modelMenu.tampilHapus(perpustakaan) == 1) {
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus!!");
                tampilReset();
            }
        }
    }

    public void editEdit(){
        String id = viewEdit.getId();
        String memberId = viewEdit.getIdA();
        String memberName = viewEdit.getNama();
        String bookId = viewEdit.getIdB();
        String bookName = viewEdit.getJudulBuku();

        System.out.println(id);
        if (memberId.equals("") || memberName.equals("") || bookId.equals("") || bookName.equals("")){
            JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
        } else {
            perpustakaan = new Perpustakaan(id, memberId, memberName, bookId, bookName);
            if (modelMenu.editEdit(perpustakaan) == 1){
                JOptionPane.showMessageDialog(null, "Edit Berhasil");
                tampil();
            }
        }
    }

    public void logout(){
        int input = JOptionPane.showConfirmDialog(null, "Ingin LogOut ? ", "LOGOUT", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            resetView();
            new MVClog();
        }
    }
}