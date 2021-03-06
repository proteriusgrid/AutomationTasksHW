package HWLesson11.Task2;

import java.util.Objects;

public class Book implements Printable {

    private String name;

    public Book(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing book " + getName());

    }

    @Override
    public boolean equals( Object object ) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void printBooks(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Book)
                p.print();
        }


    }
}
