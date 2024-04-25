package md.tekwillacademy.operationsandciclicfunctions;

public class ComparisonOperations {
    public static void main(String[] args) {

        int a = 45;
        int b = 20;

        boolean isEqual = a == b;
        System.out.println("a == b: " + isEqual);
        boolean isNotEqual = a != b;
        System.out.println("a != b: " + isNotEqual);
        boolean isGreaterThan = a > b;
        System.out.println(isGreaterThan);
        boolean isLessThan = b < a;
        System.out.println(isLessThan);
        boolean isGreaterThanOrEqual = a >= b;
        System.out.println(isGreaterThanOrEqual);
        boolean isLessThanOrEqual = a <= b;
        System.out.println(isLessThanOrEqual);
    }
}
