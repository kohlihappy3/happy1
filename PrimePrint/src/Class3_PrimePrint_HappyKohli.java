
public class Class3_PrimePrint_HappyKohli {
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]),i;
		int flag;
		for(i=2;i<=num;i++)
		{
			flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
		if(flag==0)
		{
			System.out.print(" "+i);
		}
			
		}
	}

}
