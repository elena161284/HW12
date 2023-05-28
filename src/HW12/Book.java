package HW12;

public class Book {
    private final String title;
    private final Author author, author1;;
    public int year;

    public Book (String title,Author author, Author author1, int year) {
        this.title = title;
        this.author=author;;
        this.author1=author1;
        this.year = year;
    }
    public String getTitle() {return this.title;}
    public Author getAuthor() {return this.author;}
    public Author getAuthor1() {return this.author1;}
    public int getYear() {return this.year;}

    public void setYear(int year) {this.year = year;}
}

