
public class ArraySort {
public static void main(String[] args)
{
	int arr[]={0,1,1,0,0,1,0,0};
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==0)
			count++;
		arr[i]=0;
	}
	    int i=0;
	    while(i<arr.length)
	    {
	    if(i>count-1)
	    	arr[i]=1;
	    i++;
	    }
	    for(i=0;i<arr.length;i++)
	    	System.out.print(arr[i]);
		}
	
}

