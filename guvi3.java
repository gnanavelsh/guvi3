import java.util.*;
class guvi3
{
public static void main(String args[])
{
int i,j,temp=0,k=0,v=1;
Scanner s1=new Scanner(System.in);
System.out.println("enter the array size");
int n=s1.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s1.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
System.out.println(a[i]);
k++;
break;
}
}
if(k>0)
break;
}
}
}