package md.tekwillacademy.operationsandciclicfunctions;

public class AssignmentOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;

        int result = a;
        System.out.println("Atribuire " + result);

        result +=b;
        System.out.println("Atribuire cu adunare " + result);

        result -=b;
        System.out.println("Atribuire cu scadere " + result);

        result *=b;
        System.out.println(result);

        result /=a;
        System.out.println(result);

        result %=a;
        System.out.println(result);
    }
}
