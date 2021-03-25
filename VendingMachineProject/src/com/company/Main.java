package com.company;

import com.company.snacks.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String commandLine = scanner.nextLine();
        Command command = converter(commandLine);
        ArrayList<Snack> snacks = VendingMachine.getProduct(command);
        if(snacks == null) {
            System.out.println("The row letter is incorrect");
        }
        else if(snacks.size()>0) {
            System.out.println(snacks.size());
            System.out.println(snacks);
        }
    }
    public static Command converter(String commandLine)
    {
        String [] splitCommandLine = commandLine.split(":",3);
        String type = splitCommandLine[0];
        int subType = Integer.parseInt(splitCommandLine[1]);
        int amount = Integer.parseInt(splitCommandLine[2]);
        Command command;
        if(type.equals("A"))
            command = new Command(SnackType.DRINK, subType, amount);
        else if(type.equals("B"))
            command = new Command(SnackType.CHIPS, subType, amount);
        else if(type.equals("C"))
            command = new Command(SnackType.CHOCOLATE, subType, amount);
        else
            command = null;
        return command;
    }
}
