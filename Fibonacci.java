// Program to print Fibonacci succession by a certain number
//  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233

// Imports
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Variables
        int range = 0;
        
        // Create a new instance to read (stdin) values
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introducce un numero entero para crear la succesion de fibonacci: ");
        
        // Check if the value input is correct (integer number)
        while (range <= 0) {
            while (!scanner.hasNextInt()) {
                System.out.println("\nEl valor introduccido es incorrecto.");
                scanner.next();
                System.out.print("Introduce un numero entero valido: ");
            }
            
            range = scanner.nextInt(); // Read the value
            
            if (range <= 0) {
                System.out.println("\nEl valor introduccido tiene que ser mayor que cero.");
                System.out.print("Introduce un numero entero valido: ");
            }
        }
        
        // Fibonacci without recursion
        int[] result1 = fibonacciSuccession(range); // Store succession values in a list
        StringBuilder sb = new StringBuilder(); // Store the values in a string
        
        for (int i = 0; i < range; i++) {
            sb.append(result1[i]);
            
            if (i < result1.length - 1) {
                sb.append(", ");
            }
        }
        
        System.out.print("\nLa sucesion es: " + sb.toString());
        
        
        // Fibonacci with recursion
        System.out.print("\nLa sucesion es: ");
        
        // Calculate fibonacci succession with recursion
        for (int i = 0; i < range; i++) {
            if (i + 1 == range) {
                System.out.print(fibonacciRecursion(i));
            }
            else {
                System.out.print(fibonacciRecursion(i) + ", ");
            }
        }
        
        System.out.println("");

        // Close the scanner
        scanner.close();
    }
    
    // Calculate the fibonacci succession without recursion
    private static int[] fibonacciSuccession(int n) {
        int[] succession = new int[n];
        
        if (n > 0) succession[0] = 0;
        if (n > 1) succession[1] = 1;
        
        for (int i = 2; i < n; i++) {
            succession[i] = succession[i - 1] + succession[i - 2]; 
        }
        
        return succession;
    }
    
    // Calculate the fibonacci succession with recursion
    private static int fibonacciRecursion(int n) {
        if (n == 0) return 0;
        if (n <= 1) return 1;
        
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
