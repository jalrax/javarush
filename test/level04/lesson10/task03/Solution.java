package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        int b = Integer.parseInt(a2);
        int i = 0;
        while (i < b)
        {
            System.out.println(a1);
            i++;
        }
    }
}
