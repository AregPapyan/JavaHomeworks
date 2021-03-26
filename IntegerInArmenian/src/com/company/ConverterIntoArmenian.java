package com.company;

import java.util.HashMap;

public class ConverterIntoArmenian {

    public ConverterIntoArmenian() {
        for(int i = 0; i < 10; i++) {
            characterStringHashMap.put(digits[i], armenianNamesOfDigits[i]);
            charStringHashMap.put(digits[i],decades[i]);
        }
    }

    private Character[] digits = {'0','1','2','3','4','5','6','7','8','9'};
    private String[] armenianNamesOfDigits = {"","մեկ","երկու","երեք","չորս","հինգ","վեց","յոթ","ութ","ինը"};
    private String[] decades = {"","տասը","քսան","երեսուն","քառասուն","հիսուն","վաթսուն","յոթանասուն","ութսուն","իննսուն"};
    private HashMap<Character, String> characterStringHashMap = new HashMap<>();
    private HashMap<Character, String> charStringHashMap = new HashMap<>();
    public  String converter(String number)
    {
        if(number.equals("0"))
            return "զրո";
        String answer = "";
        for(int i = 0; i < number.length(); i++)
        {
            int factor = (number.length()-1-i)/3;
            int residual = (number.length()-1-i)%3;
            if(number.charAt(i)!='0')
            {
                if (residual == 0)
                {
                    if (factor == 0)
                        answer += characterStringHashMap.get(number.charAt(i));
                    else if (factor == 1)
                    {
                        if(number.charAt(i)=='1')
                        {
                            if(i>1)
                            {
                                if (number.charAt(i - 2) != '0' || number.charAt(i - 1) != '0') {
                                    answer += characterStringHashMap.get(number.charAt(i));
                                    answer+=" ";
                                }
                            }
                        }
                        else {
                            answer += characterStringHashMap.get(number.charAt(i));
                            answer+=" ";
                        }
                        answer+="հազար ";
                    }
                    else if (factor == 2)
                    {
                        answer += characterStringHashMap.get(number.charAt(i));
                        answer+=" ";
                        answer+="միլիոն ";
                    }
                    else if(factor == 3)
                    {
                        answer += characterStringHashMap.get(number.charAt(i));
                        answer+=" ";
                        answer+="միլիարդ ";
                    }
                }
                else if(residual == 1)
                {
                    if(number.charAt(i+1)!='0')
                    {
                        if(number.charAt(i)=='1')
                                answer += "տասն";
                        else {
                            answer += charStringHashMap.get(number.charAt(i));
                        }
                    }
                    else
                    {
                        answer+=charStringHashMap.get(number.charAt(i));
                        answer+=" ";
                        if(factor == 1)
                        {
                            answer+="հազար ";
                        }
                        else if(factor == 2)
                        {
                            answer+="միլիոն ";
                        }
                    }
                }
                else
                {
                    if(number.charAt(i)!='1')
                    {
                        answer+=characterStringHashMap.get(number.charAt(i));
                        answer+=" ";
                    }
                    answer+="հարյուր ";
                    if(number.charAt(i+1)=='0' && number.charAt(i+2)=='0')
                    {
                        if(factor==1)
                            answer+="հազար ";
                        else if(factor==2)
                            answer+="միլիոն ";
                    }
                }
            }
        }
        return answer;
    }
}
