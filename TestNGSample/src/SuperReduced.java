import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
public class SuperReduced {

	

	    static String super_reduced_string(String s){
	        // Complete this function
	    	int count = 0 ;
	    	String temp="";
	         char a[] = s.toCharArray();
	         
	         for (int i =0;i<a.length;i++)
	         {
	        	 for( int j = i+1;j<a.length;j++)
	        	 {
	        		 if(a[i]==a[j])
	        			 count++;
	        		
	        	 }
	        	 if (count%2 != 0){
		        		temp =  temp + a[i];
	        	 }
	        	 
	         }
	         return temp;
	        /* Set<Character> reducestring = new HashSet<Character>();
	         for (int i =0;i<a.length;i++)
	        	 reducestring.add(a[i]);
	         s = reducestring.toString();*/
	       
	    }     

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = super_reduced_string(s);
	        System.out.println(result);
////	   
//	        String s = "AAAbbCCCDDD";
//	        char a[]=s.toCharArray();
//	    ArrayList<Character> al = new ArrayList<>();
//	   for (int i = 0; i < a.length; i++) {
//		
//		   al.add(a[i]);
//	}
//	        	Collections.sort(al);
//	        	
//	        	for (Iterator iterator = al.iterator(); iterator.hasNext();) {
//					Character character = (Character) iterator.next();
//					
//				}
//	        
//	        
//	    }
}}
	