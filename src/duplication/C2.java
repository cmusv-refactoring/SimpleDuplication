package duplication;

public class C2 implements C {
    private double a= 0.5;
    private double b= 2.0;

    @Override
    public double f(double y) {
        double x = y * this.a;
        return x - this.b;
    }
}
