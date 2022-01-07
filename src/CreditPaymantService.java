public class CreditPaymantService {
    public double calculate(double creditAmount, double creditPeriod) {
        double creditPercent = 9.99;
        double cPM = creditPercent / 100 / 12; //ежемесячный кредитный процент
        double n = creditPeriod * 12; //кол-во месяцев в кредитном периоде
        double k = cPM * Math.pow((1 + cPM), n) / (Math.pow((1 + cPM), n) - 1);
        double monthlyPayment = creditAmount * k;
        return monthlyPayment;
    }
}
