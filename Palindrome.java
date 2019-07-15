import java.util.*;
class Cal{
	String Calc(String s){
		char s1[] = s.toCharArray();
		String s2 = "";
		for(int i = s.length()-1; i >= 0; i--)
			{
				s2 += s1[i];
			}
		System.out.println(s2);
		if (s2.equals(s))
			{
				return "YES";
			}
		
		return "NO";
	}
}
class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Cal c = new Cal();
		System.out.print(c.Calc(sc.nextLine()));
	}


}
