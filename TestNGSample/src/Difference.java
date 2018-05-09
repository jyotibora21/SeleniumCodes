import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Difference {
	//private int[] elements;
  	public int maximumDifference;
  	public int[] arr;
  	int co =0;
  	Set ele = new HashSet();
  
  	 
	public Difference( int[] a) {
		// TODO Auto-generated constructor stub
		arr= a;
	}

	
	public void computeDifference() {
		// TODO Auto-generated method stub
		for (int i =0;i<arr.length;i++)
		{
			for(int k=1;k<arr.length;k++)
			{
				ele.add(Math.abs(arr[i]-arr[k]));
				
				}
			
		}
		//ele.
		Iterator iter = ele.iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next());}
	}

}
