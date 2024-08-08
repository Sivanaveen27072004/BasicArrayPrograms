public class MergeArrays
{
public static void main(String[] args)
{
int[]a={10,20,30};
int[]b={40,50,60};
int[]c=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
c[i]=a[i];
for(int j=0;j<b.length;j++)
{
c[i+a.length]=b[i];
}
}
for(int k=0;k<c.length;k++)
System.out.println(c[k]);
}
}
