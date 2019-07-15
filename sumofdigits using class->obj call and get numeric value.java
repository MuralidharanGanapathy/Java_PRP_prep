import java.util.Scanner;
class Summa1
	{

	public int sod(String num)
	{
		char c[] = num.toCharArray();
		int sum = 0;
		for(int i = 0; i < c.length; i++)
		{
			sum += Character.getNumericValue(c[i]);
		}
		return sum;

	}

	}
public class summa{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Summa1 s = new Summa1();
		String num = sc.next();
		System.out.print(s.sod(num));
		 
	}

}
