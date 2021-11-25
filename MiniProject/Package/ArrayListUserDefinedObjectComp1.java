import java.util.*;
//class Student
class Student //implements Comparable<Student>  // Interface  Comparable<T>
 //comparision and implementation of interface
{
	int roll;
	int marks;
	int age;
	
	Student(int roll, int marks, int age)
	{
	this.roll=roll;
	this.marks=marks;
	this.age=age;
	}
	
	public String toString()
	{
		//Student [roll no =1, marks=75, age=21]
		String str= "Student [ roll = "+ roll+ ", marks = "+marks+", age = "+age+ "]";
		return str;
	}
	 
	/* //public boolean equals(Student obj) // overloading equals() method still it will give false
	public boolean equals(Object obj)  //overriding equals() method
	{
		Student s=(Student)obj;   //type casting of Object class to student class
		if(obj == null) return false;
		if (this.roll==s.roll && this.marks==s.marks && this.age==s.age)
			return true;
		else
			return false;
	}  
	
	public int hashcode()
	{
		return (roll*marks*age);  
		//if we do (roll+marks+age) it may generate same because of values
		//to generate different hashcode for different object
	}
	public int compareTo(Student s) //for using collects.sort() method 1
	//this witten for sorting & roll base comparision
	{
		//It is interpretation 
		//return 0 when equal
		//return -1 when less elements
		//return 1 when greater
			
		if(this.roll==s.roll)
			return 0;
		else if(this.roll<s.roll)
			return -1;
		else           //(this.roll>s1.roll)
			return 1;			

		//return (s1.roll - s2.roll); 
	} */
}
// Interface Comparator<T>
class  StudentAgeComparator implements Comparator<Student> // for using collects.sort() method 2
{
	public int compare(Student s1, Student s2)
	{
		if(s1.age < s2.age)
			return -1;
		else if(s1.age > s2.age)
			return 1;
		else          
			return 0;
		
		//W can write this instead of above code
		//return (s1.age - s2.age);
	}
}

class  StudentMarkseComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.marks < s2.marks)
			return -1;
		else if(s1.marks > s2.marks)
			return 1;
		else          
			return 0;
		
		//return (s1.marks - s2.marks);
	}
}

class ArrayListUserDefinedObjectComp1
{
	static void display(Collection<?> c)
	{
		if(c==null) return;
		for(Object obj: c)
		{
			System.out.println(obj); 
		}
	}
	public static void main(String args[])
	{
		//List<String> list1= new ArrayList<String>(); //for reference
		
		List<Student> list1= new ArrayList<Student>();
		
		/* Student s1=new Student(1,75,21); //obj
		list1.add(s1); */ 
		
		//add();
		list1.add(new Student(2,65,19));
		list1.add(new Student(3,87,20));
		list1.add(new Student(4,65,22));
		list1.add(new Student(5,57,23));
		
		System.out.println("list1 after adding 5 students");
		display(list1);
		
		/* //Collections.sort();
		System.out.println("After sorting list1");    
		
		//Error because string is predifined but Student class is userdefine
		Collections.sort(list1);
		display(list1); 
		// we need to implement student to comparable
		
		System.out.println("After sorting and reverseOrder list1"); 
		Collections.sort(list1, Collections.reverseOrder());
		display(list1);  */
		 
		StudentAgeComparator ageComp = new StudentAgeComparator();
		System.out.println("After sorting list1 on base of age"); 
		Collections.sort(list1, ageComp);
		display(list1);
		
		System.out.println("After sorting list1 on base of Marks"); 
		Collections.sort(list1, new StudentMarkseComparator());
		display(list1);
	}
}  