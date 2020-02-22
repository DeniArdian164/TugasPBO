package tugass;

public class LimasJajargenjang extends Jajargenjang {
    private double t;
    @Override
    public double luas(double a, double t) {

        return super.luas(a, t)*getT()*1/3;

    }
    public double luas(float a, float t) {

        return super.luas(a, t)*getT()*1/3;

    }
    public void setT(double t){
        this.t=t;
    }
    public double getT()
    {
        return t;
    }
}
