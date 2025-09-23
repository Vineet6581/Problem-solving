import java.util.Scanner;
class pattern {
    public static void main(String[] args) {
        // write your code logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            int a = 1;
            for(int j = i; j <= n; j++){
                if(i%2==0){
                    System.out.print((char)(a+64)+" ");
                } else{
                    System.out.print(a+" ");
                }
                a++;
            }
            System.out.println();
        }
    }
}