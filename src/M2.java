import HW12.Author;
import HW12.Book;
public class M2 {
    public static void main(String[] args) {
        Author lnt =new Author("Лев", "Толстой");
        System.out.println("lnt.name= " + lnt.getName());
        System.out.println("lnt.surname= " + lnt.getSurName());
        Book lnt1 = new Book("Детство", 1853);
        System.out.println("lnt1.title= " + lnt1.getTitle());
        System.out.println("lnt1.year= " + lnt1.getYear());
        lnt1.setYear(1852);
        System.out.println("lnt1.getYear()= " + lnt1.getYear());


        Author fmd2 = new Author("Фёдор", "Достоевский");
        System.out.println("fmd2.name= " + fmd2.getName());
        System.out.println("fmd2.surname= " + fmd2.getSurName());
        Book fmd3 = new Book("Бесы", 1872);
        System.out.println("fmd3.title= " + fmd3.getTitle());
        System.out.println("fmd3.year= " + fmd3.getYear());
    }
}