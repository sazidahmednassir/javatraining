package Day6;

import java.util.HashSet;

public class SearchArray {

    public static void main(String[] args){

        int a[]={1,2,4,6,30,7,30};
        int search_element=30;
        boolean status=false;

        //HashSet<Integer> uniqueValues = new HashSet<>();

        for(int i:a){

//            if(uniqueValues.contains(i)){
//                continue;
//            }
//
//
//            uniqueValues.add(i);
//
//            System.out.println(uniqueValues);

            if(i==search_element){

                System.out.println("Element Found");
                status=true;
                break;
            }
        }

        if(status==false){
            System.out.println("Element not Found");
        }



    }
}
