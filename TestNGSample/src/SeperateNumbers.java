import java.util.Scanner;

public class SeperateNumbers {

	int arr[] = new int[10];
	int numrem[] = new int[10];
	int diff;
	int i = 0;
	double div;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeperateNumbers obj = new SeperateNumbers();
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			obj.separateNumbers(s,1);	
		}
		in.close();
	}

	public void separateNumbers(String s,int x) {
		int i = 0,flag=0;
		int num = Integer.parseInt(s);
		
			if (s.charAt(0) == '0') {
				System.out.println("NO");
			}
			div = Math.pow(10, x);
			int intdiv = (int) div;
			arr[0] = num / intdiv;
			numrem[0] = num % intdiv;
			num = arr[0];
	
			while (num > 0) {
				++i;
				div = Math.pow(10, x);
				arr[i] = num / intdiv;
				numrem[i] = num % intdiv;
				num = arr[i];
				diff = numrem[i - 1] - numrem[i];
	
				if (diff == 1&&num==0) 
					flag=1;
				if(diff!=1)
				{
					separateNumbers( s,++x);
				} 
	
			}
			if (flag==1){
				System.out.println("YES");}
			else{
				System.out.println("NO");}
			
	}
//	public void Calculate_SeperateNumbers(int num,int arr[],int numrem[])
//	{
//	}
	

}
