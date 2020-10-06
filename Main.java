import java.util.Scanner;

/**
 * Creates multiplication table for a number
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user for an integer
    System.out.println("Please enter an integer to create a multiplication table for");

    // declare a variable to store the users number
    int userNum = input.nextInt();

    //create a for loop and declare a variable to multiply the users number by
    for(int multiply = 1; multiply <= 12; multiply++){

      //declare a variable for the product of the users number and the multiply variable
      int product = multiply*userNum;
      
      //print out the statement
      System.out.println(multiply + " x " + userNum + " = " + product);
    }
    
  }
}
