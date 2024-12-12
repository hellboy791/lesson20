package by.stepanenko.itacademy.lesson19;

public class LibraryTest {
    public static void main(String[] args) {

        Book book = new Book("Книга джунглей", "Киплинг");
        LibraryBook libraryBook = new LibraryBook("Дорога домой", "Зыков", 5);
        LibraryBook libraryBook2 = new LibraryBook("Онегин", "Пушкин");

        book.displayInfo();
        libraryBook.displayInfo();
        libraryBook2.displayInfo();
    }

}
