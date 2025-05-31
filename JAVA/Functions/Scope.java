package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Shikhar";
        swap(a , b);
        System.out.println(a + " "+ b);
        {
            // block scope
            a = 70; // the value is already initialised so you can not initialised it again but you can change the value.
            // reassign the original reference variable to some other value
            System.out.println(a);
            int c = 90;
            name = "Vineet";
            System.out.println(name);
            // value initialised in this block, will remain in block
        }
        System.out.println(a);
        System.out.println(name);
 //           System.out.print(c); // this will give me an error bcs this value cannot be used outside the block
        // this c value is only for this block so it can only used inside this block outside the block it can not be considered
        // scope in for loops
        for (int i = 1; i <= 4; i++){
            System.out.println(i);
            int num = 90;
        }
 //       System.out.println(num); this will give me an error bcs the value of num is initialised inside the block of for loop
    }
    static void swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    } // this change will only be valid in this function scope only.
}
// in primitive data types the value has been passed but the original value will not change.
// but in non-primitive data types the value has been passed by the reference variable and the original value will be changed (e.g Arrays)


// anything that is initialised outside the can be used inside the block but anything that initialise inside the block cannot be used outside the block
// similarly anything that is initialised outside the block cannot be again initialised inside the block while anything that is initialised inside a block can be initialised again outside the block.
