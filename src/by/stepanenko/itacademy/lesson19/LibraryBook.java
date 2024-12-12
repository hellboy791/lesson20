package by.stepanenko.itacademy.lesson19;

public class LibraryBook extends Book {
    protected int shelfNumber;

    public LibraryBook(String title, String author, int shelfNumber){
        super(title, author);
        this.shelfNumber = shelfNumber;
    }

    public LibraryBook(String title, String author){
        this(title, author, -1);
    }

    @Override
    public void displayInfo(){
        System.out.println("Книга " + this.title + ", автор " + author + ", номер полки: " + shelfNumber);
    }
}
