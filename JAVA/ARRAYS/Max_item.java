package ARRAYS;

public class Max_item {
    public static void main(String[] args) {
        int[] arr = {1,3,34,9,48};
        System.out.println(max(arr));
       int l = maxRange(arr,1,3);
        System.out.println(l);
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxvalue = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
// for range.Work on edge cases here, like array being null
 static int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxvalue = arr[start];
        for(int i = start; i <=  end; i++){
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
 }
}
