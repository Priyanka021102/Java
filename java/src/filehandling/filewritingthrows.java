package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewritingthrows {
	public static void main(String args[]) throws IOException{
		File f=new File("txtfile.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("HI");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("\nHELLO");
		bw.close();
	} 

}
