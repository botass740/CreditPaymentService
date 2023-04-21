public class CreditPaymentService {
    public int calculate (int credit, double percent, int time) {
        //double ps = (double) Math.pow(1 + (percent / 12 / 100), time);
        double result;
        //result = (double) (credit * (percent / time / 100) * ps / (ps - 1));
        result = (double) (credit * (percent / 12 / 100) * (Math.pow(1 + (percent / 12 / 100),time))) / ((Math.pow(1 + (percent / 12 / 100),time)) - 1);
        return (int) result;
    }
}

