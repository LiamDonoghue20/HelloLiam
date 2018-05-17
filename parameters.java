public class parameters {

    //Method that accepts String as a parameter
public static void stringMethod (String name){
    //prints the "name" variable to console
    System.out.println(name);
}
//main method
public static void main(String[] args){
    //declaring the variable "name"
    String name = "Liam";
    //assigning the string name to the method.
    stringMethod(name);
}
}
