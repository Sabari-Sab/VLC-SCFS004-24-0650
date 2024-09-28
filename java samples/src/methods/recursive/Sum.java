package methods.recursive;

public class Sum {
    static int sum(int x) {
        if (x > 0)
            return x + sum(x - 1);
        else
            return 0;
    }

    public static void main(String[] args) {
        int res = sum(20);
        System.out.println(res);

    }
}
