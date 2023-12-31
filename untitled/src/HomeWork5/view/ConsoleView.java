package HomeWork5.view;


import HomeWork5.model.CalculationLayer;

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
