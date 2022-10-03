import fraction.Fraction;

public class Main {

    public static void main(String[] args) {
        Fraction f = new Fraction();

        //Declarations des constantes
        Fraction ZERO = new Fraction(0, 1);
        Fraction UN = new Fraction(1, 1);

        Fraction fraction = new Fraction(20, 2);
        System.out.println("Bonjour");
        System.out.println(fraction);

        //Consultation de la valeur sous la forme d'un nombre en virgule flottante
        Fraction x = new Fraction(1, 2);
        System.out.println(x + " = " + x.doubleValue());

        //Addition de deux fractions
        Fraction y = new  Fraction(2, 5);
        System.out.println(x + "+" + y + " = " + x.add(y));

        Fraction z = new Fraction(3, 2);
        System.out.println(x + "+" + z + " = " + x.add(z));

        //Egalité entre fractions
        Fraction z1 = new Fraction(9, 6);
        System.out.println(f.egalite(x, y));
        System.out.println(f.egalite(z, z1));

        //Comparaison des fractions selon l'ordre naturel
        System.out.println(f.compareTo(x, y));

    }
}
