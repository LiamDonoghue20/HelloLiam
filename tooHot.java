import java.util.Scanner;

public class tooHot {

    public static void main(String[] args) {
        //taking the user input for the current temp
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What is the current temperature? ");
        int currentTemp = inputScanner.nextInt();
        //taking the user input whether it is summer or not (as a boolean)
        System.out.println("It is currently summer? Please answer true or false: ");
        boolean isSummer = inputScanner.nextBoolean();
        //printing out the return boolean of the method which is further down
        System.out.println(isItTooHot(currentTemp, isSummer));

        //if the boolean "is it too hot" returns to true, it informs the user to wear sunscreen, if it returns to be false, it informs the user to wear a coat
        if (isItTooHot(currentTemp, isSummer) == true){
            System.out.println("Wear sunscreen!");
        } else if (isItTooHot(currentTemp, isSummer) == false){
            System.out.println("Wear a coat!");
        }



    }

    private static Boolean isItTooHot(int currentTemp, boolean isSummer) {
        //if the summer inputs that it is summer, the first part of the if statement is ran
        if (isSummer == true) {
            //a nested if else statement for the temperature input
            if (currentTemp > 60 && currentTemp < 100) {
                return false;
            }
            if (currentTemp > 100) {
                return true;
            } else {
                return false;
            }
        }
        //the same statement if the user pics false (with changes to the temperature limits)
        if (isSummer == false) {
            if (currentTemp > 60) {
                return true;
            } else {
                return false;
            }
        }

    return true;
    }
}

