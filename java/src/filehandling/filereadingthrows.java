package filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;


public class filereadingthrows {
	public static void main(String args[]) throws IOException {
	File f=new File("txtfile.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String line;
	while((line=br.readLine())!=null)
	{
		System.out.println(line);
	}
}
}
