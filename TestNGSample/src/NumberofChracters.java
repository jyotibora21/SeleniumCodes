
public class NumberofChracters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam madam";
		int r = str.length() - str.replace("m", "").length();
		System.out.println(r);
	}

}
