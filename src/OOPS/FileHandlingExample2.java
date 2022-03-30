package OOPS;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileHandlingExample2 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\home\\eclipse-workspace\\DateTypesExamples\\newFile.txt");
		  Scanner dataReader = new Scanner(f1);  
          while (dataReader.hasNextLine()) {  
              String fileData = dataReader.nextLine();  
              System.out.println(fileData);  
          }  
          dataReader.close();  		
		
		// TODO Auto-generated method stub

	}

}
