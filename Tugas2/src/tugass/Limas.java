package tugass;

public class Limas extends Segitiga {
    private double t;
    @Override
    public double luas(double a, double t) {

        return super.luas(a, t)*getT()*2/3;

    }
    public void setT(double t){
        this.t=t;
    }
    public double getT()
    {
        return t;
    }
}