
public class Class2_Palindrome_HappyKohli {
	public static void main(String[] args)
	{
		int num=12221;
		int a,sum=0;
		int b;
		
		b=num;
		while(num>0)
		{
			a=num%10;
			sum=(sum*10)+a;
			num=num/10;
			
		}
		
		if(b==sum)
			System.out.print(" The Number Is Palindrome" +b);
		else
			System.out.print(" The Number Is Not A Palindrome" +b);
	}

}
