package com.company;
import java.util.Scanner;
import com.book;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input count of books: ");
        int size = in.nextInt();
        book[] book= new book[size];
        BookArray(book);
        for (book value : book){
            System.out.println(value.toString());
        }

        PrintZaAutorom(book,in);
        PrintZaPublished(book,in);
        PrintZaYear(book,in);


    }


    static void BookArray(book[] book) {
        Random random = new Random();
        String[] mas = {"Gogol", "Franko", "Shevchenko", "Vishnya", "Gonchar", "Hviloviy", "Kostenko", "Scovoroda", "Dovgenko",
                "Kocubinsciy"};
        String[] reg = {"kazka", "son", "gimn", "balada", "zvari", "kult", "sud", "misto", "romantika"};
        String[] mas2 = {"svit", "abris", "poligraf", "dolya"};
        for (int i = 0; i < book.length; i++) {
            book[i] = new book();
            book[i].setId(random.nextInt(9999));
            book[i].setAutor(mas[random.nextInt(mas.length)]);
            book[i].setPrice(random.nextInt(50000) + 5000);
            book[i].setName(reg[random.nextInt(reg.length)] );
            book[i].setYear(random.nextInt(200) + 1800);
            book[i].setPublished(mas2[random.nextInt(mas2.length)]);
            book[i].setPage(random.nextInt(500) + 100);
        }
    }
    static void OwnBooks(Scanner in){
        int size;
        System.out.println("введіть кількість книг");
        size=in.nextInt();
        book [] book = new book [size];
        for(int i=0;i<book.length;i++) {
            book[i] = new book();
        }

        for(int i=0;i<book.length;i++){
            System.out.println("Книга "+(i+1));
            System.out.println("введіть ID");
            int id=in.nextInt();
            in.nextLine();
            System.out.println("введіть Name");
            String name = in.nextLine();
            System.out.println("введіть Autor");
            String autor = in.nextLine();
            System.out.println("введіть published");
            String published = in.nextLine();
            System.out.println("введіть price");
            float price=in.nextFloat();
            in.nextLine();
            System.out.println("введіть year");
            int year=in.nextInt();
            in.nextLine();
            System.out.println("введіть page");
            int  page=in.nextInt();
            in.nextLine();

            book[i].setId(id);
            book[i].setName(name);
            book[i].setAutor(autor);
            book[i].setPublished(published);
            book[i].setPrice(price);
            book[i].setYear(year);
            book[i].setPage(page);
        }
    }

    static void PrintZaPublished(book[] book, Scanner in){
        System.out.print("введіть видавництво за яким шукати: ");
        String published = in.nextLine();
        for (book value : book) {
            if (value.getPublished().equals(published)) {
                System.out.println(value.toString());
            }
        }
    }

    static void PrintZaAutorom(book[] book, Scanner in){
        System.out.print("введіть автора за яким шукати: ");
        in.nextLine();
        String author = in.nextLine();
        for (book value : book) {
            if (value.getAutor().equals(author)) {
                System.out.println(value.toString());
            }
        }
    }

    static void PrintZaYear(book[] book, Scanner in){
        System.out.print("введіть рік після якого шукати: ");
        int year = in.nextInt();
        for (book value : book){
            if( (value.getYear()) > year){
                System.out.println(value.toString());
            }
        }
    }
}