import java.util.*;

class Grade
{
	private String k;
	private int r;

	public Grade(String l)
	{
		k = l;
	}

	public int points()
	{
		switch (k)
		{
			case "A":
				r = 10;
				break;
			case "A-":
				r =  9;
				break;
			case "B":
				r =  8;
				break;
			case "B-":
				r = 7;
				break;
			case "C":
				r = 6;
				break;
			case "C-":
				r = 5;
				break;
			case "D":
				r = 4;
				break;
			case "FS":
				r = 0;
				break;
			case "FR":
				r = 0;
				break;
		}

		return r;
	}
}


class CGPA
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
    int n,c,p,i,total = 0;
    double x = 0;

    System.out.print("Enter no.of Courses: ");
    n = s.nextInt();

    for (i = 0; i < n; i++)
    {
    	System.out.print("Enter no.of credits of course: ");
 		c = s.nextInt();

    	System.out.print("Enter the grade of the course: ");
    	String t = s.next();
    	Grade a = new Grade(t);
    	p = a.points();

    	total = total + c*p;
    	x = x + c;
    }

    double CGPA = total/x;
    System.out.println(CGPA);

	}
}
