import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите шестизначное число:");
        int number = scanner.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("Ошибка: введено не шестизначное число!");
            return;
        }

        int firstDigit = number / 100000;
        int secondDigit = (number / 10000) % 10;
        int thirdDigit = (number / 1000) % 10;
        int fourthDigit = (number / 100) % 10;
        int fifthDigit = (number / 10) % 10;
        int sixthDigit = number % 10;

        int newNumber = sixthDigit * 100000 + fifthDigit * 10000 + thirdDigit * 1000 +
                fourthDigit * 100 + secondDigit * 10 + firstDigit;

        System.out.println("Измененное число: " + newNumber);

    }
}