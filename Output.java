class Student
{
	String name;
    int roll_no;
}


class Output
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "John";
		s2.name = "Watson";
		s1.roll_no = 1;
		s2.roll_no = 2;
		System.out.println("Name is "+s1.name+" and roll number is "+s1.roll_no);
		System.out.println("Name is "+s2.name+" and roll number is "+s2.roll_no);
	}
}