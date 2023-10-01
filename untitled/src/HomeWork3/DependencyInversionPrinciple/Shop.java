//Сейчас наш магазин слабо связан с системой оплаты, то есть он зависит от абстракции и
// уже не важно каким способом оплаты будут пользоваться (наличными, картой или телефоном) все будет работать.

package HomeWork3.DependencyInversionPrinciple;

import java.math.BigDecimal;

public class Shop {
    private Payments payments;
    public Shop(Payments payments) {
        this.payments = payments;
    }
    public void doPayment(Object order, BigDecimal amount){
        payments.doTransaction(amount);

    }
}
