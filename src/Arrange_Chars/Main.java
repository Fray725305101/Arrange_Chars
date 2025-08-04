package Arrange_Chars;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbols: ");
        String inputString = scanner.nextLine();
        String[] splitInputString = inputString.split(" ", 2); //Разделитель пробел, 2 части
    }
}
