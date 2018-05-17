import java.util.Arrays;

public class iterationArrays2 {
    //main method
    public static void main(String[] args) {
    //declaring an array of integers with upto 10 values (values always start at 0 on an array so it is wrote as 11)
        int[] numbers = new int[11];

        //for loop to populate the array with upto 10 iterations
        for ( int i = 0; i < 10; i++)
        {
            //increasing each value in the array by 1
            numbers[i] = i +1;
            //printing out each incrimation of the array
            System.out.print(numbers[i] + " , ");

        }
        System.out.println("The second array is");
        for (int i:numbers){
            //multiplying each number in the "numbers" array by 10 and printing out the result

            System.out.print(numbers[i]*10 +" , ") ;
        }
    }

    }




