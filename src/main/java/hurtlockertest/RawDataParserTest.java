package hurtlockertest;

import hurtlocker.JerkSONPatterns;
import hurtlocker.Main;
import hurtlocker.RawDataParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gregoryfletcher on 5/31/17.
 */
public class RawDataParserTest
{
	String[] keyValuePairs;
	String[] test;
	RawDataParser parseData;

	@Before
	public void startup() throws Exception
	{
		parseData = new RawDataParser();
		test = parseData.splitData((new Main()).readRawDataToString());
		keyValuePairs = parseData.keyValueCapture(test[5]);
	}

	@Test
	public void testSplitData()
	{
		// given
		String expected = "this";

		// when
		String[] actual = parseData.splitData("Is##this##thing##on?");

		// then
		Assert.assertEquals("These strings should be equal", expected, actual[1]);
	}

	@Test
	public void testKeyValueCapture()
	{
		// given
		String expected = "NAMe:BrEAD";

		// when
		String[] actual = parseData.keyValueCapture("NAMe:BrEAD;price:1.23;type:Food;expiration:2/25/2016");

		// then
		Assert.assertEquals("These captures should be equal", expected, actual[0]);
	}

	@Test
	public void testCaptureObjectFields()
	{
		//given
		String expected = "[Cookies, 2.25, Food, 1/25/2016]";

		// when
		String[] actual = parseData.captureObjectFields(keyValuePairs, JerkSONPatterns.jerkSonPatternArray);

		// then
		Assert.assertEquals("These strings should be identical", expected, actual);
	}
}
