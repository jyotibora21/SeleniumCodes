import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String S = in.next();
	    try{
	        int s = Integer.parseInt(S);
	        System.out.println(s);
	    }
	    catch(NumberFormatException e){
	        System.out.println("Bad String");

	    }
	    in.close();
	}
}