package fraction;

public class Fraction {
    private int a;
    private int b;

    public Fraction() {
    }

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Fraction{" + a +"/"+ b +
                "=" + a/b +
                '}';
    }
}
