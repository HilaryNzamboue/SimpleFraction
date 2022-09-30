package fraction;

public class Fraction {
    private int a;
    private int b;
    private static final int ZERO = 0;
    private static final int UN = 1;

    public Fraction() {
    }

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        if(b == 1){
            return "La Fraction est "+ a;
        }else if (a == 0){
            return "La Fraction est null";
        }else if (b == 0){
            return "Erreur d'initialisation";
        }else
            return "La Fraction est" + a + "/" + b;
    }

    public double doubleValue(int a, int b){
        return a/b;
    }
}
