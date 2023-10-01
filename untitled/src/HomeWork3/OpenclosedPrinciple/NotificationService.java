//Для того чтобы придерживаться принципа открытости-закрытости нам необходимо спроектировать наш код таким образом,
// чтобы каждый мог повторно использовать нашу функцию, просто расширив ее.
// Поэтому создадим интерфейс NotificationService и в нем поместим метод sendMessage.

package HomeWork3.OpenclosedPrinciple;

public interface NotificationService {
    public void sendMessage(String message);
}
