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
            return "La Fraction est " + a + "/" + b;
    }

    public double doubleValue(){
        return (double)this.getA()/(double)this.getB();
    }

    public int pgcd(int a, int b){
        int r = a%b;
        while (r != 0){
            r = a%b;
            a = b;
            if (r!=0)
                b = r;
        }
        return b;
    }

    public Fraction add(Fraction f){
        Fraction fraction = new Fraction();
        if (f.getB() == this.getB()){
            fraction.setA(f.getA() + this.getA());
            fraction.setB(f.getB());
        }else {
            fraction.setA((f.getA()*this.getB()) + (this.getA()*f.getB()));
            fraction.setB(f.getB()*this.getB());
        }

        int pgcd = pgcd(fraction.getA(), fraction.getB());
        fraction.setA(fraction.getA()/pgcd);
        fraction.setB(fraction.getB()/pgcd);

         return fraction;
    }

    public Fraction reduce(Fraction f){
        int pgcd = pgcd(f.getA(), f.getB());
        f.setA(f.getA()/pgcd);
        f.setB(f.getB()/pgcd);
        return f;
    }

    public boolean egalite(Fraction f1, Fraction f2){
        f1 = reduce(f1);
        f2 = reduce(f2);
        if (f1.getA() == f2.getA() && f1.getB() == f2.getB())
            return true;
        else
            return false;
    }

    public String compareTo(Fraction f1, Fraction f2){
        if (f1.doubleValue() == f2.doubleValue())
            return f1 + " = " + f2;
        else if (f1.doubleValue() < f2.doubleValue())
            return f1 + " < " + f2;
        else
            return f1 + " > " + f2;
    }
}
