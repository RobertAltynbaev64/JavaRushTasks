package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        Cat.catsCount = catsCount;

    }

    public static void main(String[] args) {
        Cat.setCatsCount(12);
        System.out.println(Cat.catsCount);
    }
}
