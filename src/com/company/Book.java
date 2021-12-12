package com.company;

public class Book {
    public static int elder;
    public static String titleScroll;
    public String title, publishHouse, startBook, endBook;
    public int page, yearOfIssue;
    public Author author;

    public Book(String title, String publishHouse, int page, int yearOfIssue, Author author, String startBook, String endBook) {
        this.title = title;
        this.publishHouse = publishHouse;
        this.page = page;
        this.yearOfIssue = yearOfIssue;
        this.author = author;
        this.startBook = startBook;
        this.endBook = endBook;
        theElderScroll(this.yearOfIssue, this.title);
    }

    public Book(String title, int page, int yearOfIssue, Author author, String startBook, String endBook) {
        this.title = title;
        this.publishHouse = "Unknown";
        this.page = page;
        this.yearOfIssue = yearOfIssue;
        this.author = author;
        this.startBook = startBook;
        this.endBook = endBook;
        theElderScroll(this.yearOfIssue, this.title);
    }

    public String toString() {
        return "Название: " + title + "\n" + author + "Издательство: " + publishHouse + "\n" + "Год издания: " +
                yearOfIssue + "\n" + "Количество страниц: " + page + "\n";
    }

    public void theElderScroll(int yearOfIssue, String title) {
        if (elder != 0) {
            if (elder > yearOfIssue) {
                titleScroll = title;
                elder = yearOfIssue;
            }
        } else {
            titleScroll = title;
            elder = yearOfIssue;
        }
    }

    public void printBook(String title, String startBook, String endBook) {
        System.out.println("\n" + "Печать " + title);
        System.out.println(startBook);
        System.out.println("............." + "\n" + ".............");
        System.out.println(endBook);
        System.out.println("Все страницы напечатаны");
    }

    public void comparisonBook(Book book) {
        if (this.page > book.page)
            System.out.println("Книга " + "\"" + this.title + "\"" + " больше по количеству страниц чем " + "\"" + book.title + "\"");
        else
            System.out.println("Книга " + "\"" + book.title + "\"" + " больше по количеству страниц чем " + "\"" + this.title + "\"");
        if (this.yearOfIssue > book.yearOfIssue)
            System.out.println("Книга " + "\"" + book.title + "\"" + " была выпущена раньше чем " + "\"" + this.title + "\"");
        else
            System.out.println("Книга " + "\"" + this.title + "\"" + " была выпущена раньше чем " + "\"" + book.title + "\"");
    }
}
