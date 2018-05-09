import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class hashMapSample
{
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	int i,j;
	public void create_hashmap()
	{
		
			hmap.put(3, "Austrailia");
			hmap.put(1, "Canada");
			hmap.put(10, "America");
			hmap.put(11, "Newyork");
			hmap.put(15, "Czech");
			hmap.put(2, "Paris");
			hmap.put(9, "London");
			hmap.put(45, "Switzerland");
			hmap.put(23, "Finland");
		
	}
	public void display_hashmap()
	{
		//Set<?> set = hmap.entrySet();
		//Iterator<?> iterate = set.iterator();
		for (Map.Entry<Integer, String> mentry : hmap.entrySet())
		{
			System.out.println("The key is: "+mentry.getKey()+ " and the value is : "+mentry.getValue());
		}
	}
}
public class HashMapAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapSample objhmap = new hashMapSample();
		objhmap.create_hashmap();
		objhmap.display_hashmap();
	}

}
