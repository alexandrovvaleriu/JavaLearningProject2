package md.tekwillacademy.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {

        int testResult = 70;

        if (testResult >= 90) {
            System.out.println("Calificativ A");
        } else if (testResult >= 80) {
            System.out.println("Calificativ B");
        } else if (testResult >= 70) {
            System.out.println("Calificativ C");
        } else {
            System.out.println("Asa calificativ nu exista");
        }
        System.out.println("Programul s-a terminat");
    }
}
