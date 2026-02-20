// COMP254 Lab 3 - Exercise 1
// Code by Kadin Chawah

public class ProductRecursive {

    // this is recursive multiplication using only addition and subtraction
    public static int product(int m, int n) {
        if (n == 0)  // the base case: anything times 0 is 0
            return 0;

        return m + product(m, n - 1);
    }

    
    
    
    
    public static void main(String[] args) {

        int m = 5;
        int n = 4;

        int result = product(m, n);

        System.out.println("The product of " + m + " and " + n + " is " + result);
    }
}