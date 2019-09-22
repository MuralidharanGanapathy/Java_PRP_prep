import java.util.Scanner;
public class map_prblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[] = new String[n];
		int idx[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.next();
		}
		for(int i = 0; i < n; i++)
		{
			idx[i] = sc.nextInt();
		}
		//dec sort
		int temp[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			temp[i] = idx[i];
		}
		int temp1 = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(temp[i] > temp[j])
				{
					temp1 = temp[i];
					temp[i] = temp[j];
					temp[j] = temp1;
				}
			}
		}
		for(int i:temp)
		{
			System.out.println("temp="+i);
		}
		int id[] = new int[3];
		int st_id = 0;
		int count = 0, n1 = n;
		int flag = 0;
		while(st_id < n1)
		{
			if(count == 2)
			{
				flag = 1;
				break;
			}
			if(temp[st_id] - temp[st_id + 1] == 1)
			{
				//System.out.println(temp[st_id]);
				count++;
			}
			else
			{
				count = 0;
			}

			st_id = st_id + 1;
		}
		if (flag == 1) {
		id[0] = temp[st_id - 2];
		id[1] = temp[st_id - 1];
		id[2] = temp[st_id];
		int s = 0;
		String ans = "";
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < n ; j++)
			{
				if(id[i] == idx[j])
				{
					ans += a[j];
					break;
				}
			}
			if(i < 2)
				ans+=":";
		}
		System.out.println(ans);
		}
		else
		{
			System.out.println(-1);
		}
	}

}
