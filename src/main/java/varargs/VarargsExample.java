package varargs;

public class VarargsExample {

    public static void main(String[] args) {

        // varargs - allows us to have a variable number of parameters for a method
        //    |
        //    -> variable arguments (...) ~ array


        printArgs();

        System.out.println("########");
        printArgs(1);

        System.out.println("########");
        printArgs(1, 2);

        System.out.println("########");
        printArgs(1, 2, 3);

        System.out.println("########");
        printString();

        System.out.println("########");
        printString("Alex", "Andrei");

        System.out.println("########");
        printString("Alex", "Andrei", "Ion", "Gabi", "Bogdan");

        printString2("TEST", "test2", "test3", "test4", "test5");
        printString3("Today is blue monday!", 20, "arg1", "arg2");

    }


    public static void printArgs(int ... arguments) {
        for (int i = 0 ; i < arguments.length; i++) {
            System.out.println(arguments[i]);
        }
    }

    public static void printString(String ... arguments) {
        for (int i = 0; i < arguments.length ; i ++ ) {
            System.out.println(arguments[i]);
        }
    }

    public static void printString2(String somethingElse, String ... arguments) {
        System.out.println(somethingElse);
        System.out.println("++++++++++++++++");
        for (int i = 0; i < arguments.length ; i ++ ) {
            System.out.println(arguments[i]);
        }
    }

    public static void printString3(String somethingElse, int age, String ... arguments) {
        System.out.println(somethingElse);
        System.out.println("++++++++++++++++");
        System.out.println(age);
        System.out.println("++++++++++++++++");
        for (int i = 0; i < arguments.length ; i ++ ) {
            System.out.println(arguments[i]);
        }
    }
}
