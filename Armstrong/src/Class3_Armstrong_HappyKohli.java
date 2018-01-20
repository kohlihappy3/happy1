
public class Class3_Armstrong_HappyKohli {
	public static void main(String[] args)
	{
		int num= Integer.parseInt(args[0]);
		int a=0,temp,b;
		temp=num;
		while(num>0){
			b=num%10;
			num=num/10;
			a=a+(b*b*b);
		}
		if(temp==a)
			System.out.print("Armstrong number");
		else
			System.out.print("No Armstrong number");
	}

}
