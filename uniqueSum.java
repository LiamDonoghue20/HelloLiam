import java.util.Scanner;

public class uniqueSum {

    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        //prints out instructions to the user in the console
        System.out.println("Input your first number: ");
        //reads the user input and stores it to an int
        int firstNumber = intScanner.nextInt();
        //the same for the second number
        System.out.println("Input your second number: ");
        int secondNumber = intScanner.nextInt();
        //lastly for the third number
        System.out.println("Input your third number: ");
        int thirdNumber = intScanner.nextInt();

        //if statement
        if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            //when non of the numbers are the same, they are all added together
            System.out.println(firstNumber + secondNumber + thirdNumber);
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber == thirdNumber) {
            //when the second number is the same as the third, only the first number is read to the console
            System.out.println(firstNumber);
        } else if (firstNumber != secondNumber && firstNumber == thirdNumber && secondNumber != thirdNumber){
            //when the first number is the same as the third, only the second number is read to the console
            System.out.println(secondNumber);
        }else if (firstNumber == secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber){
            //when the first number is the same as the second, only the third number is read to the console
            System.out.println(thirdNumber);
        }else if (firstNumber == secondNumber && firstNumber == thirdNumber && secondNumber == thirdNumber){
            //when all the numbers are the same, this error message is read to the user
            System.out.println("All of the numbers entered are the same");
        };

    }
}

