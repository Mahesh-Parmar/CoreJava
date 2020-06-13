package udemyjavaIO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx 
{
	
	private static String file="D:\\JAVA\\Mahesh.txt";
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter(file);
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("MaheshK");
		buffer.close();
		System.out.println("Task Completed");

	}

}
