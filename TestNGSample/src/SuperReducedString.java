
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SuperReducedString {

    public static void main(String[] args) {
           String s = "aaabccddd";
        char a[]=s.toCharArray();
        LinkedHashSet<Character> ar = new LinkedHashSet<>();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
           ar.add(a[i]);
        }
        System.out.println(ar);
        String finalop="";
        
         
         
         for (Character character : ar) {
           count =0;
           for (int i = 0; i < a.length; i++) {
               if (character==a[i]) {
                   count++;
               }
           }
           if (count%2!=0||count==1) {
               finalop=finalop+character;
               System.out.println(finalop);
        }
           
        }

        
         
           
    }

}

