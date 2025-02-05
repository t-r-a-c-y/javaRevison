package com.mywebapp.Thread;

public class DownloadingFile implements  Runnable {
    public void run() {
        System.out.println("DownloadingFile" + Thread.currentThread().getId());
    }
}
