import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение диапазона: ");
        int start = scanner.nextInt();

        System.out.print("Введите конечное значение диапазона: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println("..........................");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}