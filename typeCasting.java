
public class typeCasting {
    public static void main(String[] args) {
            // float num = input.nextFloat();
            // int num = input.nextInt();
            // System.out.println(num);
            // int num = (int)(67.78);
            // System.out.println(num);
            // int  a = 257;
            // byte b = (byte) (a); // 257%256 = 1
            // System.out.println(b);

            // byte a = 40;
            // byte b = 50;
            // byte c = 100;
            // float d = (a*b) / c;
            // System.out.println(d);

            // int number   = 'a';
            // System.out.println(number);


// java follows unicode values in which you can print any language
            // System.out.println("नमस्ते");


            // System.out.println(3*5.15);

            byte b = 42;
            char c = 'a';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = 0.1234;
            double result = (f*b)+(i/c) - (d-s);
            // float + int - double == double
            System.out.println((f * b) + " " + (i / c) + " " + (d - s));
            System.out.println(result);
    }
}
