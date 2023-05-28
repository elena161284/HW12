import HW12.Author;
import HW12.Book;
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Фёдор", "Достоевский");
        Book fmd1 = new Book("Идиот", author, 1869);
        System.out.println(fmd1.getTitle() + " " +author.getName() +" "+
                author.getSurName()+" " +fmd1.getYear());
    }
}