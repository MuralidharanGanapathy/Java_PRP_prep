import java.util.*;
public class ssssss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ip_string = sc.nextLine();
		String ip_num = sc.next();
		char num_array[] = ip_num.toCharArray();
		int num_arr[] = new int[num_array.length];
		for(int i = 0; i < num_array.length; i++)
		{
			num_arr[i] = Character.getNumericValue(num_array[i]);
		}
		String s = "";
		String ip[] = ip_string.split(" ");
		for(int i = 0; i < num_arr.length; i++)
		{
			String temp = ip[num_arr[i] - 1];
			if (temp.length() % 2 == 0)
			{
				StringBuffer temp_string = new StringBuffer(temp.substring(0,temp.length()/2));
				s += temp_string.reverse() +""+temp.substring(temp.length()/2) +" ";
			}
			if (temp.length() % 2 == 1)
			{
				StringBuffer temp_string = new StringBuffer(temp.substring(0,(temp.length()/2)+1));
				s += temp_string.reverse() +""+temp.substring(temp.length()/2) +" ";
			}
			
		}
		System.out.println(s);

	}

}
