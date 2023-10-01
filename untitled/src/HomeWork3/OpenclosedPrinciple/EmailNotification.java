//Далее создадим класс EmailNotification, который имплементит интерфейс NotificationService и реализует метод отправки сообщений по электронной почте.

package HomeWork3.OpenclosedPrinciple;

public class EmailNotification implements NotificationService{

    @Override
    public void sendMessage(String message) {
        //write email
        //use JavaMailSenderAPI
    }
}
