//Метод по отправке сообщений перенести в класс NotificationService

package HomeWork3.SingleResponsibilityPrinciple;

public class NotificationService {
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
    }
}
