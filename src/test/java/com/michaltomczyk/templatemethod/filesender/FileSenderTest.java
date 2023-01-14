package com.michaltomczyk.templatemethod.filesender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class FileSenderTest {
    File file;

    @BeforeEach
    public void setUp(){
        this.file = new File("test.txt");
    }

    @Test
    public void shouldSendFileToAPrinter(){
        Printer printer = mock(Printer.class);
        FileSender fileSender = new PrinterFileSender(printer);

        fileSender.send(this.file);

        Mockito.verify(printer, times(1)).print(this.file);
    }

    @Test
    public void shouldSendFileToASmartphone(){
        Smartphone smartphone = mock(Smartphone.class);
        FileSender fileSender = new SmartphoneFileSender(smartphone);

        fileSender.send(this.file);

        Mockito.verify(smartphone, times(1)).receiveFile(this.file);
    }
}
