import java.util.*;
public class balanced_numbers {
	static boolean balanced(String s)
	{
		TreeSet<String> ts = new TreeSet<String>();
		char s_array[] = s.toCharArray();
		char s1_array[] = s.toCharArray();
		for(int i = 0; i < s_array.length; i++)
		{
			ts.add(s_array[i]+"");
		}
		//System.out.println(ts.size());
		if(ts.size() == 1)
		{
			return true;
		}
		else
		{
			int a[] = new int[10];
			for(int i = 0; i < s_array.length; i++)
			{
				a[Integer.parseInt(s_array[i]+"")]++;
			}
			/*for (int i = 0; i < a.length; i++)
			{
				System.out.println(i+"="+a[i]);
			}*/
			
			int mini = -1, count = 0;
			for (int i = 0; i < a.length; i++)
			{
				if ((mini != a[i]) && a[i] != 0)
				{
					mini = a[i];
					count++;
				}
			}
			//System.out.println("count"+count);
			if(count >= 2)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ind_array[] = new int[10];
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		String s4 = sc.next();
		int balance = 0, imbalance = 0;
		String arr[] = new String[4];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		for(int i = 0; i < arr.length; i++)
		{
			if(balanced(arr[i]) == true)
			{
				System.out.println("balanced"+arr[i]);
				balance += Integer.parseInt(arr[i]);
			}
			else
			{
				System.out.println("imbalanced"+arr[i]);
				imbalance += Integer.parseInt(arr[i]);
			}
		}
		
		
		

	}

}
