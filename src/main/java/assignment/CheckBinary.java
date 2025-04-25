package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckBinary {
    public static boolean check(String input) {

        boolean flag = false;
        for (char ch : input.toCharArray()) {
            if (ch != '0' && ch != '1') {
               return flag ;
            }

        }
        return true;
    }
    public static void main(String[] args) {
            CheckBinary ch = new CheckBinary();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's binary: ");
        String userInput = scanner.nextLine();


        boolean result = check(userInput);
        System.out.println(result);
    }
}
