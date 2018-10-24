import java.util.Scanner;
import java.lang.Math;
public class SciCalculator {
    public static void main(String[] args) {
        // this is a new comment or lab 06
        // Variables declared for operands and response
        double operand1;
        double operand2;
        double output = 0.0;
        double totalOutput = 0;
        int numCalculations = 0;
        double avgCaclculations = 0;

        //Scanner for user input
        Scanner newscanner = new Scanner(System.in);
        int response = 1;

        //Calculator Menu

        System.out.println("Current Result: " + output + "\n");
        while (response != 0)
        {
            if (response != 7)
            {
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average" + "\n");
            }

        System.out.print("Enter Menu Selection: ");
        response = newscanner.nextInt();
        System.out.println();


        if (response == 0)
        {
            System.out.println("Thanks for using this calculator. Goodbye!");
        }
        else if (response < 7 && response >0)
        {
            //Accepts user input for operands
            System.out.print("Enter first operand: ");
            operand1 = newscanner.nextDouble();
            System.out.print("Enter second operand: ");
            operand2 = newscanner.nextDouble();
            System.out.println();

            switch (response)
            {
                case 1:
                {
                    output = operand1 + operand2;
                    System.out.println("Current Result: " + output + "\n");
                    totalOutput = totalOutput + output;
                    numCalculations++;
                    break;
                }

                case 2:
                {
                    output = operand1 - operand2;
                    System.out.println("Current Result: " + output + "\n");
                    totalOutput = totalOutput + output;
                    numCalculations++;
                    break;
                }

                case 3:
                {
                    output = operand1*operand2;
                    System.out.println("Current Result: " + output + "\n");
                    totalOutput = totalOutput + output;
                    numCalculations++;
                    break;
                }

                case 4:
                {
                    output = operand1/operand2;
                    System.out.println("Current Result: " + output + "\n");
                    totalOutput = totalOutput + output;
                    numCalculations++;
                    break;
                }

                case 5:
                {
                    output = Math.pow(operand1, operand2);
                    System.out.println("Current Result: " + output + "\n");
                    totalOutput = totalOutput + output;
                    numCalculations++;
                    break;
                }

                case 6:
                {
                    output = Math.log(operand2)/Math.log(operand1);
                    System.out.println("Current Result: " + output + "\n");
                    totalOutput = totalOutput + output;
                    numCalculations++;
                    break;
                }
            }
        }
        else if (response == 7)
        {

            if (numCalculations == 0)
            {
                System.out.println("Error: No calculations yet to average!" + "\n");
            }
            else
                {
                    System.out.println("Sum of calculations: " + totalOutput);
                    System.out.println("Number of calculations: " + numCalculations);
                    System.out.print("Average of calculations: ");
                    System.out.printf("%.2f", totalOutput/numCalculations);
                    System.out.println("\n");
                }
        }
        else
        {
            System.out.println("Error: Invalid selection!" + "\n");
            response = 7;
        }
        }


    }
}
