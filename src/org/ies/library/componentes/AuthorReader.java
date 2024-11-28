package org.ies.library.componentes;

import org.ies.library.model.Autor;

import java.util.Scanner;

public class AuthorReader {
    private final Scanner scanner;

    public AuthorReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Autor read (){
        System.out.println(" introduce los datos del autor");
        System.out.println("Introduce el NIF");
        String nif = scanner.nextLine();
        System.out.println("intrduce el nombre");
        String name = scanner.nextLine();
        System.out.println("introduce el apellido");
        String surname =scanner.nextLine();
        return new Autor(
                nif,
                name,
                surname
        );
    }
}
