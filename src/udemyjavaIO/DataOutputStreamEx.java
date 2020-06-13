package udemyjavaIO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	private static String file="D:\\JAVA\\Mahesh.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// TODO Auto-generated method stub
		FileOutputStream fout =  new FileOutputStream(file);
		DataOutputStream data =  new DataOutputStream(fout);
		data.writeInt(65);
		data.writeBoolean(Boolean.TRUE);
		data.writeChar('m');
		data.writeDouble(1.90);
		data.writeLong(232323232323L);
		data.close();
		fout.close();
		System.out.println("Task Completed");
		

	}

}
