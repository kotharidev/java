class practice{
	public static boolean isPrime(int a){
		if(a<2)
			return false;
		else if(a<3)
			return true;
		for(int i=2;i<(a/2)+1;i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
	}
	public static int oddEven(int a){
		if(a%2==0)
			return 0;
		else
			return 1;
	}
	
	public static void main(String args[]){
		System.out.println("prime number between");
		int count=0;
		for(int i=1;i<501;i++)
		{
			if(isPrime(i))
			{	
				System.out.print(i+"\t");
				count++;
			}	
			if(count==10)
			{
				System.out.println();count=0;
			}	
		}
		System.out.println();
		System.out.println("odd numbers");
		for(int i=1;i<501;i++)
		{
			if(oddEven(i)==1)
			{	
				System.out.print(i+",");
			}	
		}
		System.out.println();
	}
}
