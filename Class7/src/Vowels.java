import java.util.*;
public class Vowels {
	public static void main(String[] args)
	{
		String x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String: ");
		x=s.nextLine();
		y=x.replaceAll("[aAeEiIoOuU]","");
		System.out.println("The String after removing vowels is: "+y);
	}

}
