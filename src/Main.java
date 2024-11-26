import org.ies.library.componentes.AuthorReader;
import org.ies.library.componentes.BookReader;
import org.ies.library.componentes.LibraryReader;
import org.ies.library.model.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorReader authorReader = new AuthorReader(scanner);
        BookReader bookReader = new BookReader(scanner, authorReader);
        LibraryReader libraryReader = new LibraryReader(scanner, bookReader);

        Biblioteca biblioteca = libraryReader.read();
        System.out.println(biblioteca);
    }


}
