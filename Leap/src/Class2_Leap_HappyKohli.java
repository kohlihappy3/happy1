
public class Class2_Leap_HappyKohli {
	public static void main(String[] args){
		int year=2020;
		if((year % 400 == 0) || ((year %4 == 0) && (year % 100!= 0)))
			System.out.print("year"+year+"is a leap year");
		else
			System.out.print("year" +year+ "is not a leap year");
	}
}
