package com.michaltomczyk.command.calculatorcommand;

public class MultiplyCommand implements CalculatorCommand {
    private int number;
    private Calculator calculator;
    private ComputingUnit computingUnit;

    public MultiplyCommand(int i, Calculator calculator) {
        this.number = i;
        this.calculator = calculator;
        this.computingUnit = new ComputingUnit();
    }

    @Override
    public int execute() {
        return this.computingUnit.multiply(this.calculator.getResult(), this.number);
    }

    @Override
    public int unexecute() {
        return this.computingUnit.divide(this.calculator.getResult(), this.number);
    }
}
