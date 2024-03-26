import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

		public static void main(String[] args) throws IOException
		{
			/*
			
			String s = "Message will store into file";
			
			FileOutputStream fos = new FileOutputStream("t1.txt");
			
			byte b[] = s.getBytes();
			
			fos.write(b);
			fos.flush();
			fos.close();
			
			System.out.println("File Written Successfully"); */ 
			
			FileInputStream fis = new FileInputStream("t1.txt");
			
			int i;
			while((i = fis.read())!= -1)
			{
				System.out.print((char)i);
			}
			
		}
}
