package com.company;

public class Main {

    public static void main(String[] args) {
        Author twain = new Author("Mark", "Twain");
        Author bradbury = new Author("Ray", "Bradbury");
        Author wells = new Author("Herbert", "Wells");
        Book sawyer = new Book("The Adventures of Tom Sawyer", "НИГМА", 280, 1876,
                twain, "Предисловие автора ...", "... об их дальнейшей жизни.");
        Book fahrenheit = new Book("Fahrenheit 451", "КАРО", 224, 1953,
                bradbury, "451° по Фаренгейту - ...", "... на них безмолвно смотрели марсиане...");
        Book machine = new Book("The Time Machine", "Penguin Book Ltd.", 128,1895,
                wells, "Путешественник по времени ...", "... благодарность и нежность продолжают жить в сердцах.");
        User mercury = new User("Freddy", "Mercury", 45, "mercury@icloud.com", fahrenheit);
        User morrison = new User("Jim", "Morrison", 27, "morrison@gmail.com", machine);
        User cobain = new User("Kurt", "Cobain", 27, "cobain@yandex.ru", sawyer);
        System.out.println(mercury);
        System.out.println(morrison);
        System.out.println(cobain);
        System.out.println("Самая древняя книга: " + Book.titleScroll);
        System.out.println("год издания " + Book.elder + "\n");
        System.out.println("Всего пользователей в сети " + User.totalOnline);
        sawyer.printBook(sawyer.title, sawyer.startBook, sawyer.endBook);
        fahrenheit.printBook(fahrenheit.title, fahrenheit.startBook, fahrenheit.endBook);
        machine.printBook(machine.title, machine.startBook, machine.endBook);
        sawyer.comparisonBook(fahrenheit);
        sawyer.comparisonBook(machine);
        fahrenheit.comparisonBook(machine);

    }
}
