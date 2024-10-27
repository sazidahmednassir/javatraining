package Day7;

public class CharacterOcc {

    public static void main(String[] args){

        String s="Java is the best";

        int totalCount=s.length();
        int totallengthafterremovea=s.replaceAll("a", "").length();

        int count=totalCount -totallengthafterremovea;
        System.out.println("Number of occurances of a is "+count);

    }
}
