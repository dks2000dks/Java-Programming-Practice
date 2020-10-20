import java.util.*;
import java.util.Arrays;
import java.util.List; 
 
class Remove
{
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		s = sc.nextLine();


        Character vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}; 
  
        List<Character> vl = Arrays.asList(vowels); 
  
        StringBuffer str = new StringBuffer(s); 
  
        for (int i = 0; i < str.length(); i++)
        { 
            if (vl.contains(str.charAt(i)))
            { 
                str.replace(i, i + 1, ""); 
                i--; 
            } 
        } 
   
        System.out.println(str.toString()); 

    }
}

