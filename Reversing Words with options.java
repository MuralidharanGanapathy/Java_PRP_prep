import java.util.*;
public class Cases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int opt = sc.nextInt();
		String s1 = "";
		if (opt == 0)
		{
			String[] str_list = s.split(" ");
			
			for (int i = 0; i < str_list.length; i++)
			{
				StringBuilder s2 = new StringBuilder();
				s2.append(str_list[i]);
				s1 += s2.reverse()+" ";
				
			}
			System.out.println(s1);
		}
		if (opt == 2)
		{
			String[] str_list = s.split(" ");
			
			for (int i = 0; i < str_list.length; i++)
			{
				StringBuilder s2 = new StringBuilder();
				s2.append(str_list[i]);
				s1 += s2.reverse()+" ";	
			}
			char str[] = s1.toCharArray();
			String s11 = "";
			for(int i = 0; i < str.length ; i++)
			{
				if (str[i] >= 65 && str[i] <= 91)
				{
					s11 += (char)(str[i] + 32);
				}
				else if (str[i] >= 97 && str[i] <= 122)
				{
					s11 += (char)(str[i] - 32);
				}
				else
				{
					s11 += str[i];
				}
			}
			System.out.println(s11);
		}
		if (opt == 1)
		{
			char[] s12 = s.toCharArray();
			int count = 0;
			int upper_index[] = new int[s.length()]; 
			for (int i = 0; i < s12.length; i++)
			{
				if (s12[i] >= 65 && s12[i] <= 91)
				{
					upper_index[count] = i;
					count = count + 1;
				}
			}
			//for(int i = 0; i < count; i++) {
			//System.out.println(upper_index[i]);}
			String[] str_list = s.split(" ");
			
			for (int i = 0; i < str_list.length; i++)
			{
				StringBuilder s2 = new StringBuilder();
				s2.append(str_list[i]);
				s1 += s2.reverse()+" ";
				
			}
			//System.out.println(s1);
			int j = 0;
			String stringer = "";
			char[] rev_list = s1.toCharArray();
			for(int i = 0; i < rev_list.length; i++)
			{
				if (i == upper_index[j])
				{
					if (rev_list[i] >= 97 && rev_list[i] <= 122)
					{
						stringer += (char) (rev_list[i] - 32);
					}
					else
					{
						stringer += rev_list[i];
					}
					j++;
				}
				else
				{
					if (rev_list[i] >= 65 && rev_list[i] <= 91)
					{
						stringer += (char) (rev_list[i] + 32);
					}
					else
					{
						stringer += rev_list[i];
					}
				}
			}
			System.out.println(stringer);
			}
			
			
		}
		

	}



