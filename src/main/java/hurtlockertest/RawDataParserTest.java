package hurtlockertest;

import hurtlocker.RawDataParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gregoryfletcher on 5/31/17.
 */
public class RawDataParserTest
{
	List<String> newString;
	RawDataParser parseData;
	@Before
	public void startup()
	{
		newString = new ArrayList<>();
		parseData = new RawDataParser();
	}

	@Test
	public void testParseData() throws Exception
	{
		// given
		newString.add("naMe:COOkieS;Price:2.25;type:Food;expiration:1/25/2016##");
		String expected = " ";
		// when
		String actual = parseData.parseData(newString);
		// then
		Assert.assertEquals("The strings should match", expected, actual);


	}
}
