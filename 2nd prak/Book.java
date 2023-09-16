import java.util.Date;

class Book {
    private String name;
    private String author;
    private Date book_writing_date = new Date();

    Book(String name, String author, Date book_writing_date) {
        this.name = name;
        this.author = author;
        this.book_writing_date = book_writing_date;
        System.out.println("[+] Book object was created");
    }

    // Book name getter
    String get_name() {
        return this.name;
    }

    // Book name setter
    void set_name(String name) {
        this.name = name;
    }

    // Book author getter
    String get_author() {
        return this.author;
    }

    // Book author setter
    void set_author(String author) {
        this.author = author;
    }

    // Book writing date getter
    Date get_writing_date() {
        return this.book_writing_date;
    }

    // Book writing date setter
    void set_writing_date(Date book_writing_date) {
        this.book_writing_date.setTime(book_writing_date.getTime());
    }

    public String toString() {
        return "Book name: " + this.name + ", author: " + this.author + ", writing date: " + this.book_writing_date;
    }
}
