// import java.util.Scanner;  // Import the Scanner class

// welcome to adv cal
// Enter num a, enter num b 
// prompts to ask which operation 
// print result 
//

import java.util.Scanner;

class advcal {

    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter num A: ");
        int numA = scanner.nextInt();
        System.out.print("Enter num B: ");
        int numB = scanner.nextInt();
        System.out.println("Enter preferred operation");
        scanner.nextLine();
        String operation = scanner.nextLine();
        switch (operation) {
            case :
                System.out.println("Result: " + (numA + numB));
                break;
            case "subtraction":
                System.out.println(("Result: " + (numA - numB)));
                break;
            case "multiplication":
                System.out.println(("Result: " + (numA * numB)));
                break;
            case "division":
                System.out.println(("Result: " + (numA / numB)));
                break;
            case "modulo":
                System.out.println(("Result: " + (numA % numB)));
                break;
            default:
                System.out.println("Enter a valid operation");
        }
        scanner.close();

    }
}

