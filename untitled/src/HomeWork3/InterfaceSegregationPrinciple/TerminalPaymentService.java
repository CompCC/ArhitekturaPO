package HomeWork3.InterfaceSegregationPrinciple;

public class TerminalPaymentService implements WebMoneyPayment, CreditCardPayment {
    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payWebMoney() {
        //logic
    }
}
