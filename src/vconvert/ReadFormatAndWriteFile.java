package vconvert;

import java.io.*;
import java.nio.file.Paths;

/**
 * @author Ashiff Khan
 * @On 21/04/2023
 * @description: Reading formatting and writing to the new file
 */

public class ReadFormatAndWriteFile {
    public void readFormatAndWriteTextFile(String userPath) throws IOException {
        //The path shows where the computer file location
        String fileLocationPath = "Files/"+userPath+".txt";

        //Reading the file using buffer reader
        BufferedReader textReader = new BufferedReader(new FileReader(Paths.get(fileLocationPath).toFile()));

        //writing the file using buffer writer
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter("TXT/"+userPath+".txt"));
        textReader.readLine();

        //CSV Write
        BufferedWriter writingCSV = null;
        writingCSV = new BufferedWriter(new FileWriter("Desktop/"+userPath+".csv"));

        //adding header of the file
        writingCSV.write("Number \t, NumericValue\n");

        String textLineRead = textReader.readLine();
        int outLinesCount = 0;
        String defaultIndexValue = userPath+"-";
        int  indexingValue = 1;
        
        
        writingCSV.write(defaultIndexValue +"000\t," + "123567890\n");


        while ((textLineRead != null) && (outLinesCount<1030)) {

            //Read all the lines that only have integer values
            String numericValues = textLineRead.replaceAll("[^0-9]", "");

            //the condition checks whether line only contains integer characters
            if(textLineRead.matches(".*\\d.*")){
                fileWriter.write(numericValues);
                fileWriter.newLine();

                //writing CSV value row
                
                if(outLinesCount<9) {
                writingCSV.write(defaultIndexValue + "00" + indexingValue+ "\t," + numericValues + "\n");
                }
                else if (outLinesCount<99){
                writingCSV.write(defaultIndexValue + "0" + indexingValue+ "\t," + numericValues + "\n");
                }
                else{
                writingCSV.write(defaultIndexValue + indexingValue+ "\t," + numericValues + "\n");    
                }
                outLinesCount++;
                indexingValue++;
            }

            textLineRead = textReader.readLine();

        }
        textReader.close();
        fileWriter.close();
        writingCSV.close();
        //Tells that the request was a success
        System.out.println("File Read and formatted successfully");

    }
}
