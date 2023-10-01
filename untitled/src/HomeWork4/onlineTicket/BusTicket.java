package HomeWork4.onlineTicket;

/**
 * Класс BusTicket определяет все методы состояния блета
 */


class BusTicket extends Ticket {
    int number;

    /**
     * Метод бронирования билета после оплаты
     *
     * @return false/true
     */
    @Override
    public boolean reserveTicket() {
        // Реализация метода
        return false;
    }

    /**
     *метод отвечает за списание денег со счета пользователя
     *
     * @return false/true
     */
    @Override
    public boolean deductFunds() {
        // Реализация метода
        return false;
    }

    /**
     * Метод подтверждает покупку билета
     *
     * @return false/true
     */
    @Override
    public boolean confirmPurchase() {
        // Реализация метода
        return false;
    }

    /**
     * Метод обновляет доступность билетов на текущий момент
     */
    @Override
    public void updateTicketAvailability() {
        // Реализация метода
    }

    /**
     * Метод определяет отмену бронирования
     *
     * @return false/true
     */
    @Override
    public boolean cancelReservation() {
        // Реализация метода
        return false;
    }
}
