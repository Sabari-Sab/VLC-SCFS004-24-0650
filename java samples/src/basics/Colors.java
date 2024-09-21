package basics;

public class Colors {
    public static void main(String[] args) {
        System.out.println("\u001B[30m" + "This is Black text" + "\u001B[0m");
        System.out.println("\u001B[31m" + "This is red text" + "\u001B[0m");
        System.out.println("\u001B[32m" + "This is Green text" + "\u001B[0m");
        System.out.println("\u001B[33m" + "This is Yellow text" + "\u001B[0m");
        System.out.println("\u001B[34m" + "This is Blue text" + "\u001B[0m");
        System.out.println("\u001B[35m" + "This is Purple text" + "\u001B[0m");
        System.out.println("\u001B[36m" + "This is Cyan text" + "\u001B[0m");
        System.out.println("\u001B[37m" + "This is White text" + "\u001B[0m");

        System.out.println("\u001B[1m" + "This is Bold text" + "\u001B[0m");
        System.out.println("\u001B[3m" + "This is Italic text" + "\u001B[0m");
        System.out.println("\u001B[4m" + "This is Underline text" + "\u001B[0m");
        System.out.println("\u001B[5m" + "This is Blink text" + "\u001B[0m");
        System.out.println("\u001B[6m" + "This is Rapid Blink text" + "\u001B[0m");

        System.out.println("\u001B[40m" + "This is text with Black Background " + "\u001B[0m");
        System.out.println("\u001B[41m" + "This is text with Red Background " + "\u001B[0m");
        System.out.println("\u001B[42m" + "This is text with Green Background " + "\u001B[0m");
        System.out.println("\u001B[43m" + "This is text with Yellow Background " + "\u001B[0m");
        System.out.println("\u001B[44m" + "This is text with Blue Background " + "\u001B[0m");
        System.out.println("\u001B[45m" + "This is text with Purple Background " + "\u001B[0m");
        System.out.println("\u001B[46m" + "This is text with Cyan Background " + "\u001B[0m");
        System.out.println("\u001B[47m" + "This is text with White Background " + "\u001B[0m");

        System.out.println("\u001B[37m" + "\u001B[40m" + "This is White text with Black Background" + "\u001B[0m");
        System.out.println("\u001B[30m" + "\u001B[47m" + "This is Black text with White Background" + "\u001B[0m");
    }
}
