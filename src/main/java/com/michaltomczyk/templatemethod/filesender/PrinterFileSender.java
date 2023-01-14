package com.michaltomczyk.templatemethod.filesender;

import java.io.File;

public class PrinterFileSender extends FileSender {
    private Printer printer;

    public PrinterFileSender(Printer printer) {
        this.printer = printer;
    }

    @Override
    protected void establishConnection() {

    }

    @Override
    protected void sendFile(File file) {
        this.printer.print(file);
    }

    @Override
    protected void disconnect() {

    }
}
