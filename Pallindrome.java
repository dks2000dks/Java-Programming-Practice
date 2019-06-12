import java.util.*;
class Pallindrome
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    String st = s.nextLine();
    boolean pali = true;

    for(int i = 0;i<(st.length()/2);i++)
    {
      if(st.charAt(i)!=st.charAt(st.length()-1-i)){
        pali = false;
        break;
      }
    }
    System.out.println(pali);
  }
}
	