package pro.sky.java.course1.lesson1;

import java.util.Objects;

class Author {
    String name;
    String lastName;



    public Author(String name,String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }

     @Override
     public String toString() {
         return "Author{" +
                 "name='" + name + '\'' +
                 ", lastName='" + lastName + '\'' +
                 '}';
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
