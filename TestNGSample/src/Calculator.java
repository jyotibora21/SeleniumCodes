interface AdvancedArithmetic{
   int divisorSum(int n);
}
public class Calculator implements AdvancedArithmetic {

	//@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		while(i<=n)
		{
			
			int s=n%i;
			if(s == 0)
			{
			sum = sum+i;
			}
			i++;
		}
		return sum;
	}

}