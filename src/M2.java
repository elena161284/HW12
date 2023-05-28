import HW12.Author;
import HW12.Book;
public class M2 {
    public static void main(String[] args) {
        Author author =new Author("Лев", "Толстой");
        Book lnt1 = new Book("Детство", author, 1853);
        System.out.println(lnt1.getTitle()+" " + author.getName()+ " "
                               + author.getSurName()+ lnt1.getYear());
        lnt1.setYear(1852);
        System.out.println("lnt1.getYear()= " + lnt1.getYear());
    }
}