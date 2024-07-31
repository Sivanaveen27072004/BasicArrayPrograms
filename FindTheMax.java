import java.util.*;
public class FindTheMax{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of the Array");
int size=sc.nextInt();
int []a=new int[size];
for(int i=0;i<size;i++)
{
System.out.println("Enter the"+i+" Element");
a[i]=sc.nextInt();
}
 int max=a[0];
for(int i=0;i<a.length;i++)
if(a[i]>max) max=a[i];
System.out.println("The Maximum of  Element  "+max);
}
}
