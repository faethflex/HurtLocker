package hurtlocker;

import org.apache.commons.io.IOUtils;

import java.util.Arrays;
import java.util.List;

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
		RawDataParser parser = new RawDataParser();
        String output = (new Main()).readRawDataToString();
		List<String> groceries = Arrays.asList(output.split("##"));
		String result = parser.parseData(groceries);
        System.out.println(result);

    }
}
