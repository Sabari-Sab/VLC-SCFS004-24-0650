package methods.parameters;

public class Calc {
    // returns a int value
    // if the return type is anything other than void, the return statement is
    // mandatory
    // the return statement is the last statement executed in the method block
    int add(int x, int y) {
        System.out.println("in the add method");
        return x + y;
    }

    int diff(int x, int y) {
        System.out.println("in the diff method");
        return x - y;
    }

    int getRes(int a, int b, char opr) {
        int res = 0;
        if (opr == 'a')
            res = a + b;
        else if (opr == 'b')
            res = a - b;
        else if (opr == 'c')
            res = a * b;
        else if (opr == 'd')
            res = a / b;
        return res;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        int res = calc.add(10, 29);
        System.out.println(res);
        res = calc.diff(25, 15);
        System.out.println(res);

        Calc calculator = new Calc();
        res = calculator.add(30, 60);
        System.out.println(res);
        res = calculator.diff(35, 5);
        System.out.println(res);

        Calc c = new Calc();
        System.out.println(c.getRes(10, 20, 'd'));

    }
}
