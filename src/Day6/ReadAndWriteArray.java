package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ReadAndWriteArray {

    public static void main(String[] args){

        int a[]=new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.println("Enter Values: ");
            a[i]=sc.nextInt();


        }

        System.out.println(Arrays.toString(a));
    }
}

