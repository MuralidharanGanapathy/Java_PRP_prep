import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha_count_array[] = new int[26];
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		ip = ip.toLowerCase();
		char char_array[] = ip.toCharArray();
		for(int i = 0; i < char_array.length; i++)
		{
			alpha_count_array[(int)char_array[i] - 97]++;
		}
		int sum = 0;
		for(int i = 0; i < alpha_count_array.length; i++ )
		{
			if(alpha_count_array[i] != 0)
			{
				if (alpha_count_array[i] % 2 == 1)
				{
					alpha_count_array[i]--;
				}
				sum += alpha_count_array[i];
			}
		}
		if (sum == 0)
		{
			System.out.println(-1);
		}
		else if(sum == ip.length())
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println(sum + 1);
		}

	}

}
