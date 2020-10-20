import java.util.*;

class Anagrams
{
	public static void main(String[] args)
	{
		String s,v;
		int o = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Word");
		s = scan.nextLine();
		s = s.toLowerCase(); 
		char s1[] = s.toCharArray();
		System.out.println("Enter Second Word");
		s = scan.nextLine();
		s = s.toLowerCase();
		char s2[] = s.toCharArray();
		
   		for(int i = 0;i < s1.length;i++)
    	{
    		for(int j = 0;j < s2.length;j++)
      		{	
      			if(s1[i] == s2[j])
      			{
      				o = o + 1;
      				break;      				
      			}
      		}
        }

        if (o == s.length())
        {
        	System.out.println("Yes they are Anagrams");
        }
    }
}

	