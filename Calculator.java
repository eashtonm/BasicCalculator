public class Calculator {
  public Calculator() {

  }

  /*
  This is a basic calculator that can add, subtract, 
  multiply, divide, and perform modulo on 2 integers.
  It was created by Elizabeth Mitchell on January 7th,
  2021.
  This project will be updated in the future to handle
  possible errors and to generally improve its
  functionality.
  */

  // Addition method
  public int add(int a, int b) {
    int sum = a + b;
    return sum;
  }
  // Subtraction method
  public int subtract(int a, int b) {
    int difference = a - b;
    return difference;
  }
  // Multiplication method
  public int multiply(int a, int b) {
    int product = a * b;
    return product;
  }
  // Division method
  public double divide(double a, double b) {
    double quotient = a / b;
    return quotient;
  }
  // Modulo method
  public int modulo(int a, int b) {
    int modulus = a % b;
    return modulus;
  }

  // Main method
  public static void main(String[] args) {
    // Creating a Calculator object called myCalculator
    Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    System.out.println(myCalculator.multiply(3, 6));
    System.out.println(myCalculator.divide(10, 3));
    System.out.println(myCalculator.modulo(12, 5));

  }
}