public class FindDuplicates
{
public static void main(String[]args)
{
int arr[]={5,3,4,6,7,5,3,2,5,1,6};
int count=0;
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.print(arr[j]+" ");
count++;
break;
}
}

}
System.out.println();
System.out.println(count);
}
}
