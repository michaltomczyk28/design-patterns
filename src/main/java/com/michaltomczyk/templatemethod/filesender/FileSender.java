package com.michaltomczyk.templatemethod.filesender;

import java.io.File;

public abstract class FileSender {

    public void send(File file) {
        this.establishConnection();

        file = this.beforeFileSent(file);
        this.sendFile(file);
        this.afterFileSent(file);

        this.disconnect();
    }

    protected abstract void establishConnection();
    protected abstract void sendFile(File file);
    protected abstract void disconnect();

    // Hooks
    protected File beforeFileSent(File file){
        return file;
    }

    protected void afterFileSent(File file){}
}
