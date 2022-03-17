package readingAndWritingToFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingWritingToFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//create a file on your file system
		String testFile = "C:\\temp\\temp.txt";
		File FC = new File("TestFile");//created object of java File Class
		FC.createNewFile(); //Create File
		
		//Writing into file
		//creating object of java FileWriter and bufferedWroter Class
		FileWriter FW = new FileWriter(testFile);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("This is the first line"); //Writing into the file
		BW.newLine(); //To write next text on a new line
		BW.write("This is the second line");//Writing to the file
		BW.newLine(); //To write next text on a new line
		BW.write("This is the Third line");//Writing to the file
		BW.close();
		
		//Reading from the file
		//Create object of java FileReader & BufferedReader Class
		FileReader FR = new FileReader(testFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
		
		//Loop to read all lines one by one from file and print it
		while ((Content = BR.readLine())!= null) {
		System.out.println(Content);
		
	
		}
				
		}

}
