public class iteration {
    //main method
    public static void main(String[] args) {
        //prints out the returned variable of the sum method
        System.out.println(sum());

        //for loop that loops through the result of "checkZeroForSum" result 10 times
        for (int i = 0; i < 10; i++){
            System.out.println(checkForZeroOrSum(i,0));
        }

    }

    //creating the sum method
    public static int sum (){
    //declaring the 2 int variables
    int number1 = 3;
    int number2 = 4;
    //declaring the boolean
    boolean trueOrFalse = true;


        if( trueOrFalse ) {
            //if the boolean is true the two numbers are added together
            int result = number1 + number2;
            return result;
        }
        else {
            //if the boolean is false they are multiplied
            int result = number1 * number2;
            return result;

        }}

        //int that takes the two integers are parameters
        private static int checkForZeroOrSum (int number1, int number2){

            int finalInt;
            // checks to see which number is 0 and then returns the one that isnt
            if (number1 ==0){
                return number2;
            }
            else if (number2 ==0 ){
                return number1;
        } else {
                //if neither number is 0 they are added together and the result is returned
                finalInt = number1 + number2;
                return finalInt;
            }
    }





    }




