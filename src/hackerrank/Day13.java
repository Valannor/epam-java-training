package hackerrank;

import java.util.Scanner;

public class Day13
{
    abstract static class Book
    {
        String title;
        String author;

        Book(String title, String author)
        {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    // Declare your class here. Do not use the 'public' access modifier.
    static class MyBook extends Book
    {
        // Declare the price instance variable
        int price;

        /**
         * Class Constructor
         *
         * @param title  The book's title.
         * @param author The book's author.
         * @param price  The book's price.
         **/
        // Write your constructor here
        public MyBook(String title, String author, int price)
        {
            super(title, author);
            this.price = price;
        }

        /**
         * Method Name: display
         * <p>
         * Print the title, author, and price in the specified format.
         **/
        // Write your method here
        public void display()
        {
            System.out.println("Title: " + title +
                    "\r\nAuthor: " + author +
                    "\r\nPrice: " + price);
        }

// End class
    }

    public static class Solution
    {

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.close();

            Book book = new MyBook(title, author, price);
            book.display();
        }
    }
}
