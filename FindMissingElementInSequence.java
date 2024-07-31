public class FindMissingElement
{
public static void main(String[]args)
{
int [] arr={7,5,4,3,2,1};
int max=arr[0];
int sum=0;
int sum1=0;
int missEle=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
for(int i=1;i<arr.length;i++)
{
if(arr[i]>max)
    max=arr[i];
}
sum1=max(max+1)/2;
missEle=sum1-sum;
System.out.println("Sum Of the Array Elements : "+sum);
System.out.println("Sum Of the Maximum Elements : "+sum1);
System.out.println("The Missing Element is :  "+missEle);
}
}
