
package tugass;

public class Segitiga extends BangunDatar{

    @Override
    public double luas(double a, double t)
    {
        double hasil= a * t/2;
        return hasil;
    }
    public double keliling(double a){
        double hasil=a+a+a;
        return hasil;
    }
    public double keliling(float a, float t)
    {
        double s = Math.sqrt( Math.pow(a/2,2) + Math.pow(t,2) );
        double hasil=a+s+s;
        return hasil;
    }
}
