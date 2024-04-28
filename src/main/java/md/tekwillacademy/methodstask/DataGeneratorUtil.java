package md.tekwillacademy.methodstask;

import java.util.Random;

public class DataGeneratorUtil {

    public static int generateRandomInt(int Limit) {
        Random random = new Random();
        return random.nextInt(Limit);
    }

    public static int generateRandomInt(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return 1;

    }
}


