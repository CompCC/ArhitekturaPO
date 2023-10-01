package HomeWork3.InterfaceSegregationPrinciple;

public class InternetPaymentService implements WebMoneyPayment, CreditCardPayment, PhoneNumberPayment{
    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payPhoneNumber() {
        //logic
    }

    @Override
    public void payWebMoney() {
        //logic
    }
}
