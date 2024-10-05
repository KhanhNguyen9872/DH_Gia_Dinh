package com.l221402;

public class CalcApp {
    public static void main(String[] args) throws Exception {
        CalcEntity calcEntity = new CalcEntity();

        OutBoundary outputBoundary = new AddUIConsoleOutput();
        InBoundary inputBoundary = new AddUseCaseControl(calcEntity, outputBoundary);
        AddUIConsoleInput addInput = new AddUIConsoleInput(inputBoundary);
        
        ((AddUIConsoleOutput)outputBoundary).setAddInput(addInput);
        addInput.input();
    };
};
