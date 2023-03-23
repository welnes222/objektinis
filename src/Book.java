public class Book {
    private String name;
    private int pages;
    private int date;

    public Book (){

    }

    public Book(String name, int pages, int date) {
        this.name = name;
        this.pages = pages;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }

@Override
    public String toString(){
        return ("knyga " + name + " turi puslapiu " + pages + " parasyta " + date);

}

}

