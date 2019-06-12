import java.util.*;

class Word
{
	public static void main(String[] args)
	{
		String s,v;
		int i,l,o = 0,x = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence");
		s = scan.nextLine();

		String str[] = s.split(" ");

		for(i = 0;i < str.length;i++)
		{
			v = str[i];
			l = v.length();
			if(l > x)
			{
				x = l;
				o = i;
			}
		} 
		
		System.out.println(str[o]);

	}
}