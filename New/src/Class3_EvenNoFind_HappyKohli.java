
public class Class3_EvenNoFind_HappyKohli {
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int i;
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
	}

}
