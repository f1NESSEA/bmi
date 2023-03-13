public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double hight = 1.87;
        int weight = 98;
        int bmi = service.calculate(int weight, double hight);
        System.out.println(bmi);
    }
}