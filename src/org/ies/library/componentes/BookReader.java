package org.ies.library.componentes;

import org.ies.library.model.Autor;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final  AuthorReader authorReader;

    public BookReader(Scanner scanner, AuthorReader authorReader) {
        this.scanner = scanner;
        this.authorReader = authorReader;
    }
   public Book read(){
        System.out.println("introduce el isbn");
        String isbn = scanner.nextLine();
       System.out.println("introduce el titulo");
       String title =scanner.nextLine();
       System.out.println("introduce el año de publicasion del libro");
       int years = scanner.nextInt();
       scanner.nextLine();
       System.out.println("cuatos autors");

       int size = scanner.nextInt();
       scanner.nextLine();
       Autor[] autors = new Autor[size];
       for (int i = 0; i < autors.length; i++) {
           autors[i]= authorReader.read();

       }
       return new Book(
               isbn,
               title,
               years,
               autors
       );
   }
}
