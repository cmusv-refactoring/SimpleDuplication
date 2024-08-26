import duplication.C;
import duplication.C1;
import duplication.C2;

public class Main {
    public static void main(String[] args) {
        double input = 3;

        C c = new C1();
        System.out.println("C1 (2) -> " + c.f(input));

        c = new C2();
        System.out.println("C2 (2) -> " + c.f(input));
    }
}