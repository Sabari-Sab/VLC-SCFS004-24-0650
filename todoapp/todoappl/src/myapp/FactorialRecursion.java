package myapp;

public class FactorialRecursion {

    static long factorial(long num){
        if(num == 0 || num == 1){
            return 1;
        } else {
            return num*factorial(num-1);
        }
    }

    public static void main(String[] args) {
        
        long result = factorial(10);
        System.out.println("===============");
        System.out.println(result);
    }

}
