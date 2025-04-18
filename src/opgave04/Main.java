package opgave04;

import opgave04.models.Book;
import opgave04.models.Customer;

public class Main {
    public static void main(String[] args) {
        // TODO: create a salesman and a purchaser

        Book donaldDuck = new Book("Donald Duck");
        // TODO: add observers

        // TODO: make purchaser buy 6 copies of donaldDuck
        System.out.println();

        Book java = new Book("Java");
        // TODO: add observers

        // TODO: make purchaser buy 8 copies of java
        System.out.println();

        Book designPatterns = new Book("Design Patterns");
        // TODO: add observers

        // TODO: make purchaser buy 10 copies of designPatterns
        System.out.println();

        Customer bob = new Customer("Bob");
        Customer alice = new Customer("Alice");
        Customer harry = new Customer("Harry");

        //---------------------------------------------------------------------

        makeSale(donaldDuck, bob);
        System.out.println();
        makeSale(donaldDuck, alice);
        System.out.println();
        makeSale(donaldDuck, harry);
        System.out.println();

        makeSale(java, bob);
        System.out.println();
        makeSale(java, alice);
        System.out.println();
        makeSale(java, harry);
        System.out.println();

        makeSale(designPatterns, bob);
        System.out.println();

        // TODO: print each customer and his/her books
    }

    public static void makeSale(Book book, Customer customer) {
        System.out.println("Sale: " + book + " sold to " + customer.getName());
        // TODO: link customer and book
        book.decCount(1);
    }

}
