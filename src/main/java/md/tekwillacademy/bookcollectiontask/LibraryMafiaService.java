package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryMafiaService {

    public static void main(String[] args) {
        Library carturestiLibrary001 = new Library("Carturesti");
        System.out.println(carturestiLibrary001.getTheNumberOfTheBooksInTheStock());

        Book prichindelBook001 = new Book("Prichindel1", "Spiridon Vangheli");
        Book prichindelBook002 = new Book("Prichindel2", "Spiridon Vangheli");
        Book prichindelBook003 = new Book("Prichindel3", "Spiridon Vangheli");

        carturestiLibrary001.addBook(prichindelBook002);
        carturestiLibrary001.addBook(prichindelBook003);
        carturestiLibrary001.addBook(prichindelBook002);
        System.out.println(carturestiLibrary001.getTheNumberOfTheBooksInTheStock());

        System.out.println(carturestiLibrary001.containsBook(prichindelBook001));
        carturestiLibrary001.printTheBookTitles();

        Library librariusLibrary002 = new Library("Librarius");

        Book poorDadRichDad001 = new Book("Poor Dad Rich Dad", "Robert K.");
        librariusLibrary002.addBook(poorDadRichDad001);
        librariusLibrary002.addBook(prichindelBook002);

        Map<String, Library> lanturiDeLibrarii = new HashMap();

        lanturiDeLibrarii.put("Str.Arborilor 4", carturestiLibrary001);
        lanturiDeLibrarii.put("Str.Stefan cel Mare 34", librariusLibrary002);

        for (Map.Entry<String, Library> dataSet : lanturiDeLibrarii.entrySet()){
            System.out.println("The key is: " + dataSet.getKey());
            System.out.println("The books are: ");
            dataSet.getValue().printTheBookTitles();
        }

    }
}
