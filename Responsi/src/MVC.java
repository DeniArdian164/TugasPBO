public class MVC {

    ViewHome viewHome = new ViewHome();
    ViewPinjam viewPinjam = new ViewPinjam();
    ViewTampil viewTampil = new ViewTampil();
    ViewAboutUs viewAbout = new ViewAboutUs();
    ViewEdit viewEdit = new ViewEdit();
    Model modelMenu = new Model();
    Controller contMenu = new Controller(viewHome, viewPinjam, viewTampil, viewAbout, viewEdit, modelMenu);
}