public class BmiService {

    public int calculate(int Height, int Weight) {
        int BodyMassIndex = Weight * 100 / (Height * Height);
        return BodyMassIndex;
    }
}






