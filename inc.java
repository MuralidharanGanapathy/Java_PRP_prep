import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =  0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		int inc[] = new int[n];
		for(int i = 0; i < n - 1; i++)
		{
			int count = 0;
			int maxi = a[i];
			for(int j = i+1; j < n; j++ )
			{
				if (a[j] > maxi)
				{
					count++;
					maxi = a[j];
				}
				else
				{
					break;
				}
			}
			inc[i] = count;
		}
		int max = -1;
		int index = -1;
		for(int i = 0; i < n; i++)
		{
			//System.out.println(inc[i]);
			if (max < inc[i])
			{
				max = inc[i];
				index = i;
			}
		}
		System.out.println("Count = "+max+" start index = "+index);
		for(int i = index; i <= max + index; i++ )
		{
			System.out.println(a[i]);
		}
		

	}

}
