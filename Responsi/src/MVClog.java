public class MVClog {

    ViewSignIn viewLogin = new ViewSignIn();
    ViewSignUp viewDaftar = new ViewSignUp();
    ModelSignIn modelLogin = new ModelSignIn();
    Controllerlog contLogin = new Controllerlog(viewLogin, viewDaftar, modelLogin);
}
