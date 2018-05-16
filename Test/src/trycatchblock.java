
public class trycatchblock {

	@SuppressWarnings("finally")
	public static int trycatch()
	{
		try
		{
			//int a = 10/0;
			System.out.println("try block");
	       // if (a > 0) 
			return 0;
		}
		catch(Exception e)
		{
			System.out.println("catch block");
			return 1;
		}
		finally{
			System.out.println("Finally block");
			return 2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trycatch();
		
	}

}
