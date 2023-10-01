//И наш класс SalaryAccount уже унаследуем от класса PaymentAccount.

package HomeWork3.LiskovsubstitutionPrinciple;

import java.math.BigDecimal;

public class SalaryAccount extends PaymentAccount {
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        BigDecimal bigDecimal = null;
        return bigDecimal;
    };
    @Override
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
    @Override
    public void payment(String numberAccount, BigDecimal sum){
        //logic
    }
}
