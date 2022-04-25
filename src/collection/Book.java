package collection;

import java.util.Map;
import java.util.TreeMap;

public class Book {
    private String authorName;
    private String bookName;

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public Book(String authorName, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
    }
}

class BookTreeMapImpl{
    public static void main(String[] args) {
        TreeMap<String,Book> map = new TreeMap<>();
        Book b1 = new Book("Yashwant Kantkar","Let us C");
        Book b2 = new Book("Galwin","Operating System");
        map.put("ISBN-2002",b2);
        map.put("ISBN-2001",b1);
        for (Map.Entry<String,Book> entry : map.entrySet()){
            Book book = entry.getValue();

            System.out.println("********Details of Book**********");
            System.out.println("ISBN No. "+entry.getKey());
            System.out.println("Author Name: "+book.getAuthorName());
            System.out.println("Book Name: "+book.getBookName());
            System.out.println("---------------------------------");
        }

    }
}