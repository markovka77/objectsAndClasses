package pro.sky.java.course1.lesson1;


import java.util.Objects;

class Book {
    String bookName;
    Author author;
    int publishareYear;

    public Book(String bookName, Author author, int publishareYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishareYear = publishareYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishareYear(){
        return this.publishareYear;
    }

    public void setPublishareYear(int publishareYear) {
        this.publishareYear = publishareYear;

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", publishareYear=" + publishareYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishareYear == book.publishareYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}
