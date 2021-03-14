package com.company.package1;

public class CustomMath {
    public static int nextPrime(int number)
    {
        if(number<=2)
            return 2;
        int squareRootInt;
        int counter;
        while(true) {
            squareRootInt = (int) Math.sqrt(number);
            counter = 0;
            for (int i = 1; i<=squareRootInt; i++)
            {
                if(number%i==0)
                    counter++;
            }
            if(counter==1)
                return number;
            number++;
        }
    }
}
