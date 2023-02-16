import java.lang.Math;
class Prime
{
	public static void prime(int n)
	{
		int s[]=new int[n];
		int top=1;
		s[0]=2;
		for(int i=3;i<=n;i++)
		{
			int flag=0;double k=Math.sqrt(i);
			for(int j=0;s[j]<=k;j++)
			{
				if(i%s[j]==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				s[top++]=i;
		}
		for(int j=0;j<top;j++)
		{
			System.out.print(s[j]+",");
		}
	}
	public static void main(String args[])
	{
		prime(500);
	}
}
