package polymorphism;

// Java program for Method Overloading
// by Using Different Numbers of Arguments

// Class 1
// Helper class
class Helper_ex {

    // Method 1
    // Multiplication of 2 numbers
    static int Multiply(int a, int b) {

        // Return product
        return a * b;
    }

    // Method 2
    // // Multiplication of 3 numbers
    static int Multiply(int a, int b, int c) {

        // Return product
        return a * b * c;
    }
}

// Class 2
// Main class
public class CompileTimePolymorphism2 {

    // Main driver method
    public static void main(String[] args) {

        // Calling method by passing
        // input as in arguments
        System.out.println(Helper_ex.Multiply(2, 4));
        System.out.println(Helper_ex.Multiply(2, 7, 3));
    }
}
