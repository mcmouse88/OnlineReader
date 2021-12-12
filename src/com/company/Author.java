package com.company;

public class Author {
    public String name, surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Автор книги: " + name + " " + surname + "\n";
    }
}
