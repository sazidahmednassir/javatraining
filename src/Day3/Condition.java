package Day3;

public class Condition {

    public static void main(String[] args) {

        int age=15;
        if(age>18){
            System.out.println("YOU ARE ELIGIBLE FOR THIS CONTENT");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE");
        }

        int num=30;
        if(num%2==0){
           System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        if(num>0){
            System.out.println("Positive");
        }
        else if (num<0) {
            System.out.println("Negative");

        }
        else{
            System.out.println("zero");
        }

        int a=30; int b=40; int c=70;

        if(a>b && a>c){
            System.out.println(a +" a is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b +" b is the largest number");
        }
        else{
            System.out.println(c +" c is the largest number");
        }
        int weekno=1;

        switch (weekno){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid week number");
        }

    }
}
