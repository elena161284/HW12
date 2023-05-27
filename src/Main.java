import HW12.Author;

import HW12.Book;

public class Main {
    public static void main(String[] args) {
        Author fmd = new Author("Фёдор","Достоевский");
        System.out.println("fmd.name= " + fmd.name);
        System.out.println("fmd.surname= " + fmd.surName);

        Book fmd1 = new Book("идиот",1868);
        System.out.println("fmd1.title= " + fmd1.title);
        System.out.println("fmd1.year= " + fmd1.year);

    }
}