import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String password = in.next();
        int answer = minimumNumber( password);
        System.out.println(answer);
        in.close();
	}

	public static int minimumNumber( String password) {
		// TODO Auto-generated method stub
		int min_number = 0,count=0,min_digit=0,min_uppercase=0,min_lowercase=0,min_special=0;
		 int len = password.length();
		if (len <6)
		{
			count = 6 - len;
			return count;
		}	
		else
		{
			for(int j =0;j<len;j++)
			 {
				Character ch = password.charAt(j);
				if(Character.isDigit(ch))
					min_digit ++;
				else if (Character.isLowerCase(ch))
					min_lowercase ++;
				else if (Character.isUpperCase(ch))
					min_uppercase ++;
				else if (ch>57 && ch<65||ch>=33&&ch<=47)
					min_special ++;
			 }
			if (min_digit==0)
				count++;
			else if (min_lowercase==0)
				count++;
			else if (min_uppercase==0)
				count++;
			else if (min_special==0)
				count++;
			return count;
		}	
		
	}

}
