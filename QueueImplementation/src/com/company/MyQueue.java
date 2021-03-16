package com.company;

public class MyQueue implements MyQueueInterface{
    private int[] array = new int[0];
    @Override
    public void add(int element) {
        int [] copiedArray = new int[array.length+1];
        for(int i = 0; i< array.length;i++)
            copiedArray[i]=array[i];
        copiedArray[array.length]=element;
        array=copiedArray;
    }

    @Override
    public int peek() {
        if(array.length==0) {
            System.out.println("There is no elements");
            return 0;
        }
        return array[array.length-1];
    }

    @Override
    public int poll() {
        if(array.length==0) {
            System.out.println("There is no elements");
            return 0;
        }
        int lastElement = array[array.length-1];
        int[] copiedArray = new int[array.length-1];
        for (int i = 0;i< array.length-1;i++)
            copiedArray[i]=array[i];
        array=copiedArray;
        return lastElement;
    }
    public void print()
    {
        for (int i=0;i< array.length;i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
