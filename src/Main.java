public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 186;
        int weight = 10700;
        int bodymassindex = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела: " + bodymassindex);

    }
}
