import java.util.Scanner;

public class blackJack {
    public static void main(String[] args){
        //sets the scanner for the text below
        Scanner intScanner = new Scanner(System.in);
        //prints out instructions to the user in the console
        System.out.println("Input your first number.");
        //reads the user input and stores it to an int
        int firstNumber = intScanner.nextInt();
        //the same for the second number
        System.out.println("Input your second number.");
        int secondNumber = intScanner.nextInt();
        System.out.println("The winner is " +blackJack(firstNumber, secondNumber));

    }
    public static int blackJack (int firstNumber, int secondNumber){
        //if both numbers are invalid, the value "0" is returned and an error message is printed to the user
        if ( firstNumber > 21 && secondNumber > 21) {
            System.out.println("Neither of these numbers are valid");
            return 0;
        }
        //if the first number is above 21, the second number value is returned to the method
        else if (firstNumber > 21){

            return secondNumber;
        }
        //if the second number is above 21, the first number value is returned to the method
        else if (secondNumber > 21){

            return firstNumber;
        }
        //if both numbers are below 21, they are subtracted from 21
        int sumA = 21 - firstNumber;
        int sumB = 21 - secondNumber;

        //if the result of subtracting the first number from 21 is higher than the result of subtracting the second number for 21, the second number is returned as the winner and vice versa
        if (sumA > sumB) {


            return secondNumber;
        } else {

            return firstNumber;

        }

    }


            }
