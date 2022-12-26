package com.michaltomczyk.command.calculatorcommand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorCommandTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        this.calculator = new Calculator();
        this.calculator.setNumber(5);
    }

    @Test
    public void shouldExecuteAddCommand() {
        calculator.setCommand(new AddCommand(4, calculator));
        Assertions.assertEquals(9, calculator.getResult());
    }

    @Test
    public void shouldUnexecuteAddCommand() {
        calculator.setCommand(new AddCommand(4, calculator));
        calculator.undo();

        Assertions.assertEquals(5, calculator.getResult());
    }

    @Test
    public void shouldExecuteMultiplyCommand() {
        calculator.setCommand(new MultiplyCommand(4, calculator));
        Assertions.assertEquals(20, calculator.getResult());
    }

    @Test
    public void shouldUnexecuteMultiplyCommand() {
        calculator.setCommand(new MultiplyCommand(4, calculator));
        calculator.undo();

        Assertions.assertEquals(5, calculator.getResult());
    }

    @Test
    public void shouldPerformComplexOperations(){
        calculator.setCommand(new MultiplyCommand(4, calculator));
        calculator.setCommand(new AddCommand(5, calculator));
        calculator.setCommand(new MultiplyCommand(4, calculator));

        Assertions.assertEquals(100, calculator.getResult());

        calculator.undo();
        Assertions.assertEquals(25, calculator.getResult());

        calculator.undo();
        Assertions.assertEquals(20, calculator.getResult());

        calculator.undo();
        Assertions.assertEquals(5, calculator.getResult());
    }

}
