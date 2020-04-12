public class MVC_praktikum {
    ViewPraktikum viewpraktikum = new ViewPraktikum();
    ModelPraktikum modelpraktikum = new ModelPraktikum();
    ControllerPraktikum controllerpraktikum = new ControllerPraktikum(modelpraktikum,viewpraktikum);
}
