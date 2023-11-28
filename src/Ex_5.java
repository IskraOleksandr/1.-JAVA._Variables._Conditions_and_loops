import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца:");
        int month = scanner.nextInt();
  
        if (month > 0 && month < 3 || month == 12) {
            System.out.println("Winter");
        } else if (month > 2 && month < 6) {
            System.out.println("Spring");
        } else if (month > 5 && month < 9) {
            System.out.println("Summer");
        } else if (month > 8 && month < 12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Ошибка: введен неверный номер месяца!");
        }

    }
}