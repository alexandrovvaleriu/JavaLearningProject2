package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextManager {
    public static int getTheTextLenght(String text){
        return text.length();
    }

    public static int getTheTextLenghtWithTryAndCatch(String text){
        try{
            return text.length();
        } catch (NullPointerException exceptionObject){
            System.out.println("There is an exception: " + exceptionObject.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed each time");

        }

    }

    public static int getTheTextLenghtWithIf(String text){
        if (text == null){
            return 0;
        } else return text.length();
    }

    public static void readDataWithTryCatch(String fileName){
        try{
            FileReader fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e){
            System.out.println("Continuam executia dar afisam mesajul stocat in obiectul capturat:" + e.getMessage());
        }

        System.out.println("Filereader was created");

    }

    public static void readDataWithoutTryAndCatch(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        System.out.println("Metoda a fost executata");

    }
}
