public class Strong
{
	public static void main(String args[])
	{
		int n=245,sum=0;
int temp=n;
		while(n>0)
		{
			int r=n%10;
			int f=1;
				for(int i=1;i<=r;i++)
				{
					f=f*i;
				}
			sum=sum+f;	
			n=n/10;
		}
				

			if(temp==sum)
			System.out.println("Strong No.");
			
				else
				System.out.println(" not a Strong No.");
	}
}