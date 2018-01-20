
public class Class3_ArraySearch_HappyKohli {
	public static void main(String[] args){
		int arr[]={10,22,5,3,4,9,11,22,};
		int flag;
		int a=Integer.parseInt(args[0]);
		for(int i=0;i<a;i++)
		{
			if(arr[i]==a)
			{
			    flag = 1;
				break;
			}else{
				flag = 0;
			}
				if(flag == 1){
					System.out.print("Element found at:"+(i+1));
				}
				else{
				System.out.print("Element Not found");
				}
				}
				
				
	}

}
