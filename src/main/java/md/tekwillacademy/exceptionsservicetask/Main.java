package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println(TextManager.getTheTextLenght("mama"));
        System.out.println(TextManager.getTheTextLenghtWithTryAndCatch(null));
        System.out.println(TextManager.getTheTextLenght("tata"));
        System.out.println(TextManager.getTheTextLenghtWithTryAndCatch("Valeriu"));

        TextManager.readDataWithTryCatch("file.txt");

        try{
            TextManager.readDataWithoutTryAndCatch("text.txt");
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
        }
        System.out.println("Last line");
        System.out.println(ArithmeticOperationsService.divideWithExceptionHandling(10,0));
        System.out.println("The show must go on");
    }
}
