package org.ies.library.componentes;

import org.ies.library.model.Biblioteca;
import org.ies.library.model.Book;

import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }
    public Biblioteca read(){
        System.out.println("introduce el nombre dela biblioteca");
        String name = scanner.nextLine();
        System.out.println(" cuantos  libros");

        int size =scanner.nextInt();
        scanner.nextLine();
        Book[] books =new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i]=bookReader.read();
        }
        return new Biblioteca(
                name,
                books
        );

    }
}
