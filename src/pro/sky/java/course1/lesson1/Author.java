package pro.sky.java.course1.lesson1;

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
}
