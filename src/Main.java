public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000;
        double percent = 9.99;
        int time = 12;
        int payment = service.calculate(credit, (double) percent, time);

        System.out.println("Сумма кредита: " + credit + "руб.");
        System.out.println("Процентная ставка: " + percent + "%");
        System.out.println("Срок кредита: " + time + "мес.");
        System.out.println("Ежемесячный платеж: " + payment + "руб.");

        System.out.println();
        System.out.println("Сумма кредита: 1.000.000 руб.");
        System.out.println("Процентная ставка: 9.9%");
        System.out.println("Срок кредита: 24мес.");
        System.out.println("Ежемесячный платеж: " + service.calculate(credit = 1_000_000, percent = 9.99, time = 24) + "руб.");

        System.out.println();
        System.out.println("Сумма кредита: 1.000.000 руб.");
        System.out.println("Процентная ставка: 9.9%");
        System.out.println("Срок кредита: 36мес.");
        System.out.println("Ежемесячный платеж: " + service.calculate(credit = 1_000_000, percent = 9.99, time = 36) + "руб.");
        }
    }
