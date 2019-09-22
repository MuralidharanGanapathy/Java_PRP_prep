import java.util.Scanner;
public class ennavo {
	public static String returnvalue(int a, int b, int c, int iseven)
	{
		//System.out.println(a+" "+b+" "+c);
		if(iseven == 0)
		{
			if ((a > b) && (a > c))
				return a+"";
			else if ((b > a) && (b > c))
				return b+"";
			else
				return c+"";
		}
		else
		{
			if ((a < b) && (a < c))
				return a+"";
			else if ((b < a) && (b < c))
				return b+"";
			else
				return c+"";
			
		}
	}
	public static String validator(String a)
	{
		if (a.length() < 5)
		{
			int len = 5 - a.length();
			for(int i = 0; i < len; i++)
			{
				a = "0" + a;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ip1 = sc.nextLine();
		String ip2 = sc.nextLine();
		String ip3 = sc.nextLine();
		ip1 = validator(ip1);
		ip2 = validator(ip2);
		ip3 = validator(ip3);
		int n1 = Integer.valueOf(ip1);
		int n2 = Integer.valueOf(ip2);
		int n3 = Integer.valueOf(ip3);
		String ans[] = new String[4];
		int flag = 1, idx = 3;
		for(int i = 0; i < 4; i++)
		{
			if(i <= 1)
				flag = 0;
			else
				flag = 1;
			ans[idx] = returnvalue(n1%10, n2%10, n3%10, flag);
			n1/=10;
			n2/=10;
			n3/=10;
			idx--;
			//System.out.println(ans[idx+1]);
		}
		System.out.println(ans[3]+ans[1]+ans[2]+ans[0]);
	}

}
