public class ServiceProgram {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        int bmi = service.calculate(int weightInKg, double heightInMeters);
        System.out.println(bmi);

    }
}
