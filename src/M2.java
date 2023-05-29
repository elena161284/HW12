import HW12.Author;
import HW12.Book;
public class M2 {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book lnt1 = new Book("Детство", author,1863);
        System.out.println(lnt1.getTitle() + " " + author.getName() + " "
                                 + author.getSurName() + " "+ lnt1.getYear());
        lnt1.setYear(1852);
        System.out.println("lnt1.getYear()= " + lnt1.getYear());

        Author author1 = new Author("Фёдор", "Достоевский");
        Book fmd3 = new Book("Бесы", author1,1871);
        System.out.println(fmd3.getTitle() + " " + author1.getName() + " "
                                 + author1.getSurName() + " "+ fmd3.getYear());
        fmd3.setYear(1872);
        System.out.println("fmd3.getYear()= " + fmd3.getYear());
        }
    }