package Sem5.calculatorMVC.model.sumOperation;

public class SumOperation {
    public SumOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double sum() {
        return firstArg + secondArg;
    }
}
