package md.tekwillacademy.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "Miercuri";

        System.out.println(dayName);
        switch (dayName) {
            case "Luni":
                dayNumber = 1;
            case "Marti":
                dayNumber = 2;
            case "Miercuri":
                dayNumber = 3;
            case "Joi":
                dayNumber = 4;
            default:
                dayNumber = 0;
                System.out.println("Ati introdus o zi care nu exista");
        }
        System.out.println("Numarul zilei " + dayName + "este " + dayNumber);
    }
}
