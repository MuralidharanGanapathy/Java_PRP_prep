import java.util.Scanner;
public class stabilizer1 {
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
		int stable_sum = 0, unstable_sum = 0;
		String input1 = sc.nextLine();
		if (isstable(input1) == -1)
		{
			int temp = Integer.parseInt(input1);
			unstable_sum += temp;
			
		}
		else
		{
			int temp = Integer.parseInt(input1);
			stable_sum += temp;
			
		}
		String input2 = sc.nextLine();
		if (isstable(input2) == -1)
		{
			int temp = Integer.parseInt(input2);
			unstable_sum += temp;
		}
		else
		{
			int temp = Integer.parseInt(input2);
			stable_sum += temp;
			
		}
		String input3 = sc.nextLine();
		if (isstable(input3) == -1)
		{
			int temp = Integer.parseInt(input3);
			unstable_sum += temp;
			
		}
		else
		{
			int temp = Integer.parseInt(input3);
			stable_sum += temp;
			
		}
		String input4 = sc.nextLine();
		if (isstable(input4) == -1)
		{
			int temp = Integer.parseInt(input4);
			unstable_sum += temp;
		}
		else
		{
			int temp = Integer.parseInt(input4);
			stable_sum += temp;
			
		}
		String input5 = sc.nextLine();
		if (isstable(input5) == -1)
		{
			int temp = Integer.parseInt(input5);
			unstable_sum += temp;
		}
		else
		{
			int temp = Integer.parseInt(input5);
			stable_sum += temp;
			
		}
		//based_on_qn_logic
		System.out.println(stable_sum + " " + unstable_sum);
	}

}
