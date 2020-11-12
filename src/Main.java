public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BodyMassIndex = service.calculate(186, 10700);
        System.out.println("Ваш индекс массы тела: " + BodyMassIndex);

    }
}
