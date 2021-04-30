package com.company;

public class Main {

    public static void main(String[] args) {
	    MyRunnable runnable = new MyRunnable();
	    Thread thread = new Thread(runnable);
	    thread.start();
	    while (true)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(runnable.getSpentMilliseconds()>=2000)
            {
                runnable.setNeedToStop(true);
                break;
            }
        }
    }
}
