
public class Complex {
	int r,i;
	public Complex(int b,int c  )
	{
		r=b;
		i=c;
	}
	public Complex()
	{
		r=0;
		i=0;
	}
	void disp()
	{
		System.out.println(" The Number is : "+r+"+i"+i);
	}
	Complex add(Complex a)
	{
		Complex d= new Complex();
		d.r=this.r+a.r;
		d.i=this.i+a.i;
		return d;
		
	}
	Complex sub(Complex a)
	{
		Complex d= new Complex();
		d.r=this.r-a.r;
		d.i=this.i-a.i;
		return d;
		
	}
	Complex mult(Complex a)
	{
		Complex d= new Complex();
		d.r=this.r*a.r;
		d.i=this.i*a.i;
		return d;
		
	
}
	
}

