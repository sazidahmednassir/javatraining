package Day7;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args){
        String s=new String("nassir");
        int i=s.length();
        System.out.println(i);

        //concat
        String s1="sazid ";
        String s2="ahmed ";
        String s3="nassir ";
        String s4="FAHIM";
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3).concat(s4));


        //trim
        s=" welcome ";
        System.out.println(s.trim());

        //charAt
        s="nassir";
        System.out.println(s.charAt(4));

        //contains
        System.out.println(s.contains(s3));


        //equals
        System.out.println(s.equals("Nassir"));
        System.out.println(s.equalsIgnoreCase("Nassir"));


        //replace
        String rp="Hello to my code";
        System.out.println(rp.replace("e", "E"));

        //substring
        String name="playwright is the best";
        System.out.println(name.substring(0,14));

        //toUppercase and toLowerCase
        String up="Welcome";
        System.out.println(up.toUpperCase());
        System.out.println(up.toLowerCase());

        //split
        String a="nassirctg@gmail.com";
        String e[]=a.split("@");
        System.out.println(e[0]);
        System.out.println(e[1]);

        String amount="$15, 20, 14";
        System.out.println(amount.replace("$", " ").replace(",", " "));

        String o="abv,xcv@gmail.com";
        String l[]= o.split(",");
        System.out.println(Arrays.toString(l));
        String r[]=l[1].split("@");
        System.out.println(Arrays.toString(r));









    }
}
