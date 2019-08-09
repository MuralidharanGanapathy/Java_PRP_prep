import java.util.*;
public class least_frequent_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = -1;
		for(int i = 0 ; i < n; i++)
		{
			a[i] = sc.nextInt();
			if (max < a[i])
			{
				max = a[i];
			}
		}
		int index[] = new int[max];
		for (int i = 0; i<  n; i++)
		{
			index[a[i]]++;
		}
		int min_occur_index_array[] = new int[n];
		int min_occur_element_array[] = new int[n];
		int count = 0;
		int mini = n;
		for(int i = 0; i < max; i++)
		{
			if (index[i] < mini)
			{
				mini = index[i];
			}
		}
		int j = 0;
		for(int i = 0; i < max; i++)
		{
			if(mini == index[i])
			{
				min_occur_element_array[j] = i;
				j++;
				
			}
		}
	}

}
