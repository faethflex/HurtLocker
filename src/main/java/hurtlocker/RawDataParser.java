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
	public String parseData(List<String> rawData) throws Exception
	{
		Pattern full = Pattern.compile("[A-z]{4}:[A-z]+\\\\*;[a-z]{5}:\\d.\\d+\\\\*;[a-z]{4}:[A-z]+;expiration:\\d/\\d+/\\d{4}");
		for (String item : rawData)
		{
			Matcher object = full.matcher(item);
			if (object.matches())
			{
				System.out.println(object.group());
			}
			else
			{
				System.out.println("Match not found");
			}
		}

		return " ";
	}
}
