package ARRAYS;
import java.util.Scanner;
import java.util.ArrayList;
public class Array_List_Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        System.out.println(list.contains(4));
//        System.out.println(list);
//        System.out.print("updated list: ");
//        list.set(0, 99);
//        System.out.println(list);
//        System.out.print("updated list after remove index: ");
//        list.remove(1);
//        System.out.println(list);


        // taking input using for loop
        for(int i = 0; i < 5; i++){
            list.add(input.nextInt());
        }


        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i)); // pass index here, list[index syntax will not work
        }
        System.out.println("another method:");
        System.out.println(list);

    }
}
