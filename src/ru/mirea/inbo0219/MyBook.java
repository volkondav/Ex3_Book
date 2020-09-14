package ru.mirea.inbo0219;
import java.lang.*;

public class MyBook {
    public static void main(String[] args) {

        Book b1 = new Book("Книга, кторая изменит вашу жизнь ", "АвторКоторыйЗаработаетНаЭтом ", 50);
        Book b2 = new Book ("Как раскуртить свой TikIok ", "АвторКторыйЗаработаетНаЭтомЕщеБольше ");
        Book b3 = new Book ();

        System.out.println("В данной програме имеетяс класс Book с некоторыми параметрами и методами, ниже они будут представлены");

        System.out.println("Выведем все параметры первого объекта ");
        b1.getAll();

        System.out.println("Выведем название и автора второго объекта");
        System.out.println(b2.getName()+b2.getAuthor());

        System.out.println("Выведем автора третьего объекта");
        System.out.println(b3.getAuthor());
    }

}
