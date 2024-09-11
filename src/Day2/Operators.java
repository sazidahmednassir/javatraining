package Day2;

public class Operators {
    public static void main(String[] args) {
        int a=10;
        int b=3;
        int result=a+b;
        System.out.println("the sum is  "+result);
        System.out.println("the diff is "+(a-b));
        System.out.println("the multiplication is "+(a*b));
        System.out.println("the division is "+(a/b));
        System.out.println("the modulo division is "+(a%b));

        int x= (a>b)? b:a;
        System.out.println(x);

        // print statement
        System.out.println("Before swapping, a = " + a
                + " and b = " + b);

        a = a + b;//10+3=13
        b = a - b;//13-3=10
        a = a - b;//13-10=3

        System.out.println("After swapping, a = " + a
                + " and b = " + b);
    }
}
