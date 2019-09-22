import java.util.Scanner;
public class ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 0;
		int input2 = -2;
		int input3 = -5;
		int diff = (input2 - input1) + (input3 - input2);
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		int ans = 0;
		if (idx % 2 == 1)
		{
			idx = (idx / 2) + 1;
			ans = input1 + ((idx - 1) * diff);
		}
		else
		{
			idx = idx / 2;
			ans = input2 + ((idx - 1) * diff);
		}
		System.out.println(ans);
	}

}
