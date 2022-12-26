package com.michaltomczyk.command.calculatorcommand;

import java.util.ArrayList;

public class Calculator {
    private int result = 0;
    private ArrayList<CalculatorCommand> commands = new ArrayList<>();

    public void setNumber(int i) {
        this.result = i;
    }

    public void setCommand(CalculatorCommand command) {
        this.commands.add(command);
        this.result = command.execute();
    }

    public int getResult() {
        return this.result;
    }

    public void undo() {
        CalculatorCommand lastCommand = this.commands.remove(this.commands.size() - 1);
        this.result = lastCommand.unexecute();
    }
}
