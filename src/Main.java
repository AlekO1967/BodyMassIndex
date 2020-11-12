public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int Height = 186;
        int Weight = 10700;
        int BodyMassIndex = service.calculate(Height, Weight);
        System.out.println("Ваш индекс массы тела: " + BodyMassIndex);

    }
}
