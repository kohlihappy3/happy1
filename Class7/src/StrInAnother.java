import java.util.Scanner;

public class StrInAnother {
	public static void main(String[] args)
	{
		String x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String: ");
		x=s.nextLine();
		System.out.println("Enter The String You Want To Check: ");
		y=s.nextLine();
		StringBuffer st=new StringBuffer();
		if(x.contains(y)){
			System.out.println(x+ " Contains " +y);	
		}else{
			System.out.println(x+ " Does Not Contains " +y);
		}
	}
}
