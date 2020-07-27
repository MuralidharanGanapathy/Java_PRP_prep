import java.util.*;
public class stabilizer {
    static int checker(int[] arr, int temp)
    {
    	for (int i = 0; i < arr.length; i++)
    	{
    		if((arr[i] != temp) && (arr[i] != 0))
    		{
    			return -1;
    		}
    	}
    	return 1;
    }
    static int isstable(String s)
    {
    	char[] s_arr = s.toCharArray();
    	int[] arr = new int[10];
    	int temp = 0;
    	for(int i = 0; i < s_arr.length; i++)
		{
			arr[Integer.parseInt(s_arr[i]+"")]++;
		}
    	for(int i = 0; i < arr.length; i++)
    	{
    		if (arr[i] != 0)
    		{
    			temp = arr[i];
    			break;
    		}
    	}
    	return checker(arr, temp);
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int max_stable = 0, min_stable = 100000, max_unstable = 0, min_unstable = 100000;
		String input1 = sc.nextLine();
		if (isstable(input1) == -1)
		{
			int temp = Integer.parseInt(input1);
			if(max_unstable < temp)
			{
				max_unstable = temp;
			}
			if (min_unstable > temp)
			{
				min_unstable = temp;
			}
			
		}
		else
		{
			int temp = Integer.parseInt(input1);
			if(max_stable < temp)
			{
				max_stable = temp;
			}
			if (min_stable > temp)
			{
				min_stable = temp;
			}
			
		}
		String input2 = sc.nextLine();
		if (isstable(input2) == -1)
		{
			int temp = Integer.parseInt(input2);
			if(max_unstable < temp)
			{
				max_unstable = temp;
			}
			if (min_unstable > temp)
			{
				min_unstable = temp;
			}
		}
		else
		{
			int temp = Integer.parseInt(input1);
			if(max_stable < temp)
			{
				max_stable = temp;
			}
			if (min_stable > temp)
			{
				min_stable = temp;
			}
			
		}
		String input3 = sc.nextLine();
		if (isstable(input3) == -1)
		{
			int temp = Integer.parseInt(input2);
			if(max_unstable < temp)
			{
				max_unstable = temp;
			}
			if (min_unstable > temp)
			{
				min_unstable = temp;
			}
			
		}
		else
		{
			int temp = Integer.parseInt(input3);
			if(max_stable < temp)
			{
				max_stable = temp;
			}
			if (min_stable > temp)
			{
				min_stable = temp;
			}
			
		}
		String input4 = sc.nextLine();
		if (isstable(input4) == -1)
		{
			int temp = Integer.parseInt(input4);
			if(max_unstable < temp)
			{
				max_unstable = temp;
			}
			if (min_unstable > temp)
			{
				min_unstable = temp;
			}
		}
		else
		{
			int temp = Integer.parseInt(input4);
			if(max_stable < temp)
			{
				max_stable = temp;
			}
			if (min_stable > temp)
			{
				min_stable = temp;
			}
			
		}
		String input5 = sc.nextLine();
		if (isstable(input5) == -1)
		{
			int temp = Integer.parseInt(input5);
			if(max_unstable < temp)
			{
				max_unstable = temp;
			}
			if (min_unstable > temp)
			{
				min_unstable = temp;
			}
		}
		else
		{
			int temp = Integer.parseInt(input5);
			if(max_stable < temp)
			{
				max_stable = temp;
			}
			if (min_stable > temp)
			{
				min_stable = temp;
			}
			
		}
		//based_on_qn_logic
		System.out.println("max_stable: "+ max_stable + " max_unstable : "+max_unstable +" min_stable :" + min_stable + " min_unstable: " + min_unstable);
	}

}
