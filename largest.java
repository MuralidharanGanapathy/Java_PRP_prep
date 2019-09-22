import java.util.Scanner;
public class largest {
	public static String[] sorter(int arr[])
	{
		String a[] = new String[3];
		int temp;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if (arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		a[0] = arr[arr.length - 1] + "";
		a[1] = arr[arr.length - 2] + "";
		a[2] = arr[arr.length - 3] + "";
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ip1 = sc.nextLine();
		String ip2 = sc.nextLine();
		String ip3 = sc.nextLine();
		String ip1_array[] = ip1.split("");
		String ip2_array[] = ip2.split("");
		String ip3_array[] = ip3.split("");
		int int_arr1[] = new int[ip1.length()];
		int int_arr2[] = new int[ip2.length()];
		int int_arr3[] = new int[ip3.length()];
		for(int i = 0; i < ip1_array.length; i++)
		{
			int_arr1[i] = Integer.valueOf(ip1_array[i]);
		}
		for(int i = 0; i < ip2_array.length; i++)
		{
			int_arr2[i] = Integer.valueOf(ip2_array[i]);
		}
		for(int i = 0; i < ip3_array.length; i++)
		{
			int_arr3[i] = Integer.valueOf(ip3_array[i]);
		}
		String number1 = String.join("",sorter(int_arr1));
		String number2 = String.join("",sorter(int_arr2));
		String number3 = String.join("",sorter(int_arr3));
		System.out.println(Integer.valueOf(number1)+Integer.valueOf(number2)+Integer.valueOf(number3));

	}

}
