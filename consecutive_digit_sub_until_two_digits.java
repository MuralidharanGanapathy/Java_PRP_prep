import java.util.*;
public class twodidgitnumdiff {
	static String val(char a, char b)
	{
		 return Math.abs(Character.valueOf(a) - Character.valueOf(b))+"";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		for (int i = 0; i < n.length() - 1; i++)
		{
		char arr[] = n.toCharArray();
		String temp = "";
		for(int j = 0; j < arr.length - 1; j++)
		{
			//System.out.print(arr[j]+" hello  ");
			temp += val(arr[j],arr[j+1]);
			//System.out.println("hello   "+temp);
		}
		n = temp;	 
		}
		System.out.println(n);

	}

}
