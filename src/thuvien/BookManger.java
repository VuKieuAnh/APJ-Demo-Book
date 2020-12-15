package thuvien;

public class BookManger {
    private Book books[] = new Book[20];

    public Book[] getBook() {
        return books;
    }

    public void setBook(Book[] book) {
        this.books = book;
    }
    public int getSumBooks(){
        int count = 0;
        for (Book b:
             books) {
            if (b!= null) count ++;
        }
        return count;
    }
}