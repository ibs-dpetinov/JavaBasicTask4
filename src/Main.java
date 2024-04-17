import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число x");
        int x = console.nextInt();
        System.out.println("Введите целое число y");
        int y = console.nextInt();
        System.out.println("Введите целое число z");
        int z = console.nextInt();
        double average = (double) (x + y + z) / 3;
        System.out.println("Среднее арифметическое равно " + average);
        int result = (int) round(average / 2);
        if (result > 3) System.out.println("Программа выполнена корректно");
    }
}