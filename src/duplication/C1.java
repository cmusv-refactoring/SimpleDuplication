package duplication;

public class C1 implements C {
    private double a= 0.5;
    private double b= 1.0;

    @Override
    public double f(double y) {
        double x = y * this.a;
        return x + this.b;
    }
}
