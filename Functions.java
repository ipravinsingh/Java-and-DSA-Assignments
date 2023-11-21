// // Question_1
// public class Functions {
// public static int avg(int a, int b, int c) {
// int avg = (a + b + c) / 3;
// return avg;
// }
// public static void main(String[] args) {
// System.out.println(avg(10, 10, 10));
// }
// }

// // Question_2
// import java.util.Scanner;
// public class Functions {
// public static boolean isEven(int number) {
// if (number % 2 == 0) {
// return true;
// }
// return false;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();
// if (isEven(number)) {
// System.out.println("It is a Even number");
// } else {
// System.out.println("It is a Odd number");
// }
// }
// }

// // Question_3
// import java.util.Scanner;
// public class Functions {
// public static boolean isPalindrome(int number) {
// int palindrome = number;
// int reverse = 0;
// while (palindrome != 0) {
// int remainder = palindrome % 10;
// reverse = reverse * 10 + remainder;
// palindrome = palindrome / 10;
// }
// if (number == reverse) {
// return true;
// }
// return false;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int palindrome = sc.nextInt();
// if (isPalindrome(palindrome)) {
// System.out.println("Number : " + palindrome + "is a palindrome");
// } else {
// System.out.println("Number : " + palindrome + "is not a palindrome");
// }
// }
// }

// // Question_5
// import java.util.Scanner;
// public class Functions {
// public static int sumDigit(int n) {
// int sumOfDigit = 0;
// while (n > 0) {
// int lastDigit = n % 10;
// sumOfDigit = sumOfDigit + lastDigit;
// n /= 10;
// }
// return sumOfDigit;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int digits = sc.nextInt();
// System.out.println(sumDigit(digits));
// }
// }
