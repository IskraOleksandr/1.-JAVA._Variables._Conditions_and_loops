import java.util.Arrays;
import java.util.Random;

public class Ex_9 {
    public static void main(String[] args) {
        int[] array = new int[12];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15;
        }

        int minElement = array[0], maxElement = array[0];
        int negativeCount = 0, positiveCount = 0;
        int zeroCount = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
            if (array[i] > maxElement) {
                maxElement = array[i];
            }

            if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("\nИсходный массив:");
        System.out.println(Arrays.toString(array));

        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество нулей: " + zeroCount);
    }

}
