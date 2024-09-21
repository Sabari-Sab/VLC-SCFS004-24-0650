package basics;

public class StringDemo {
    public static void main(String[] args) {
        // declaring a string literal
        String name = "Alex"; // the value is always in double quotes
        String loc = "Singapore";
        name = "David"; // reassigning a value

        System.out.println(name);
        System.out.println(loc);

        // concatenate using the + operator
        System.out.println(name + " " + loc);

        /* String methods */
        // length
        System.out.println(name.length()); // 5
        System.out.println(loc.length()); // 9

        // case conversion
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // joining strings
        String temp = name.concat(loc);
        System.out.println(temp);
        // or
        System.out.println(name.concat(loc)); // same as line 26 and 27 combined

        // using the + operator to join strings
        System.out.println(name + loc);

        // charAt
        System.out.println(name.charAt(0));
        // System.out.println(name.charAt(8)); // error and exit
        System.out.println(name.charAt(4));

        // checking the equality
        System.out.println(name.equals(temp)); // false
        System.out.println(name.equalsIgnoreCase(temp)); // case ignored while checking

        // trim
        System.out.println(name.trim());

        // substring
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 3));

        // check
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());

    }
}
