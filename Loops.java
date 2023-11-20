// // Question_2
// import java.util.Scanner;
// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;
// do {
// System.out.println("Enter the number");
// number = sc.nextInt();
// if (number % 2 == 0) {
// evenSum = evenSum + number;
// } else {
// oddSum = oddSum + number;
// }
// System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
// choice = sc.nextInt();
// } while (choice == 1);
// System.out.println("Sum of even numbers: " + evenSum);
// System.out.println("Sum of odd numbers: " + oddSum);
// }
// }

// // Question_3
// import java.util.Scanner;
// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num;
// int fact = 1;
// System.out.println("Enter any positive integer: ");
// num = sc.nextInt();
// for (int i = 1; i <= num; i++) {
// fact = fact * i;
// }
// System.out.println("Factorial: " + fact);
// }
// }

// // Question_4
// import java.util.Scanner;
// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number");
// int n = sc.nextInt();
// for (int i = 1; i <= 10; i++) {
// System.out.println(n + " * " + i + " = " + n * i);
// }
// }
// }