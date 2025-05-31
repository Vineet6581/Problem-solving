package ARRAYS.questions;
public class q1295 {
    public static void main(String[] args) {
        int[] arr = {1,23,-3,24,32,4,34,53,53,42,3,123,12,31,3234235,345,34,63,43,4,2,342,423,53,46,457,64,5,35,34,343};
        System.out.println(findthenumber(arr));
       int odd = arr.length - findthenumber(arr);
       System.out.println(odd);
    }


    static int findthenumber(int[] arr){
        int count = 0;
        for( int element : arr){
            if(even(element))
                count++;
        }
        return count;
    }


    static boolean even(int num){
        int Totaldigits = digits(num);
        return Totaldigits % 2 == 0;
    }


    // another method to find the digits
    static int digit2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) +1;
    }


    static int digits(int num){
        int count = 0;
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
