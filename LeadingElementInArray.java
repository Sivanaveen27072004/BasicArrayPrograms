
public class LeadingElement
{
static void find()
{
int a[]={1,3,2,9,5,10,8,-1,4};
for(int i=1;i<a.length-2;i++)
{
if (a[i]>a[i+1]&&a[i]>a[i-1])
System.out.println(a[i]);
}
}
public static void main(String [] args)
{
find();
}
}
