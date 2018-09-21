package com.semeneh.week1challenge;

/*the program takes an input number from the user
* and then checks weather the input number is prime or not
* */
import java.util.Scanner;

public class WeekOneClass {
    public static void main(String[] args) {
        System.out.println("\nWelcome To Prime Number Checking !!!!");

        Scanner input = new Scanner(System.in);
        System.out.println("PLease Enter a number to be Checked for You !");
        // input a number to be checked
        int number = input.nextInt();

        //a method to check Weather the number is a prime or not
        checkPrimeNumber(number);
    }


    private static void checkPrimeNumber(int number) {

        for (int i = 1; i <= number; i++) {
            int count = 2;
            boolean isPrime = true;

            if (i == 1) {
                isPrime = false;     // 1 isnot prime number
            }
           else if (i == 2) {
                isPrime = true;      // 2 is prime number
            }
            else {

                while (count < i) {
                    // this checks if it can find one more factor between 2 and the number
                    if (i % count == 0) {
                        isPrime = false;
                        break;     // when the condition is met it will break
                    } else {
                        isPrime = true;
                    }

                    count++;
                }
            }

            if (isPrime) {          //isPrime is true if it doesn't have any factor except 1 and itself
                System.out.println(i + " is a prime number !");
            } else {
                System.out.println(i + " is not a prime number !");    // if it has a factor between 1 and the number itself
            }
        }
    }
}

