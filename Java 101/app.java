import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
