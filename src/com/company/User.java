package com.company;

public class User {
    public static int totalOnline = 0;

    public String name, surname, email;
    public int age;
    public Book book;

    public User(String name, String surname, int age, String email, Book book) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.book = book;
        totalOnline++;
    }

    public User(String name, String surname, int age, Book book) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = "Не указал";
        this.book = book;
        totalOnline++;
    }

    public String toString() {
        return "Пользователь: " + name + " " + surname + " сейчас читает: " + "\n" + book;
    }
}
