import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();


        int start = firstNumber, end = secondNumber;

        // Нормализуем границы диапазона
        if (firstNumber > secondNumber) {
            start = secondNumber;
            end = firstNumber;
        }

        System.out.println("Нечетные числа в указанном диапазоне:");

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}