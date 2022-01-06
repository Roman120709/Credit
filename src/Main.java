public class Main {
    public static void main(String[] args) {
        CreditPaymantService service = new CreditPaymantService();
        double monthlyPayment1 = service.calculate(1000000, 1);
        double monthlyPayment2 = service.calculate(1000000, 2);
        double monthlyPayment3 = service.calculate(1000000, 3);
        System.out.println("Ежемесячный платёж 1 ="+monthlyPayment1);
        System.out.println("Ежемесячный платёж 2 ="+monthlyPayment2);
        System.out.println("Ежемесячный платёж 3 ="+monthlyPayment3);

    }
}
