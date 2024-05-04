package md.tekwillacademy.exceptionsservicetask;

import java.io.BufferedReader;
import java.io.FileReader;

public class ArithmeticOperationsService {

    public static double divideWithoutExceptionHandling(int a, int b){
        return a/b;
    }
    public static double divideWithExceptionHandling(int a, int b){
        try {
            return a / b;
        } catch (ArithmeticException capturedException){
            System.out.println(capturedException.getMessage());
            return 0;
        }
    }

}
