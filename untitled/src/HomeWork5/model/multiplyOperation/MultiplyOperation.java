package HomeWork5.model.multiplyOperation;
//Операция умножения, горизонтальный слой
public class MultiplyOperation {
    double firstArg;
    double secondArg;

    public MultiplyOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public double multiply() {
        return firstArg * secondArg;
    }
}
