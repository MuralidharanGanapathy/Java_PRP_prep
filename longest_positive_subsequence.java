import java.util.*;
public class longest_positive_sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		int maxi = -1;
		int temp_s = -1;
		int temp_end = -1;
		int start_index = -1;
		int end_index = -1;
		int count = 0;
		int flag = 0;
		for (int i = 0; i < n; i++)
		{
			if((a[i] > 0) && (flag == 0))
			{
				flag = 1;
				temp_s = i;
				//System.out.println("start "+temp_s);
				count ++;
			}
			if((a[i] > 0) && (flag == 1))
			{
				temp_end = i; 
				//System.out.println("end "+temp_end);
				count ++;
			}
			if ((a[i] < 0) && (flag == 1))
			{
				if (maxi < count)
				{
					maxi = count;
					start_index = temp_s;
					end_index = temp_end;
					//System.out.println("pstart , pend"+start_index+end_index);
				}
				flag = 0;
				count = 0;
			}
		}
		for(int i = start_index; i <= end_index; i++)
		{
			System.out.println(a[i]+ " ");
		}

	}

}
