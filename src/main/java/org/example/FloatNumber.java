package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatNumber {
    public static float enterFloat(){
        float num = 0;
        System.out.println("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        try{
            num = sc.nextFloat();
        }
        catch (Exception e){
            System.out.println("Некорректный ввод данных. Попробуйте еще раз: ");
            num = enterFloat();
        }
        sc.close();
        return num;
    }

    public static float returnFloat(float num){
        return num;
    }
}
