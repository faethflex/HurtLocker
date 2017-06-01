package hurtlocker;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by gregoryfletcher on 5/31/17.
 */
public class RawDataParser
{
	public String[] splitData(String rawData)
	{
		return rawData.split("##");
	}

	public String[] keyValueCapture(String field)
	{
		return field.split("[;|^|@|!|*|%]");
	}

	public String[] captureObjectFields(String[] fields, Pattern[] patterns)
	{
		String[] s = new String[2];
		return s;
	}
}
