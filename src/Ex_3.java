import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую цифру:");
        int digit1 = scanner.nextInt();//7

        System.out.println("Введите вторую цифру:");
        int digit2 = scanner.nextInt();//3

        System.out.println("Введите третью цифру:");
        int digit3 = scanner.nextInt();//8

        int number = digit1 * 100 + digit2 * 10 + digit3;
        // 7 * 100 = 700
        // 700 + 3= 703
        // 703 * 10= 730
        // 730 + 8 = 738
        System.out.println("Сформированное число: " + number);

    }
}