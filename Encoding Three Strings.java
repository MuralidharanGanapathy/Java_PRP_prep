import java.util.*;
public class EncodingThreeStrings {
String parter(String s1)
{
int length1 = s1.length();
String s1_partition = new String();
if (length1 == 1)
{
	return "  " + s1 + "  ";
}
if (length1%3 == 0)
{
int word_length = length1/3;

s1_partition = s1.substring(0,word_length) +" "+ s1.substring(word_length, word_length*2)+" " +s1.substring(word_length*2);

}
if (length1%3 == 1)
{
int first_char_length = (int)Math.floor(length1/3.0);
int middle_char_length = (int)Math.ceil(length1 / 3.0);
//System.out.println(middle_char_length);

int last_char_length = (int)Math.floor(length1/3.0);
s1_partition = s1.substring(0,first_char_length) +" "+ s1.substring(first_char_length, first_char_length + middle_char_length)+" " +s1.substring(first_char_length + middle_char_length);
}
if (length1%3 == 2)
{
	int first_char_length = (int)Math.ceil(length1/3.0);
	int middle_char_length = (int)Math.floor(length1 / 3.0);
	//System.out.println(middle_char_length);
	int last_char_length = (int)Math.ceil(length1/3.0);
	s1_partition = s1.substring(0,first_char_length) +" "+ s1.substring(first_char_length, first_char_length + middle_char_length)+" " +s1.substring(first_char_length + middle_char_length);
}
return s1_partition;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
EncodingThreeStrings ets = new EncodingThreeStrings();
String s1 = sc.nextLine();
String s2 = sc.nextLine();
String s3 = sc.nextLine();
//string1 process
String[] s1_array = ets.parter(s1).split(" ");
String[] s2_array = ets.parter(s2).split(" ");
String[] s3_array = ets.parter(s3).split(" ");

System.out.println(s1_array[0] + ""+ s2_array[1]+""+s3_array[2].trim());
System.out.println(s1_array[1] + ""+ s2_array[2]+""+s3_array[0]);
//System.out.println(s1_array[2] + "  "+ s2_array[0]+"  "+s3_array[1]);
String res = s1_array[2] + ""+ s2_array[0]+""+s3_array[1];
char[] res_array = res.toCharArray();
String s11 = "";
for(int i = 0; i < res_array.length ; i++)
{
	if (res_array[i] >= 65 && res_array[i] <= 91)
	{
		s11 += (char)(res_array[i] + 32);
	}
	else if (res_array[i] >= 97 && res_array[i] <= 122)
	{
		s11 += (char)(res_array[i] - 32);
	}
	else
	{
		s11 += res_array[i];
	}
}
System.out.println(s11);

}

}
