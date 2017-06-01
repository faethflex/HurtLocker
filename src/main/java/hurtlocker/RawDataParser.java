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
		String[] condition = new String[4];
		String errorMessage = "Hell to the no, to the no, no, no.";
		Matcher objectNameField = patterns[0].matcher(fields[0]);
		Matcher objectPriceField = patterns[1].matcher(fields[1]);
		Matcher objectTypeField = patterns[2].matcher(fields[2]);
		Matcher objectExpirationField = patterns[3].matcher(fields[3]);

		if(objectNameField.find())
		{
			condition[0] = objectNameField.group();
		}
		else
		{
			condition[0] = errorMessage;
		}

		if(objectPriceField.find())
		{
			condition[1] = objectPriceField.group();
		}
		else
		{
			condition[1] = errorMessage;
		}

		if(objectTypeField.find())
		{
			condition[2] = objectTypeField.group();
		}
		else
		{
			condition[2] = errorMessage;
		}

		if(objectExpirationField.find())
		{
			condition[3] = objectExpirationField.group();
		}
		else
		{
			condition[3] = errorMessage;
		}
		return condition;
	}

	public ShoppingListItem manifestShoppingListItem(String[] values)
	{
		return new ShoppingListItem(values[0], values[1], values[2], values[3]);
	}

//	public ShoppingListItem[] manifestArrayOfShoppingListItems(List<String[]> monad)
//	{
//
//	}
}