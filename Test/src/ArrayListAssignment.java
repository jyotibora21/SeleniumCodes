import java.util.ArrayList;
import java.util.Collections;

class NumberArrayList
{
	ArrayList<Integer> arr = new ArrayList<Integer>();
	int i,sum=0;
	public void add_ArrayList() {
		
		arr.add(10);
		arr.add(69);
		arr.add(80);
		arr.add(2);
		arr.add(100);
		System.out.println("Items added successfully");
	}
	public void display_ArrayList()
	{
		System.out.println("The elmennts in the List are: ");
		for (i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
	}
	public void max_min_ArrayList()
	{
		int total = arr.size();
	
		System.out.println("The minimum value in ArrayList : " +Collections.min(arr));
		System.out.println("The maximum value in ArrayList : " +Collections.max(arr));
	}
	public int average()
	{
		for (i=0;i<arr.size();i++)
		{
			sum = sum + arr.get(i);
		}
		return sum/arr.size();
	}
}
public class ArrayListAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intavg;
		NumberArrayList objarr = new NumberArrayList();
		objarr.add_ArrayList();
		objarr.display_ArrayList();
		objarr.max_min_ArrayList();	
		intavg = objarr.average();
		System.out.println("The average value of ArrayList : " +intavg);
	}

}
