
import java.util.*;

/**
 * This calculates the average of values which are not the power of two.
 * @Author Khalid Hussain
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        creating the object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int sizeOfArray = sc.nextInt();
        int [] arr = new int[sizeOfArray];

//        taking the input in array
        for(int i = 0; i < sizeOfArray; i++) {
            arr[i]= sc.nextInt();
        }

        /**
         *
         * Storing size  of arraylist non-multiple two numbers  in a variable
         * with the help of calling the
         * function nonPowerOfTwoNumbers
         */
        int modifiedArrSize = buildArray(arr).size();
//      output of non-multiple of 2 numbers
        System.out.println("Non-power of 2 numbers:" + buildArray(arr));

//      output of the average of non-multiple of 2 numbers
        System.out.println( "The Average of non-Power of 2 Numbers:" + sumOfModifiedArr(buildArray(arr)) / modifiedArrSize);
    }

    /**
     * This method returns boolean based on whether the num is powerOfTwo
     * @param num
     * @return
     * @throws Exception
     */
    private static boolean isPowerOfTwo(int num) throws Exception {
        boolean temp = false;
        try
        {
            float val  = (float) (Math.log(num) / Math.log(2));
            if(num>1 && ( (int) (Math.ceil(val)) == (int) (Math.floor((val))) ) ) {
                temp = true;
            }
        }
        catch (Exception e)
        {
           throw new Exception("Cannot calculate log(0) ", e);
        }
        return temp;
    }

    /**
     * The method will store the numbers which are not
     * the power the 2.
     * @param nonTwoPower
     * @return
     */
    private static ArrayList buildArray(int [] nonTwoPower ) throws Exception {
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < nonTwoPower.length; i++) {
            if(!isPowerOfTwo(nonTwoPower[i])) {
                nums.add(nonTwoPower[i]);
            }
        }
        return nums;
    }

    /**
     * To add the modified Array which contains values excluding num^2.
     * @param nums
     * @return
     */
    private static int sumOfModifiedArr(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }
}