import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String num = sc.next();
	    char a[] = num.toCharArray();
	    //System.out.println(a[0]);
	    int sum = 0;
	    for(int i = 0; i < a.length; i++)
	    {
	        sum += (int) a[i] - 48;
	    }
	    System.out.println(sum);
		
	}
}

