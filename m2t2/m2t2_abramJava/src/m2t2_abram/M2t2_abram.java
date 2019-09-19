/*
 * m2t2
Noah Abram
9/19/19
 */
package m2t2_abram;
import java.util.Scanner;
/**
 *
 * @author abramn7103
 */
public class M2t2_abram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ask user for name, pay rate, hours worked
    // Tell them gross pay
    
    // Declare variables
    Scanner keyboard = new Scanner(System.in);
    // Declare string name
    String name;
    // Declare Real hourlyRate
    double hourlyRate;
    // Declare Real hoursWorked
    double hoursWorked;
    // Declare Real grossPay
    double grossPay;
    
    // Ask user their name
    // Display "What is your name?"
    System.out.println("What is your name?");
    // Input name
    name = keyboard.nextLine();
    
    // Ask for their hourly rate
    // Display "How much do you get paid an hour?"
    System.out.println("How much do you get paid an hour?");
    //Input hourlyRate
     hourlyRate = keyboard.nextDouble();
    
    // Ask for their hours worked
    // Display "How many hours did you work today?"
    System.out.println("How many hours did you work today?");
    //Input hoursWorked
     hoursWorked = keyboard.nextDouble();
     
     // Calculate gross pay
     // Set grossPay = hourlyRate * hoursWorked
     grossPay = hourlyRate * hoursWorked;
     
     
     // Tell the user their gross pay
     // Display "Wow, ", name
     System.out.println("Wow,");
     System.out.println(name);
     // Display "You made $," grossPay
     System.out.println("Your gross pay is $");
     System.out.println(grossPay);
             
    }
    
            
            
    
}
