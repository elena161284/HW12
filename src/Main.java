import HW12.Author;
import HW12.Book;
public class Main {
    public static void main(String[] args) {
        Author fmd = new Author("Фёдор", "Достоевский");
        System.out.println("fmd.name= " + fmd.getName());
        System.out.println("fmd.surname= " + fmd.getSurName());
        Book fmd1 = new Book("идиот", 1869);
        System.out.println("fmd1.title= " + fmd1.getTitle());
        System.out.println("fmd1.year= " + fmd1.getYear());
        fmd1.setYear(1868);
        System.out.println("fmd1.getYear()= " + fmd1.getYear());
    }
}