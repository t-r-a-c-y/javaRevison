package com.mywebapp.Thread;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread thread = null;
        for (int i = 0; i < 10; i++) {
            thread = new Thread(new DownloadingFile());
            thread.start();
        }
        thread.join();
        System.out.println("REady to scan");
    }
}
