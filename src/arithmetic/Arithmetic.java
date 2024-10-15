/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase arithmeticBase = new ArithmeticBase();
        Scanner scanner = new Scanner(System.in);

        // Get the first number
        System.out.println("Enter the first number:");
        double x = scanner.nextDouble();

        // Get the second number
        System.out.println("Enter the second number:");
        double y = scanner.nextDouble();

        // Get the arithmetic operation
        System.out.println("Enter the operation (PLUS, MINUS, TIMES, DIVIDE):");
        Operation operation = Operation.valueOf(scanner.next().toUpperCase());

        // Perform the calculation and display the result
        double result = arithmeticBase.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}