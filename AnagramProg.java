//package --- 

import static java.lang.System.out; 
import java.io.*; 
import java.util.List;
import java.util.ArrayList;

public class AnagramProg
{// Class Open 
public static void main(String arg[])  throws IOException
	 { //main open
 //write code here
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
out.println("Enter the String ");
String s1=br.readLine();
out.println("Enter the another String ");
String s2=br.readLine();

char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
List<Character> arl1=new ArrayList<>();
for(char c:ch1)
{
arl1.add(c);
}
List<Character> arl2=new ArrayList<>();
for(char c:ch2)
{
arl2.add(c);
}
if(ch1.length==ch2.length)
{
arl1.removeAll(arl2);
int n=arl1.size();
if(n==0)
{
out.println(s2+"\t is Anagram of \t"+s1);
}
else
{
out.println(s2+"is not Anagram of"+s1);
}
}
else
{
out.println("Numer of letter Differ");
}
	 } //main close 
  } //Class Close
