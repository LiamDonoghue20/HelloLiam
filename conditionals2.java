public class conditionals2 {
    //main method
    public static void main(String[] args) {
        //prints out the returned variable of the sum method
        System.out.println(sum());

    }

    //creating the sum method
    public static int sum (){
    //declaring the 2 int variables
    int number1 = 3;
    int number2 = 4;
    //declaring the boolean
    boolean trueOrFalse = true;

    //if/else statement
        if(number1 ==0  ){
            System.out.println("The number that isnt 0 is: "+number2);

        }
        else if(number2 ==0  ){
            System.out.println("The number that isnt 0 is: "+number1);

        }
        else {
            System.out.println("None of the numbers are 0");
        }
        if( trueOrFalse ) {

            int result = number1 + number2;
            return result;
        }
        else {
            int result = number1 * number2;
            return result;

        }

    //returning the result


    }



}
