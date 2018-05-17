import java.util.ArrayList;
import java.util.Scanner;

public class person {
    ArrayList<person> personList = new ArrayList<person>();

    //setting variables for the "person" class
    private String name;
    private int age;
    private String jobTitle;

    //this refers to the object on which method was invoked
    //It is a reference to the object on which method was invoked
    public person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }
// Get methods used to encapsulate and make available a private field

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    //the toString method for how the data will be printed out in the console
    public String toString() {
        return "Person's name: " + this.name + " Age: " + this.age + " Job Title: " + this.jobTitle;
    }


    public static void main(String[] args) {
        //adding objects to the "person" class in the main class so they are added upon launch.
        person liam = new person("Liam", 23, "Consultant");
        person james = new person("James", 25, "Police Officer");
        person julie = new person("Julie", 38, "Developer");

        //creating an arrayList which will contain the person objects created above.
        ArrayList<person> personList = new ArrayList<person>();
        //adding each new instance of person to the arrayList.
        personList.add(liam);
        personList.add(james);
        personList.add(julie);

//a for loop to print out each person in the arrayList
        for (person person : personList) {
            System.out.println(person.toString());


        }

        //scanner for the user to input a name
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Search for a name ");
        //storing the input to a variable
        String nameToFind = inputScanner.nextLine();

        //another for loop, now using an if/else loop to check the names in the array against the one the user has input
        for (person person : personList) {
            if (person.getName().equalsIgnoreCase(nameToFind)) {
                System.out.println(person.toString());
            } else {
                System.out.println("Person not found!");
            }

        }


}
}




