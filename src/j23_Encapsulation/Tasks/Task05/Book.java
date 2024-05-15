package j23_Encapsulation.Tasks.Task05;

public class Book {//outher Class level
    private String bookName;
    private String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return
               "Book name is " + bookName +
               " and Author is " + authorName ;
    }
}//outher class sonu

class BookRunner {//inner Class level

    public static void main(String[] args) {
        Book b1 = new Book("Crime and Punishment","Fyodor Dostoevsky");
        System.out.println(b1);

    }
}//inner class sonu
































