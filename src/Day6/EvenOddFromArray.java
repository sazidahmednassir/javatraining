package Day6;

public class EvenOddFromArray {
    public static void main(String[] args){

        int c[]={2,6,7,8,9};

        for(int value:c){

            if(value%2==0){
                System.out.println("Even Number on Array "+value);
            }
            else {
                System.out.println("Odd Number on Array "+value);
            }
        }

    }
}
