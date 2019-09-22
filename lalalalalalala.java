import java.util.Arrays;
import java.util.Scanner;
public class lalalala {
	public static String[] splitter(String s)
	{
		String[] h = new String[3];
		double num =  s.length()/3.0;
		if(s.length() %3 == 0)
		{
			h[0] = s.substring(0, (int)num);
			h[1] = s.substring((int)num,(int)num*2);
			h[2] = s.substring((int)num*2);
		}
		else if(s.length() % 3 == 1)
		{
			h[0] = s.substring(0, (int)Math.floor(num));
			h[1] = s.substring((int)Math.floor(num),(int) Math.ceil(num) + (int)Math.floor(num));
			h[2] = s.substring((int) Math.ceil(num) + (int)Math.floor(num));
		}
		else
		{
			//System.out.println(Math.ceil(num)+ " "+ Math.floor(num));
			h[0] = s.substring(0, (int)Math.ceil(num));
			h[1] = s.substring((int)Math.ceil(num),(int) Math.ceil(num) +(int) Math.floor(num));
			h[2] = s.substring((int) Math.ceil(num) + (int)Math.floor(num));
		}
		return h;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String[] split_ip = ip.split(" ");
		//System.out.println(split_ip);
		String[] ans_arr = new String[3];
		for (int i = 0; i < split_ip.length; i++)
		{
			String[] temp_arr = new String[3];
			temp_arr = splitter(split_ip[0]);
			if (i == 0)
			{
				ans_arr[0] = temp_arr[0];
				ans_arr[2] = temp_arr[2];
			}
			else
			{
				ans_arr[1] = temp_arr[1];
			}
			
		}
		String answer = String.join("",ans_arr);
		String a = Arrays.toString(ans_arr);
		System.out.println(answer);
	}

}
