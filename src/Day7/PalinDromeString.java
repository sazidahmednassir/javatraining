package Day7;

import java.util.Scanner;

public class PalinDromeString {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text");
        String str=sc.next();
        String org_str=str;
        String reverse="";

        char b[] = str.toCharArray();

        for (int l = b.length - 1; l >= 0; l--) {
            reverse = reverse + b[l];
        }

        System.out.println("reverse "+reverse);
        if(org_str.equals(reverse)){

            System.out.println("Text is Palindrome");
        }
        else{

            System.out.println("Text is not Palindrome");
        }

    }
}
