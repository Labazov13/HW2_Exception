package org.example;

import java.util.Scanner;

public class Task4 {
    public static String enterString() throws NotEmptyStringException{
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        word = sc.nextLine();
        if(word.equals(" ") || word.isEmpty()){
            throw new NotEmptyStringException("Пустая строка не является словом.");
        }
        sc.close();
        return word;
    }
}

class NotEmptyStringException extends Exception{
    public NotEmptyStringException(String message){
        super(message);
    }
}
