import java.util.Scanner;

public class prp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String first_word = sc.next();
		String second_word = sc.next();
		String PIN = sc.next();
		int N = sc.nextInt();
		String longer_name = null, smaller_name = null;
		if (first_word.length() > second_word.length())
		{
			longer_name = first_word;
			smaller_name = second_word;
		}
		else if (first_word.length() < second_word.length())
		{
			smaller_name = first_word;
			longer_name = second_word;	
		}
		else
		{
			char[] first_word_array = first_word.toCharArray();
			char[] second_word_array = second_word.toCharArray();
			for(int i = 0; i < first_word_array.length; i++)
			{
				if(first_word_array[i] == second_word_array[i])
				{
					continue;
				}
				if(first_word_array[i] < second_word_array[i])
				{
					smaller_name = first_word;
					longer_name = second_word;
					break;
				}
				if(first_word_array[i] > second_word_array[i])
				{
					longer_name = first_word;
					smaller_name = second_word;
					break;	
				}
		}
		}
		System.out.println(longer_name+"    "+smaller_name);
		String ans1 = ""+PIN.charAt(N - 1)+PIN.charAt(PIN.length()-N);
		String ans = ""+longer_name.charAt(0)+smaller_name;
		String temp = "";
		char ans_array[] = ans.toCharArray();
		for(int i = 0; i < ans_array.length;i++)
		{
			if (ans_array[i] >= 65 && ans_array[i] <= 91)
			{
				temp += (char)(ans_array[i] + 32);
			}
			else
			{
				temp += (char)(ans_array[i] - 32);
			}
		}
		System.out.println(temp+ans1);

	}

}
