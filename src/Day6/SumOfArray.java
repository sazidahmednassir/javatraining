package Day6;

public class SumOfArray {
    public static void main(String[] args){

        int a[]={1,2,4,6,7};

        int sum=0;

        for(int i=0; i<a.length; i++){
            sum=sum+a[i];

        }
        System.out.println(sum);

        //Using Enhance loop

       // int b[]={2,5,4,6,7};
        int addition=0;

        for(int value:a){
            addition=addition+value;
        }
        System.out.println(addition);
    }
}
