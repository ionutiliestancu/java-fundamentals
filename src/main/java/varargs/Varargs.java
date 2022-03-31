package varargs;

public class Varargs {

    public static void main(String[] args) {

        //args     - arguments
        //varargs  - variables arguments ... -> definition

        displayNumbers();
        displayNumbers(1);
        displayNumbers(8,10);
        displayNumbers(787, 550, 987, 123);
        displayNumbers(222);

        displayColleaguesForPerson("Ionut", "Andrei", "Marius", "Razvan");
        displayColleaguesForPerson("Andreea", "Ioana", "Ana");
        displayColleaguesForPeople("Andreea", "Ionut");
        displayColleaguesForPeople("Andreea", "Ionut", "Razvan");
        displayColleaguesForPeople("Andreea", "Ionut", "Marius", "Razvan");
    }

    public static void displayNumbers(int... numbers) { // similar with array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number + " + numbers[i]);
        }
    }

    public static void displayColleaguesForPerson(String person, String... colleagues) {
        // if we have more than one parameters then we have to put varargs on the last position
        System.out.println("Colleagues for person: " + person + " are: ");
        for (int i = 0; i < colleagues.length; i++) {
            System.out.println(colleagues[i]);
        }
    }

    public static void displayColleaguesForPeople(String person1, String person2, String... colleagues) {
        // if we have more than one parameters then we have to put varargs on the last position
        System.out.println("Colleagues for person: " + person1 + " and person 2: " + person2 + " are: ");
        for (int i = 0; i < colleagues.length; i++) {
            System.out.println(colleagues[i]);
        }
    }


}
