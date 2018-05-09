interface Hospital
{
	
	void Display_Treatment();
	int  No_of_Doctors();
	
}
 class Sancheti implements Hospital
{
	public void Display_Treatment()
	{
		System.out.println("Treatment provided for Neurology");
	}
	public int No_of_Doctors()
	{
		return 10;
	}
}
class Columbia implements Hospital
{
	public void Display_Treatment()
	{
		System.out.println("Treatment provided for Cardiology");
	}
	public int No_of_Doctors()
	{
		return 20;
	}
}
 class RubyHall implements Hospital
{
	public void Display_Treatment()
	{
		System.out.println("Treatment provided for Pathology");
	}
	public int No_of_Doctors()
	{
		return 30;
	}
}
public class InterfaceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sancheti objs =new Sancheti();
		objs.Display_Treatment();
		System.out.println("The Number of Doctors in Sancheti: " +objs.No_of_Doctors());
		Columbia objc = new Columbia();
		objc.Display_Treatment();
		System.out.println("The Number of Doctors in Columbia: "+ objc.No_of_Doctors());
		RubyHall objr = new RubyHall();
		objr.Display_Treatment();
		System.out.println("The Number of Doctors in RubyHall: "+ objr.No_of_Doctors());
	 
	}

}
