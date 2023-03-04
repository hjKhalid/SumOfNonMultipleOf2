
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //creating the object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int sizeOfArray=sc.nextInt();
        int [] arr= new int[sizeOfArray];

      // taking the input in array
        for(int i=0;i<sizeOfArray;i++){
            arr[i]= sc.nextInt();
        }
      // storing  size  of arraylist non-multiple two numbers  in a variable with the help of calling the function nonPowerOfTwoNumbers
        int sizeOfNonPowerTwo=nonPowerOfTwoNumbers(arr).size();


      //output of non-multiple of 2 numbers

        System.out.println("Non-multiple of 2 numbers:"+nonPowerOfTwoNumbers(arr));

        // output of the average of non-multiple of 2 numbers

        System.out.println( "The Average of non-multiple of 2 Numbers:"+sumOfNonPowerOfTwo(nonPowerOfTwoNumbers(arr))/sizeOfNonPowerTwo);
    }
// function to find the element of input arr which is non-multiple of 2
    private static  boolean isPowerOfTwo(int num) {
      boolean a=false;

      if( num>1 && (int)(Math.ceil((Math.log(num) / Math.log(2))))

                == (int)(Math.floor(((Math.log(num) / Math.log(2)))))){
          a=true;
      }
      else{
          a=false;
      }
        return a;
    }

    // In this function storing non-multiple of 2 in a arraylist
    public static ArrayList nonPowerOfTwoNumbers(int [] nonTwoPower ){
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=0;i<nonTwoPower.length;i++) {
            if(isPowerOfTwo(nonTwoPower[i])==false){
                nums.add(nonTwoPower[i]);
            }
        }
        return nums;
    }

    // Calculating the sum of non-multiple of 2 numbers
    public static int sumOfNonPowerOfTwo(ArrayList<Integer> nums){
        int sum =0;
        for (int i=0;i<nums.size();i++){
            sum += nums.get(i);
        }
        return sum;
    }


}