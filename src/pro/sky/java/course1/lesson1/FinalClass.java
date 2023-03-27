package pro.sky.java.course1.lesson1;


class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author esenin = new Author("Сергей", "Есенин");

        Book oFishman = new Book("О рыбаке и рыбке", pushkin, 1833);
        Book ispoved = new Book("Исповедь хулигана", esenin, 1920);


        System.out.println(oFishman.getBookName() + " " + pushkin.getName()+" "+pushkin.getLastName() + " " + oFishman.getPublishareYear());
        System.out.println(ispoved.getBookName()+" "+ esenin.getName()+" "+ esenin.getLastName()+ " "+ ispoved.getPublishareYear());
        ispoved.setPublishareYear(2023);
        System.out.println(ispoved.getBookName()+" "+ esenin.getName()+" "+ esenin.getLastName()+ " "+ ispoved.getPublishareYear());

        System.out.println();
        System.out.println(oFishman);
        System.out.println(ispoved);
    }


}
