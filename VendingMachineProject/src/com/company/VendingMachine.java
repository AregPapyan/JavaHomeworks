package com.company;

import com.company.snacks.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class VendingMachine {
    private static HashMap<SnackType, ArrayList<LinkedList<Snack>>> hashMap;
    public static void helper()
    {
        hashMap = new HashMap<>();
        ArrayList<LinkedList<Snack>> arrayList = new ArrayList<>();
        LinkedList<Snack> snacks = new LinkedList<>();
        for(int i = 0; i<10; i++)
            snacks.add(new Cola());
        arrayList.add(snacks);
        snacks = new LinkedList<>();
        for(int i = 0; i<10; i++)
            snacks.add(new Fanta());
        arrayList.add(snacks);
        snacks = new LinkedList<>();
        for(int i = 0; i < 10; i++)
            snacks.add(new Sprite());
        arrayList.add(snacks);
        hashMap.put(SnackType.DRINK, arrayList);
        arrayList = new ArrayList<>();
        snacks = new LinkedList<>();
        for(int i = 0; i<10; i++)
            snacks.add(new Lays());
        arrayList.add(snacks);
        snacks = new LinkedList<>();
        for(int i = 0; i<10; i++)
            snacks.add(new Doritos());
        arrayList.add(snacks);
        snacks = new LinkedList<>();
        for(int i = 0; i<10; i++)
            snacks.add(new Pringles());
        arrayList.add(snacks);
        hashMap.put(SnackType.CHIPS, arrayList);
        arrayList = new ArrayList<>();
        snacks = new LinkedList<>();
        for(int i = 0; i<10; i++)
            snacks.add(new Snickers());
        arrayList.add(snacks);
        snacks = new LinkedList<>();
        for(int i = 0; i<10; i++)
            snacks.add(new Mars());
        arrayList.add(snacks);
        snacks = new LinkedList<>();
        for(int i = 0; i<10; i++)
            snacks.add(new Bounty());
        arrayList.add(snacks);
        hashMap.put(SnackType.CHOCOLATE, arrayList);
    }
    public static ArrayList<Snack> getProduct(Command command)
    {
        if(command == null)
            return null;
        ArrayList<Snack> snacks = new ArrayList<>();
        helper();
        if(command.getSubType()>=1 && command.getSubType()<=3) {
            if (command.getAmount() <= hashMap.get(command.getSnackType()).get(command.getSubType() - 1).size()) {
                for (int i = 0; i < command.getAmount(); i++)
                    snacks.add(hashMap.get(command.getSnackType()).get(command.getSubType() - 1).poll());
            } else
                System.out.println("The amount of snacks is less than the required amount");
        }
        else
            System.out.println("The column number is out of bounds");
        return snacks;
    }
}
