class A
{
	void print()
	{
		for (int i=0;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class pattern1
{
	public static void main(String args[])
	{
		A a = new A();
		a.print();
	}
	
}