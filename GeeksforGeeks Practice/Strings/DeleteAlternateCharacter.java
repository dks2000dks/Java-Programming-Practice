import java.util.*;
import java.lang.*;
import java.io.*;

class DeleteAlternateCharacter
{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		while(a-- > 0){
		    String s = scan.next();
		    String o = "";

		    for(int i=0;i<s.length();i+=2){
		        o += s.charAt(i);
		    }
            
		    System.out.println(o.toString());
		}
	}
}