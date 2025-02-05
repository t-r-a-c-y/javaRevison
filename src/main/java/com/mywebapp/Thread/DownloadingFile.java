package com.mywebapp.Thread;

public class DownloadingFile implements  Runnable {
    public void run() {

       for (int i = 0; i < Integer.MAX_VALUE; i++) {
           if (Thread.currentThread().isInterrupted()) {break;}
           System.out.println("This bits"+ i);
       }
        System.out.println("Its done");
    }
}
