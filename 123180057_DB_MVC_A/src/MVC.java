public class MVC {
    
    ViewTambah tambah = new ViewTambah();
    Model model = new Model();
    ViewTampil tampil = new ViewTampil();
    ViewUpdate update = new ViewUpdate();
    ViewDelete delete = new ViewDelete();
    Controller controller = new Controller(model, tambah, tampil, update, delete);
    
}