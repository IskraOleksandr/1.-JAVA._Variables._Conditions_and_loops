import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину линии:");
        int length = scanner.nextInt();

        System.out.println("Введите символ из котого будет линия:");
        String symbol = scanner.next();

        System.out.println("Виберите тип линии:горизонтальная(1) или вертикальная(2)");
        int direction = scanner.nextInt();

        switch (direction) {
            case 1://horizontal
                System.out.println("Результат");
                for (int i = 0; i < length; i++) {
                    System.out.print(symbol);
                }
                break;
            case 2://vertical
                System.out.println("Результат");
                for (int i = 0; i < length; i++) {
                    System.out.println(symbol);
                }
                break;
            default:
                System.out.println("Неверное направление. Пожалуйста, выберите «горизонтальный» или «вертикальный».");
                break;
        }
    }
}