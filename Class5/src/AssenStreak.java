
public class AssenStreak {
	public static int sub(int arr[],int n){
		int max=1;
		int count=1;
		for(int i=1;i<n;i++){
			
			if(arr[i]>arr[i-1])
				count++;
			else{
				if(max<count)
					max=count;
				count=1;
			}
		}
		if(max<count)
			max=count;
		return max;
	}
	public static void main(String[] args)
	{
		int arr[]={1,8,45,12,36,59,88,25,77,666,33,2};
		int n=arr.length;
		System.out.println("The Length of Longest Asssending Streak of Array is : "+sub(arr,n));
	}

}
