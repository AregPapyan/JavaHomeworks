package com.company;

public class MyRunnable implements Runnable{
    private int spentMilliseconds = 0;
    private boolean needToStop = false;
    public int getSpentMilliseconds() {
        return spentMilliseconds;
    }

    public void setNeedToStop(boolean needToStop) {
        this.needToStop = needToStop;
    }

    @Override
    public void run() {
        while (!needToStop) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.spentMilliseconds += 100;
        }
    }
}
