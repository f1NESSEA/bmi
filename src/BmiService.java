public class BmiService {
    public int calculate(int weight, double hight) {
        double bmi = weight/(hight*2);
        return (int) bmi;
    }
}