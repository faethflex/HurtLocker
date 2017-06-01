package hurtlocker;

import org.apache.commons.io.IOUtils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main
{

    public String readRawDataToString() throws Exception
	{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception
	{
		FileOutputStream receipt = new FileOutputStream("receipt.txt");
		BufferedOutputStream filteredReceipt = new BufferedOutputStream(receipt);
		PrintStream printedReceipt = new PrintStream(filteredReceipt);
		System.setOut(printedReceipt);


		String output = (new Main()).readRawDataToString();
		
        System.out.println(output);

    }
}
