// COMP254 Lab 3 - Exercise 2
// Code by Kadin Chawah

import java.util.Scanner;

public class Palindrome {

	
    // a recursive palindrome checker
    public static boolean isPalindrome(String s) {

        if (s.length() <= 1)  // the base case: empty or single character
            return true;

        if (s.charAt(0) != s.charAt(s.length() - 1))  // the first and last letters must match
            return false;

        return isPalindrome(s.substring(1, s.length() - 1));  // recur on inner substring
    }

    
    
    
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        if (isPalindrome(userInput))
            System.out.println(userInput + " is a palindrome.");
        else
            System.out.println(userInput + " is NOT a palindrome.");

        input.close();
    }
}