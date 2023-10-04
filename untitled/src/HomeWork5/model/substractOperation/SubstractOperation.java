package HomeWork5.model.substractOperation;
//Операция вычитания, горизонтальный слой
public class SubstractOperation {
    public SubstractOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double subtract() {
        return firstArg - secondArg;
    }
}
