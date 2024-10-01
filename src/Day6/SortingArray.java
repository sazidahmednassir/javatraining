package Day6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingArray {

    public static void main(String[] args){

        int a[]={ 5,2,1,3, 4};

        System.out.println("Before Storing"+Arrays.toString(a));

        int n=a.length;

        for(int i=0; i<n-1; i++){
//            System.out.println("i"+a[i]);

            for(int j=0; j<n-1; j++){

                if(a[j]>a[j+1]){

                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
//                    System.out.println("j"+a[j]);
                }

            }
        }
        System.out.println("After Storing"+Arrays.toString(a));

        //another approach
        int b[]={ 9,2,1,3, 4};
        Arrays.parallelSort(b);
        System.out.println("After Storing"+Arrays.toString(b));

       //another approach
        int c[]={ 10,20,1,3, 4};
        Arrays.sort(c);
        System.out.println("After Storing"+Arrays.toString(c));

        //reverse
        Integer d[]={50,33,60,23};
        Arrays.sort(d, Collections.reverseOrder());
        System.out.println("After Storing"+Arrays.toString(d));

    }


}
