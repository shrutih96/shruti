package Test;
import java.io.*;

public class FileDemo {
	public static void main(String [] args) {
		FileReader fs=null;
		FileWriter fo=null;
		try {
			 fs= new FileReader("my.txt");
			 fo=new FileWriter("my1.txt");
			
			
			int i; int count=0;
		 
			while ((i=(fs.read()))!=-1) {
				System.out.print((char)i);
				if((char)i!=' ') {
					count++;
				}
				fo.write((char)i);}
			System.out.println("\nCharacters: "+count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fs!=null)
				try {
					fs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fo!=null)
				try {
					fo.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
