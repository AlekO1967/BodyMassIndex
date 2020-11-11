import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите Ваш рост в метрах: ");
        float Height = input.nextFloat();
        System.out.print("Введите Ваш вес в килограммах: ");
        int Weight = input.nextInt();
        float BodyMassIndex = Weight / (Height * Height);
        System.out.println("Ваш индекс массы тела " + BodyMassIndex);

    }
}
