package Sem5.calculatorMVC.view;


import Sem5.calculatorMVC.model.CalculationLayer;

public class ConsoleView implements IView {


    InputOutputLayer ioLayer;
    CalculationLayer calcLayer;

    public ConsoleView() {
        ioLayer = new InputOutputLayer();
        calcLayer = new CalculationLayer();
    }

    @Override
    public void runCalculator() {
        calcLayer.subtract(Double.parseDouble(ioLayer.getInput()), Double.parseDouble(ioLayer.getInput()));
    }
}
