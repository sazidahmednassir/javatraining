package Day8;



public class StringPractice {

    public static void main(String[] args) {

        String s = "sazid";
        String rever = " ";

        for(int i=s.length()-1; i>=0; i--) {

            rever=rever+s.charAt(i);
        }

        System.out.println("Reverse String " + rever);


        String a = "ahmed";

        char b[] = a.toCharArray();
        String reve = " ";


        for (int l = b.length - 1; l >= 0; l--) {
            reve = reve + b[l];
        }

        System.out.println("Reverse String " + reve);

        StringBuffer bf=new StringBuffer("nassir");

        System.out.println("Reverse string are "+bf.reverse());

        StringBuilder bd=new StringBuilder("welcome");

        System.out.println("Reverse string are "+bd.reverse());
    }
}
