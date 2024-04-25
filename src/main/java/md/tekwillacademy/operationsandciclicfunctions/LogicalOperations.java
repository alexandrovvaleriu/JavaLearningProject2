package md.tekwillacademy.operationsandciclicfunctions;

public class LogicalOperations {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("And Logical " + result);

        boolean result1 = a || b;
        System.out.println("Or Logical " + result1);
        System.out.println(!a);
        System.out.println(!b);
    }
}
