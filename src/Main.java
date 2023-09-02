public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKilo = 125;
        double heightInMeters = 2.07;
        int result= service.calculate (weightInKilo,heightInMeters);
        System.out.println(result);
    }
}
