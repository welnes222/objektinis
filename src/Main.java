import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookShelf = new ArrayList<>();
        Book a = new Book();
        a.setName("Bulvių patiekalai");
        a.setPages(64);
        a.setDate(2007);

        bookShelf.add(a);

        Book b = new Book();
        b.setName("Raganius");
        b.setPages(336);
        b.setDate(2021);

        bookShelf.add(b);

        Book c = new Book();
        c.setName("Kojotai");
        c.setPages(128);
        c.setDate(2015);

        bookShelf.add(c);

        bookShelf.add(new Book("Mandarinai", 211, 1996));
        bookShelf.add(new Book("Pavasario selsmas", 444, 2013));
        bookShelf.add(new Book("Saulegrazu plentas", 149, 1987));

       // System.out.print(bookShelf);

        for (int i = 0; i < bookShelf.size(); i++) {
            System.out.println(bookShelf.get(i));
//            System.out.println(bookShelf.get(i).getName()  + " " + bookShelf.get(i).getPages());
        }

        System.out.println("-----------------------------2-------------------------");

        ArrayList<Book> garden = new ArrayList<>();

        Plant a2 = new Plant();
        a2.setName("Blakine kalendra");
        a2.setLatinName("Coriandrum sativum");
        a2.setOneYear("Vientmetis");
        a2.setGrowthRegion("Visur");
        a2.h(0.6);
        a2.edible("taip");

        garden.add(a2);

        Plant b2 = new Plant();
        b2.setName("Sosnovskio barštis");
        b2.setLatinName("Heracleum sosnowskyi");
        b2.setOneYear("Vientmetis");
        b2.setGrowthRegion("Visur");
        b2.h(5);
        b2.edible("Ne");

        garden.add(a2);

        garden.add(new Plant("bambukas","Bambugu", "one year",  ))


    }
}