package com.mywebapp.Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownloadingFile());
        thread.start();

        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}
