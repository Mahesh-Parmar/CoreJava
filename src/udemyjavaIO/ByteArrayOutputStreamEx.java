package udemyjavaIO;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx {
	private static String file1="D:\\JAVA\\File1.txt";
	private static String file2="D:\\JAVA\\File2.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// TODO Auto-generated method stub
		FileOutputStream fout1 = new FileOutputStream(file1);
		FileOutputStream fout2 = new FileOutputStream(file2);
		
		ByteArrayOutputStream bout =  new ByteArrayOutputStream();
		String word="Mahesh";
		byte bytes[] = word.getBytes();
		bout.write(bytes);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		
		bout.flush();
		bout.close();
		System.out.println("Task Completed");

	}

}
