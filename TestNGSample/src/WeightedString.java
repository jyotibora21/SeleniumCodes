import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeightedString {
	public int substrindex;
	public int weight = 0,flag =0 ;
	public String newstr1, newstr;
	HashMap <String,Integer>map = new HashMap<String,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.concat(" ");
        int n = in.nextInt();
        
        WeightedString obj = new WeightedString();
        obj.FindUniformSubstring(s);
        for(int a0 = 0; a0 < n; a0++)
        {
            int x = in.nextInt();
             obj.DisplayWeightedString(x);
             
        }
	}
	
	public   void FindUniformSubstring(String s) {
		// TODO Auto-generated method stub
		
		
		char c;
			
		if (s.length()>0)
		{
			 c = s.charAt(0);
			 for (int i = 1;i<s.length();i++)	
			 {
					if(c!= s.charAt(i))
					{
						substrindex =i;
						break;
					}
			 }
			 if (s.length()==1)
				 substrindex =1;
			 String newstr = s.substring(0,substrindex);
			 if (newstr.length()>1)
			 {
				 for (int j =1;j<=newstr.length();j++)
				 {
					newstr1 =  newstr.substring(0, j);
					 weight = CalculateWeight(newstr1);
					map.put(newstr1, weight);
				 }
			 }
			 else
			 {	 
				 weight = CalculateWeight(newstr);
				 map.put(newstr, weight);
			 }
			 s = s.substring(substrindex,s.length() );
			 FindUniformSubstring(s);
			 
		}
		
	}

	public  int CalculateWeight(String newstr) {
		// TODO Auto-generated method stub
		int len = newstr.length();
		int result = 0,val;
		for (int i =0;i<len;i++)
		{
			 val= (int)newstr.charAt(i);
			result = result + (val-96);
		}
		return result;
	}
	public void DisplayWeightedString(int x)
	{
		 int flag =0;
		for(Map.Entry entry:map.entrySet())
		{
			int wtcomp = (int) entry.getValue() ;
			
				if (wtcomp == x)
				{
					System.out.println("Yes");
					flag=1;
				}
				if (flag==1)
					break;		
		}
		if (flag==0)
			System.out.println("No");
		
	}

}
	