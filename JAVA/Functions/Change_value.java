package Functions;

import java.util.Arrays;

public class Change_value {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;      // if you make a change to the object via this referance variable, same object will be changed
    }
}
