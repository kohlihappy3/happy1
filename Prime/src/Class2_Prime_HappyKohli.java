
public class Class2_Prime_HappyKohli {
	public static void main(String[] args)
	{
		int num=13;
		int i,m=0,flag=0;
		m=num/2;
		if(num==0||num==1){
			System.out.print(num+"is not a prime number.");
		
		}else{
			for(i=2;i<=m;i++){
				if(num%i==0){
					System.out.print(num+"is not a prime number.");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.print(num+"is a prime number.");
			}
		}
	}

}
