package Day4;

public class Loop {

    public static void main(String[] args){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        int j=1;
        while(j<=10){
            System.out.println("Hello World");
            j++;

        }

        int k=2;
        while(k<=10){
            System.out.println("Even Numbers"+k);
            k+=2;

        }

        int l=1;
        while(l<=10){
            if(l%2==0){
                System.out.println("Even Numbers"+l);
            }
            l++;

        }

        int o=1;
        while(o<=10){
            if(o%2==0){
                System.out.println(o+" Even");
            } else{
                System.out.println(o+" ODD");
            }
            o++;

        }

        int p=10;
        while(p>0){
            System.out.println(p);
            p--;
        }
        int a=1;
        do{
            System.out.println(a);
            a++;
        }
        while(a<=10);

        for(int g=1; g<=10; g++){
            System.out.println("for loop "+g);
        }

        for (int d=2; d<=10; d+=2){
            if(d%2==0){
                System.out.println(d+" even");
            }
            else {
                System.out.println(d+" odd");
            }

        }

        int w=1;
        while(true){
            System.out.println("working");
             w++;
            if(w==10){
                break;
            }
        }

        int number=16461;
        int org_num=number;
        int rev=0;
        while(number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        if(org_num==rev){

            System.out.println(org_num+" number is a palindrome number");
        }
        else{
            System.out.println("reverse number is a "+rev);
        }

        int number_two=1234678;
        int even_count=0;
        int odd_count=0;
        int count=0;
        int sum=0;

        while (number_two>0){

            int rem=number_two%10;
            sum=sum+rem;

            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }

            number_two=number_two/10;
            count++;
        }

        System.out.println("All count numbers are "+count);
        System.out.println("Even count numbers are "+even_count);
        System.out.println("ODD count numbers are "+odd_count);
        System.out.println("Count sum of number are "+sum);




    }
}
