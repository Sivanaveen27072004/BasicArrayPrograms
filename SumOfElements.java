
import java.util.*;
public class SumOfElements
{
static void array()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();
int [] arr=new int[size];
for(int h=0;h<size;h++)
{
System.out.println("enter the"+h+"element");
arr[h]=sc.nextInt();
}
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println("The sum of the Elements is : "+sum);
}
public static void main(String[] args)
{
array();
}
}
