import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		 int num = in.nextInt();
		 int i=0,count=0,co=0,temp=0;
		List<Integer> arr = new ArrayList<Integer>();
		 while(num>=1)
		 {
			arr.add(num%2);
			 num = num/2;
		 }
		String strBinary= arr.toString();
		//System.out.println(strBinary);
		 String [] arrbinary= strBinary.split("0");
		int [] finalarr = new int[arrbinary.length];
		for(int j=0;j<arrbinary.length;j++)
		{
			count=0;
			i=0;
			//char [] c= arrbinary[j].toCharArray();
			arrbinary[j]= arrbinary[j].replaceAll("\\W", "");	
				while(i<arrbinary[j].length()){
					finalarr[co]=++count;
					i++;
				}
			co++;
		}
		int max = finalarr[0];
		for (int k =0;k<finalarr.length;k++)
		{
			if (max<=finalarr[k])
			{
				 temp = finalarr[k];
			}
		}
		System.out.println(temp);
			 
	}
}
