package Day7;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args){

        System.out.println("Enter the String");

        Scanner sc= new Scanner(System.in);

        String word=sc.nextLine();
        int count=1;

        for(int i=0; i<word.length()-1; i++){

            if((word.charAt(i)==' ') && (word.charAt(i+1)!=' ')){
               count++;
            }
        }

        System.out.println("Number of words in string "+count);
    }
}
