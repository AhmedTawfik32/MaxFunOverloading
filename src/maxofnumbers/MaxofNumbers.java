/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxofnumbers;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class MaxofNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please select the input type:\n1- Integer \n2- Double\n3- Character");

        int selectedNumber = input.nextInt();

        switch (selectedNumber) {
            case 1:
                System.out.println("Please enter the first numeber: ");
                int num1 = input.nextInt();
                System.out.println("Please enter the second numeber: ");
                int num2 = input.nextInt();
                System.out.println("The max number is: " + max(num1, num2));
                break;
            case 2:
                System.out.println("Please enter the first numeber: ");
                double dnum1 = input.nextDouble();
                System.out.println("Please enter the second numeber: ");
                double dnum2 = input.nextDouble();
                System.out.println("The max number is: " + max(dnum1, dnum2));
                break;
            case 3:
                System.out.println("Please enter the first character: ");
                char cNum1 = input.next().charAt(0);
                System.out.println("Please enter the second character: ");
                char cNum2 = input.next().charAt(0);
                System.out.println("The max number is: " + max(cNum1, cNum2));
                break;
            default:
                System.out.println("Please enter a number between 1 and 3");
        }
    }

    public static int max(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static double max(double number1, double number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static char max(char ch1, char ch2) {
        if (ch1 > ch2) {
            return ch1;
        } else {
            return ch2;
        }
    }

}
