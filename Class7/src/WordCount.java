
public class WordCount {
	public static void main(String[] args)
	{
		String s= "Virat Kohli is The Best Player Of The World.";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in given String is : "+count);
	}
	

}
