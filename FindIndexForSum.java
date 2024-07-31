import java.util.Scanner;
public class FindIndexForSum
{
static void FindIndex()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of arry");
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
System.out.println("Enter the "+i +"Element");
arr[i]=sc.nextInt();
}
System.out.println("Enter the Sum Element");
int z=sc.nextInt();
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(z==arr[i]+arr[j])
{
System.out.println(arr[i]+"+"+arr[j]+"="+z);
System.out.println("The Index For Sum are "+i+ " " +j);
}
}
}
}
public static void main(String [] args)
{
FindIndex();
}
}
