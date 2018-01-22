
public class Operate {
	public static void main(String[] args)
	{
		Complex c1= new Complex(10,7);
		Complex c2= new Complex(5,3);
		Complex result= new Complex();
		System.out.println("The Addition of Complex Numbers are: ");
		result=c1.add(c2);
		result.disp();
		System.out.println("The Substraction of Complex Numbers are: ");
		result=c1.sub(c2);
		result.disp();
		System.out.println("The Multiplicaton of Complex Numbers are: ");
		result=c1.mult(c2);
		result.disp();
	}

}
