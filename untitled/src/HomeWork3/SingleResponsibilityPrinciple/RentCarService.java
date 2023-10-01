//Допустим у нас есть класс RentCarService и в нем есть несколько методов: найти машину по номеру, забронировать машину,
// распечатать заказ, получить информацию о машине, отправить сообщение.

//У данного класса есть несколько зон ответственности, что является нарушением первого принципа.

//И в классе RentCarService останется только один метод.
//Теперь каждый класс несет ответственность только за одну зону и есть только одна причина для его изменения.


package HomeWork3.SingleResponsibilityPrinciple;

public class RentCarService {

    public Order orderCar(String carNo, Client client) {
        //client order car
        Order order = null;
        return order;
    }

}
