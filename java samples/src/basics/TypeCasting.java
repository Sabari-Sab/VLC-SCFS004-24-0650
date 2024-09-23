package basics;

public class TypeCasting {
    public static void main(String[] args) {
        /*
         * Widening (safe)
         * byte → short → int → long → float → double
         * are implicit
         */
        int num = 10;
        double d = num;
        System.out.println(d);

        /*
         * Narrowing (unsafe):
         * double → float → long → int → short → byte
         * have to be manually done
         */
        double dob = 9.87;
        int n = (int) dob; // explicitly casted
        System.out.println(n);
    }
}
