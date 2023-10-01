package HomeWork4.onlineTicket;

/**
 * Интерфейс, определяющий состояния покупки билета
 */

interface TicketActions {
    boolean reserveTicket();
    boolean deductFunds();
    boolean confirmPurchase();
    void updateTicketAvailability();
    boolean cancelReservation();
}