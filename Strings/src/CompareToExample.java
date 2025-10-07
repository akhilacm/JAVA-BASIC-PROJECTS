import java.util.Arrays;

public class CompareToExample {

    public void operations(){

        String str1 = "apple";
        String str2 = "bannana";
        String str3 = "mango";
        String str4 = "Apple";
        String str5 = "apple";
        String str6 = "apple pie";
        String str7 = "appo";
        System.out.println("comapare two string in lexicographical order and return int value..............");
        System.out.println("comparing "+str1+" and "+str2+" : "+lexicographicalOrderCheck(str1, str2));
        System.out.println("comparing "+str1+" and "+str3+" : "+lexicographicalOrderCheck(str1, str3));

        // ASCII value of 'a' is 97 and 'A' is 65, so comparing "apple" and "Apple" returns 97-65=32
        System.out.println("comparing "+str1+" and "+str4+" : "+lexicographicalOrderCheck(str1, str4));

        System.out.println("comparing "+str1+" and "+str5+" : "+lexicographicalOrderCheck(str1, str5));

        // Java's String.compareTo compares characters lexicographically; when one string is an exact prefix
        // of the other it returns s1.length() − s2.length(),
        // so "apple" (length 5) vs "apple pie" (length 9) yields 5 − 9 = −4 (negative means s1 < s2).
        System.out.println("comparing "+str1+" and "+str6+" : "+lexicographicalOrderCheck(str1, str6));

        System.out.println("comparing "+str1+" and "+str7+" : "+lexicographicalOrderCheck(str1, str7));

    }

     public int lexicographicalOrderCheck(String s1, String s2){
        return s1.compareTo(s2);
    }
}
