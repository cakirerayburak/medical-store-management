package DLL;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;



public class FileOperations
{
	//In this section, we perform the operations of reading, deleting and writing the data we have written. We read the data we translate using frequently used hexadecimal functions from the .dat file with these functions to avoid errors. We convert the typed letter A to the hexadecimal version, that is, we write it as 10 in a .dat file.

	public static void writeLine(String line, String path, int lineLength) throws IOException {
	    // Write the line to the file
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
	        writer.write(line);
	        writer.newLine();
	    }
	}
	
	
	public static byte[] readBlock(int count, int blocksize, String path) 
			throws IOException 
	{
	    byte[] buffer = new byte[blocksize];
	    try (FileInputStream fileStream = new FileInputStream(path)) 
	    {
	        fileStream.skip((count - 1) * blocksize);
	        fileStream.read(buffer);
	    }
	    return buffer;
	}
	
	
	public static boolean appendBlock(byte[] data, String path) throws IOException 
	{
	    try (FileOutputStream fileStream = new FileOutputStream(path, true))
	    {
	        fileStream.write(data);
	    }
	    
	    return true;
	}
	public static boolean updateBlock(byte[] data, int offset, int blocksize, String path)
			throws IOException 
		{
		try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(path), "rw")) {
            randomAccessFile.seek(offset);
            randomAccessFile.write(data);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
		return false;
	
		}
	public static boolean deleteBlock2(int blockSize, int offset, String path) {
		
		
		
        byte[] data = DataOperations.StringToByteArray("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(path), "rw")) {
            randomAccessFile.seek(offset);
            randomAccessFile.write(data);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
	 
	
	public static boolean deleteBlock(int count, int blocksize, String path) throws IOException 
	{
	    byte[] data = new byte[blocksize];
	    try (FileOutputStream fileStream = new FileOutputStream(path)) {
	        fileStream.getChannel().position((count - 1) * blocksize);
	        fileStream.write(data);
	    }
	    return true;
	}
	
}
	
