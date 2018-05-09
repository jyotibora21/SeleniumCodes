
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Student {
	
	public int id;
		public String name;
		Student(String stdntname,int stdntid)
		{
			this.id = stdntid ;
			this.name = stdntname ;
		}
		public String getstudentname()
		{
			return name;
		}
		public int getstudentid()
		{
			return id;
		}
		/*Comparator for sorting the list by Student Name*/
	    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
		   String StudentName1 = s1.getstudentname().toUpperCase();
		   String StudentName2 = s2.getstudentname().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }};
	    // Comparator for Sorting the list by Student ID
	    public static Comparator<Student> StuIdComaparator = new Comparator<Student>()
	    {
	    	public int compare(Student s1, Student s2)
	    	{
				int studentId1 = s1.getstudentid();
				int studentId2 = s1.getstudentid();
	    		return studentId1-studentId2;
	    	}};
	public static void main(String[] args) {
			Student Obj1=new Student ("aaa",212);
			Student Obj2=new Student("aaaaaaaa",213);
			Student Obj3 = new Student("aaaa",214);
			Student Obj4=new Student("a",215);
			Student Obj5 = new Student("aa",216);
			Student Obj6 = new Student("aaaaaa",217);
			Student Obj7 = new Student("aaaaa",218);
			Student Obj8=new Student("aaaaaaa",219);
			List<Student> std = new ArrayList<Student>();
			std.add(Obj1);
			std.add(Obj2);
			std.add(Obj3);
			std.add(Obj4);
			std.add(Obj5);
			std.add(Obj6);
			std.add(Obj7);
			std.add(Obj8);
			
			for (Student s: std)
				System.out.println(s.id +" "+ s.name);
			/*Sorting based on Student Name*/
			   System.out.println("Student Name Sorting:");
			   Collections.sort(std, Student.StuNameComparator);

			   for(Student str: std){
					System.out.println(str.id+ " "+str.name);
					

					//Sorting Based on Student ID
			 		System.out.println("Student ID Sorting:");
			 		Collections.sort(std, Student.StuIdComaparator);
			 		for(Student str1: std)
						System.out.println(str1.id+ " "+str1.name);
			   }
			   
			  }
	}
	
		
		

	


