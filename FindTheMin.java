import java.util.*;
public class FindTheMin{
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
 int min=a[0];
for(int i=0;i<a.length;i++)
if(a[i]<min) min=a[i];
System.out.println("The Minimum of  Elements is : "+min);
}
}
