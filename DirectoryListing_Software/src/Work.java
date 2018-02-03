import java.io.*;
import java.util.*;
public class Work {
	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the path of file: ");
		String path=s.nextLine();
		File file = new File(path);
		FileReader f=null;
		String path1="";
		try{
			int c;
			f= new FileReader(file);
			int count=0;
			while((c=f.read())!=10){
				if((c)==10)
				{
					count++;
				}if(count==0){
					path1=path1+(char)c;
					path1=path1.substring(0,path1.length()-1);
				}
					}
			System.out.print(path1);
			f.close();
			s.close();
			

			
			
			
		}finally{
			
		}
	}
}


			
