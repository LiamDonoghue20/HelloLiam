public class arrays {
    //main method
    public static void main(String[] args) {
        //prints out the returned variable of the sum method


        //for loop that loops through the result of "checkZeroForSum" result 10 times

        //declaring array of Integers
        int arrayOfInts [] = {1,5,4,2,21,43,55,0,22,10};

        for (int i: arrayOfInts){

            System.out.println(checkForZeroOrSum(i,i));
        }

    }



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




