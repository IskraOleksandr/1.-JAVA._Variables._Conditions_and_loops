
import java.util.Arrays;
import java.util.Random;

public class Ex_10 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }

        // Создаем массивы для четных, нечетных, отрицательных и положительных чисел
        int[] evenArray = new int[array.length];
        int[] oddArray = new int[array.length];
        int[] negativeArray = new int[array.length];
        int[] positiveArray = new int[array.length];
        int evenIndex = 0, oddIndex = 0;
        int negativeIndex = 0, positiveIndex = 0;

        // Заполняем созданные массивы соответствующими числами из исходного массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenIndex++] = array[i];
            } else {
                oddArray[oddIndex++] = array[i];
            }

            if (array[i] < 0) {
                negativeArray[negativeIndex++] = array[i];
            } else if (array[i] > 0) {
                positiveArray[positiveIndex++] = array[i];
            }
        }

        // Выводим полученные массивы на экран
        System.out.println("\nИсходный массив:");
        System.out.println(Arrays.toString(array));

        System.out.println("\nМассив с четными числами:");
        System.out.println(Arrays.toString(evenArray));

        System.out.println("\nМассив с нечетными числами:");
        System.out.println(Arrays.toString(oddArray));

        System.out.println("\nМассив с отрицательными числами:");
        System.out.println(Arrays.toString(negativeArray));

        System.out.println("\nМассив с положительными числами:");
        System.out.println(Arrays.toString(positiveArray));
    }
}