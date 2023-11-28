import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Введите процент(без символа %), \nкоторый необходимо посчитать от числа: ");
        int percent = scanner.nextInt();

        int result = (number * percent) / 100;
        System.out.println("Результат: " + result);

    }
}