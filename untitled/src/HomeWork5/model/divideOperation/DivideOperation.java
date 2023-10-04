package HomeWork5.model.divideOperation;
//Операция деления, горизонтальный слой
public class DivideOperation {
    double firstArg;
    double secondArg;

    public DivideOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public double divide(){
        return firstArg/secondArg;
    }
}
