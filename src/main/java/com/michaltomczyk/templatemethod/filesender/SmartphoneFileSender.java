package com.michaltomczyk.templatemethod.filesender;

import java.io.File;

public class SmartphoneFileSender extends FileSender {
    private Smartphone smartphone;

    public SmartphoneFileSender(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    protected void establishConnection() {

    }

    @Override
    protected void sendFile(File file) {
        this.smartphone.receiveFile(file);
    }

    @Override
    protected void disconnect() {

    }
}
