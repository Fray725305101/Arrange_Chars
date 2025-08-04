package Arrange_Chars;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter symbols: ");
        String inputString = scanner.nextLine();
        String[] splitInputString = inputString.split(" ", 2); //Разделитель пробел, 2 части
        String leftPart = Main.arrange(splitInputString[0]);
        String rightPart = Main.arrange(splitInputString[1]);
        System.out.println(leftPart+" "+rightPart);
    }

    public static String arrange (String inputSubstr) {
        //Приводим к нижнему регистру и сразу преобразуем строку в массив символов
        //т.к. строки в Java неизменны:
        char[] inputSubstrChar = inputSubstr.toLowerCase().toCharArray();
        Arrays.sort(inputSubstrChar); //Сортируем массив символов
        return new String(inputSubstrChar); //Собираем отсортированные символы обратно в строку и сразу возвращаем
    }
}
