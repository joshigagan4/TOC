class aaa
{
public static void main(String gg[])
{
String str=gg[0];
int count=0;
for(int i=0;i<str.length();i++) 
{
if(str.substring(0, i).contains(str.charAt(i) + "")) i++;
else
count++;
}
System.out.println(count);
}
}