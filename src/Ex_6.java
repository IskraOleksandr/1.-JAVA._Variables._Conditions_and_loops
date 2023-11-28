import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите количество метров:");
        int meters = scanner.nextInt();


        System.out.println("Выберите единицу измерения (1 - мили, 2 - дюймы, 3 - ярды):");
        int choice = scanner.nextInt();


        double result;

        switch (choice) {
            case 1:
                result = meters * 0.000621371;// 1 метр = 0.000621371 миль
                System.out.println("Результат: " + result + " миль");
                break;
            case 2:
                result = meters * 39.3701;// 1 метр = 0.39.3701 дюймов
                System.out.println("Результат: " + result + " дюймов");
                break;
            case 3:
                result = meters * 1.09361;// 1 метр = 1.09361 ярдов
                System.out.println("Результат: " + result + " ярдов");
                break;
            default:
                System.out.println("Ошибка: введена неверная единица измерения!");
                break;
        }

    }
}