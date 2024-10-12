package Day6;

public class FindMaxMin {

    public static void main(String[] args){

        int a[]={2,4,5,6};

        int max=a[0];
        int min=a[0];

        for(int i=1; i<a.length; i++){

            if(a[i]>max){
                max=a[i];
            }
            else{
                min=a[i];
            }

        }
        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);
    }


}
