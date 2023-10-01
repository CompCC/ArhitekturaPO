//Аналогично работа связанная с поиском информации о машине перенести в класс CarInfoService.

package HomeWork3.SingleResponsibilityPrinciple;

public class CarInfoService {
    public void getCarInterestInfo(String carType) {
        if (carType.equals("sedan")) {
            //do some job
        }
        if (carType.equals("pickup")) {
            //do some job
        }
        if (carType.equals("van")) {
            //do some job
        }
    }
}
