package myapp;

public class TowersOfHanoi {

    // Recursive function to solve the Tower of Hanoi puzzle
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        // Base case: if there's only one disk, move it directly from source to destination
        //(2,A,C,B)
        //(1,A,B,C)
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination + " This gets executed when n == 1");
            return;
        }

        // Step 1: Move the top n-1 disks from source to auxiliary using destination as a helper
        solveHanoi(n - 1, source, destination, auxiliary); // (2,A,C,B), (1,A,B,C)

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination + " This gets executed");

        // Step 3: Move the n-1 disks from auxiliary to destination using source as a helper
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks

        // Call the function with n disks, source 'A', auxiliary 'B', and destination 'C'
        solveHanoi(n, 'A', 'B', 'C');
    }
}

