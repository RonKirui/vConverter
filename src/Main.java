import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import vconvert.ReadFormatAndWriteFile;

/**
 * @author Ashiff Khan
 * @On 21/04/2023
 * @description: Many Execution file
 */
public class Main {
    public static void main(String[] args) {

	while(true) {
	 //Getting user input path
        	try {
            		System.out.println("Please input your file location : ");
            		Scanner userKeyInput = new Scanner(System.in);
            		String inputFIle = userKeyInput.nextLine();

            		ReadFormatAndWriteFile readFormatAndWriteFile = new ReadFormatAndWriteFile();
            		readFormatAndWriteFile.readFormatAndWriteTextFile(inputFIle);

            //catching the exception on failure
        	} catch (IOException e) {
            		System.out.println("Error might have occurred while reading or writing file.");
        	}
	}
	
       
    }
}
