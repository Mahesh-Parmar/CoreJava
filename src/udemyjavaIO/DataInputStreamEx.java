package udemyjavaIO;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {
	private static String file="D:\\JAVA\\Mahesh.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// TODO Auto-generated method stub
		FileInputStream input = new FileInputStream(file);
		DataInputStream data =  new DataInputStream(input);
		System.out.println(data.readInt());
		System.out.println(data.readBoolean());
		System.out.println(data.readChar());
		System.out.println(data.readDouble());
		System.out.println(data.readLong());
		data.close();
	}

}
