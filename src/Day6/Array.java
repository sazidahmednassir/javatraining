package Day6;

public class Array {


    public static void main(String[] arrays){
        int a []=new int[5];

        a[0]=100;
        a[1]=200;
        a[2]=200;
        a[3]=300;
        a[4]=400;


        int b []={100, 200, 300, 400, 500};

        System.out.println(a.length);
        System.out.println(b[4]);

        for(int i=0; i<a.length; i++){
            System.out.println("a arrays value "+a[i]);
        }

        for(int x:b){
            System.out.println("b arrays value "+x);
        }

        int [][]c= new int[2][3];
        //int c[][]= new int[2][3]
        c[0][0]=400;
        c[0][1]=200;
        c[0][2]=400;
        c[1][0]=500;
        c[1][1]=800;
        c[1][2]=600;

        int d[][]={{100,200}, {200,300}, {300, 400}, {500, 600}, {700, 800}, {900,1000}};

        System.out.println("Number of rows "+d.length);
        System.out.println("Number of columns "+d[0].length);

        for(int r=0; r<=d.length-1; r++){
            for(int cl=0; cl<=d[r].length-1; cl++){
                System.out.print(d[r][cl]+" ");
            }
            System.out.println();
        }

        System.out.println("Enhancement Nested Loop code");
        for(int arr[]:d){
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        Object o[]={1, "welcome", 33.5, "c"};
        for(Object oj:o){
            System.out.println(oj);
        }
    }
}
