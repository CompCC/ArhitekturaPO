package HomeWork4.onlineTicket;

import java.util.Date;

/**
 * Интерфейс, определяющий действия пользователя.
 */
interface UserActions {
    boolean authorize();
    boolean selectRoute();
    boolean checkTicketAvailability();
    boolean checkFunds();
}