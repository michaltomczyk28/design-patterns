package com.michaltomczyk.command.calculatorcommand;

public class AddCommand implements CalculatorCommand {
    private int number;
    private Calculator calculator;
    private ComputingUnit computingUnit;

    public AddCommand(int i, Calculator calculator) {
        this.number = i;
        this.calculator = calculator;
        this.computingUnit = new ComputingUnit();
    }

    @Override
    public int execute() {
        return this.computingUnit.add(this.calculator.getResult(), this.number);
    }

    @Override
    public int unexecute() {
        return this.computingUnit.substract(this.calculator.getResult(), this.number);
    }
}
