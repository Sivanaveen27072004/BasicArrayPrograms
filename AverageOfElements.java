import java.util.*;
public class AverageOfElements{
public static void main(String[]args)
{
int sum=0;
int avg=0;
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
sum=sum+a[i];
}

avg=sum/a.length;
System.out.println("The Sum Of the Elements is "+sum);
System.out.println("The Average is "+avg);
}
}
