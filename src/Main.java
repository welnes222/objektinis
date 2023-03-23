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

bookShelf.add(new Book("Mandarinai",211,1996));
bookShelf.add(new Book("Pavasario selsmas",444,2013));
bookShelf.add(new Book("Saulegrazu plentas",149,1987));





        for (int i = 0; i < bookShelf.size(); i++) {

            System.out.println(bookShelf.get(i).getName()  + " " + bookShelf.get(i).getPages());
        }


    }
}