import java.util.*;
public class SecLarg {
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the Number of Elements:");
	int n=s.nextInt();
	int arr[]= new int[n];
	System.out.print("Enter Elements:");
	for( int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	
	for(int i:arr)
	{
		System.out.print("  "+i);
	}
	int l=arr[0];
	int sl=arr[0];
	for(int i=0;i<arr.length;i++){
		if(arr[i]>l){
			sl=l;
			l=arr[i];
		}else if(arr[i]>sl){
			sl=arr[i];
		}
	}
	System.out.println(" The Second Largest Number Is: " +sl );
	
	}
	
	
}
