package ru.mirea.inbo0219;
import java.lang.*;


public class Book {
    private int page;
    private String name;
    private String author;

    public Book(String name, String author, int page){
        this.name = name;
        this.author= author;
        this.page = page;
    }

    public Book(String name, String author){
        this.name = name;
        this.author = author;
        page = 0;
    }

    public Book(String author, int page){
        this.author = author;
        this.page = page;
        name ="Неизвестно";
    }
    public Book(){
        name = "Не задано";
        author= "Не задано";
        page = 0;
    }


    //////////


    public String getPage() {
        return " Страниц: " + page;
    }

    public String getAuthor() {
        return " Автор: "+author;
    }

    public String getName() {
        return " Название книги: "+name;
    }

    public void getAll(){
        System.out.println(" Название книги: "+name+"Автор: "+author +"Страниц: " + page);
    }
}
