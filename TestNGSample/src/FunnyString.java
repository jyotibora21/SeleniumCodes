import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 0;i<num;i++)
		{
			str = in.next();
			funnyString(str);
		}
	}

	public static void funnyString(String str) {
		// TODO Auto-generated method stub
		String str1 = str.toLowerCase();
		int length = str1.length();
		String temp ="";
		int flag =0 ;
		for(int i = length-1;i>=0;i--)
		{
			temp = temp + str1.charAt(i);
		}
		
		for(int j=0;j<length-1;j++)
		{
			int oridiff = Math.abs(str1.charAt(j+1)-str1.charAt(j));
			int revdiff = Math.abs(temp.charAt(j+1)-temp.charAt(j))	;	
			if (oridiff!=revdiff) 
			{
				System.out.println("Not Funny");
				flag =1;
				break;
			}
		}
		if (flag ==0)
			System.out.println("Funny");
	}

}
