
public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="bbaaccaadd";
		String arr[] = str.split("aa",3);
		for ( String a : arr)
		{
			System.out.println(a);
		}
	}

}
