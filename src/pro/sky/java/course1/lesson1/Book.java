package pro.sky.java.course1.lesson1;

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

    public int getPublishareYear(){
        return this.publishareYear;
    }

    public void setPublishareYear(int publishareYear) {
        this.publishareYear = publishareYear;

    }

}
