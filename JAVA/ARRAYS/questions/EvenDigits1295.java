package ARRAYS.questions;

public class EvenDigits1295 {
    public static void main(String[] args) {
        int[] arr = {1,23,5455,654,65632,6};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num))
                count++;
        }
        return count;
    }
    // function to check whether a number contains even digits or not
    static boolean even(int num){
            int numberofdigits = digits(num);
      /*
            if(numberofdigits % 2 == 0)
                return true;
            return false;
            */
        return numberofdigits % 2 == 0;

    }
    // count number of digits in a number
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
