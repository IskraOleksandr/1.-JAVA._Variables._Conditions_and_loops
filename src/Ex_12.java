import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }

        System.out.println("\nИсходный массив:");
        System.out.println(Arrays.toString(array));

        System.out.println("\n\nВыберите тип сортировки (1 - по возрастанию, 2 - по убыванию):");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 2) {
            System.out.println("Введен некорректный выбор типа сортировки.");

        } else {
            for (int i = 0; i < array.length - 1; i++) {
                // внутренний цикл прохода
                for (int j = array.length - 1; j > i; j--) {
                    if (choice == 1) {//по возростанию
                        if (array[j - 1] > array[j]) {
                            int tmp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = tmp;
                        }
                    }
                    if (choice == 2) {//по убиванию
                        if (array[j - 1] < array[j]) {
                            int tmp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = tmp;
                        }
                    }
                }

            }
            System.out.println("\nОтсортированный массив:");
            System.out.println(Arrays.toString(array));

        }
    }
}