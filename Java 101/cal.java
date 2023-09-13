import java.util.Scanner;  // Import the Scanner class

class cal {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Calculator");
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter num A: ");
        int numA = scanner.nextInt();
        System.out.print("Enter num B: ");
        int numB = scanner.nextInt();        

        // TASK 1: Print out all different operations between the two input numbers

        // Add two numbers (+)
        System.out.println("ADD: " + Add(numA, numB));

        // Subtract two numbers (-)
        System.out.println("Subtract: " + Subtract(numA, numB));
        // Multiply two numbers (*)
         System.out.println("Multiply: " + Multiply(numA, numB));
        // Divide two numbers (/)
        System.out.println("Divide: " + Divide(numA, numB));

        // Modulo two numbers (%)
        System.out.println("Modulo: " + Modulo(numA, numB));


        scanner.close();
    }

    // Add two numbers
    public static int Add(int numA, int numB) {
        return numA + numB;
    }
    public static int Subtract(int numA, int numB) {
        return numA - numB;
    }
    public static int Multiply(int numA, int numB){
        return numA * numB;
    }
    public static int Divide(int numA, int numB) {
        return numA / numB;
    }
    public static int Modulo(int numA, int numB){
        return numA % numB;
    }
}