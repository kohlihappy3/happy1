import java.io.*;
public class Path {
	public static void main(String[] args) throws IOException{
	File f=new File("C:/Users/Happy Kohli/Desktop/happy.txt");
	FileReader r=new FileReader(f);
	try{
		int m;
	while((m=r.read())!=-1){
		System.out.print((char)m);
	}
	}
	catch(FileNotFoundException e){
		System.out.println("File Not Found");
	}finally{
		if(r!=null){
			r.close();
		}
	}
	
	}}
