package myapp;

public class RecursionTest {

    static int print(int num){
        if(num == 0)
        return 0;
        else {
            System.out.println(num);
            return print(num-1);
        }
    }

    

    public static void main(String[] args) {
        int result = print(5);
        System.out.println(result);
        
    }

}
