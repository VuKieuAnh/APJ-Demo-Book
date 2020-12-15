import thuvien.Book;
import thuvien.BookManger;

public class DemoMain {
    public static void main(String[] args) {

        BookManger kieuanh = new BookManger();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book books[] = new Book[20];
        Book books2[] = new Book[20];
        books[0] = book1;
        books[1] = book2;
        books[3] = book3;
        kieuanh.setBook(books);
        System.out.println(kieuanh.getSumBooks());
        books[4] = new Book();
        books2 = kieuanh.getBook();
        books2[5] = new Book();
        System.out.println(kieuanh.getSumBooks());

    }

}