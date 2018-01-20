
public class Class2_Reverse_HappyKohli {
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]),r=0;
		while(num!=0)
		{
			int a=num%10;
			r=r*10+a;
			num/=10;
		}
		System.out.println("Reversed Number is:"+r);
	}

}
