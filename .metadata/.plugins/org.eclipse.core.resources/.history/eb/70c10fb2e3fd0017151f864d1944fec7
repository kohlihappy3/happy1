
public class WaveForm {
	void swap(int arr[],int a, int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	void sort(int arr[],int n)
	{
		for(int i=0;i<n;i+=2){
			if(i>0 && arr[i-1] > arr[i])
				swap(arr,i-1,i);
			if(i<n-1 && arr[i]<arr[i+1])
				swap(arr,i,i+1);
		}
	}
	public static void main(String[] args)
	{
		WaveForm x=new WaveForm();
		int arr[]={11,25,4,56,69,35,22,8,9};
		int  y=arr.length;
		x.sort(arr, y);
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}

}
