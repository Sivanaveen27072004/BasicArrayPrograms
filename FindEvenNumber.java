import java.util.*;
public class FindEvenNumber{
public static void main(String[]args)
{
int count=0;
String str=" ";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of the Array");
int size=sc.nextInt();
int []a=new int[size];
for(int i=0;i<size;i++)
{
System.out.println("Enter the"+i+" Element");
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{

count++;
str=str+a[i]+" ";
}
}
System.out.print("The Even Numbers are : "+str);
System.out.println();
System.out.println("The Count is : "+count);
}
}
