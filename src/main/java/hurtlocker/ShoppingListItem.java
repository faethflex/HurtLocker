package hurtlocker;

import java.util.regex.Matcher;

/**
 * Created by gregoryfletcher on 6/1/17.
 */
public class ShoppingListItem
{
	private String itemName;
	private String itemPrice;
	private String itemType;
	private String itemExpirationDate;
	public static int numberOfMilk, numberOfApple, numberOfBread, numberOfCookie;
	Matcher matcher;
	int numberOfItemName;
	public static int expensiveMilkPriceCount, cheapMilkPriceCount;
	public static int expensiveApplePriceCount, cheapApplePriceCount;
	public static int basicCookiePriceCount;
	public static int basicBreadPriceCount;
	public static int tariqTrollCount;

	public ShoppingListItem(String itemName, String itemPrice, String itemType, String itemExpirationDate)
	{
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemType = itemType;
		this.itemExpirationDate = itemExpirationDate;
		timesItemNameAppears();
		timesItemPriceAppears();
		setTariqTrollCount();
	}

	@Override
	public boolean equals(Object shoppingListItem)
	{
		ShoppingListItem prototype = (ShoppingListItem)shoppingListItem;

		return (itemName.equals(prototype.itemName)) && (itemPrice.equals(prototype.itemPrice)) && (itemType.equals(prototype.itemType)) && (itemExpirationDate.equals(prototype.itemExpirationDate));
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(itemName);
		sb.append(" ");
		sb.append(itemPrice);
		sb.append(" ");
		sb.append(itemType);
		sb.append(" ");
		sb.append(itemExpirationDate);
		String shoppingListItem = sb.toString();
		return shoppingListItem;
	}

	private void timesItemNameAppears()
	{
		matcher = JerkSONPatterns.nameApples.matcher(itemName);
		if (matcher.find())
		{
			numberOfApple++;
			numberOfItemName = numberOfApple;
		}

		matcher = JerkSONPatterns.nameBread.matcher(itemName);
		if (matcher.find())
		{
			numberOfBread++;
			numberOfItemName = numberOfBread;
		}

		matcher = JerkSONPatterns.nameCookies.matcher(itemName);
		if (matcher.find())
		{
			numberOfCookie++;
			numberOfItemName = numberOfCookie;
		}

		matcher = JerkSONPatterns.nameMilk.matcher(itemName);
		if (matcher.find())
		{
			numberOfMilk++;
			numberOfItemName = numberOfMilk;
		}
	}

	private void timesItemPriceAppears()
	{
		if (itemName.equalsIgnoreCase("Apples")) {
			matcher = JerkSONPatterns.priceValue23.matcher(itemPrice);
			if (matcher.find()) {
				cheapApplePriceCount++;
			}
			else
			{
				expensiveApplePriceCount++;
			}
		}

		if (itemName.equalsIgnoreCase("Bread")) {
			matcher = JerkSONPatterns.priceValue123.matcher(itemPrice);
			if (matcher.find()) {
					basicBreadPriceCount++;
			}
		}

		if (itemName.equalsIgnoreCase("Cookie")) {
			matcher = JerkSONPatterns.priceValue225.matcher(itemPrice);
			if (matcher.find()) {
				basicCookiePriceCount++;
			}
		}

		if(itemName.equalsIgnoreCase("Milk")) {
			matcher = JerkSONPatterns.priceValue323.matcher(itemPrice);
			if (matcher.find()) {
				expensiveMilkPriceCount++;
			}
			else
			{
				cheapMilkPriceCount++;
			}
		}
	}

	private void setTariqTrollCount()
	{
		if (itemName == "Hell to the no, to the no, no, no.")
		{
			tariqTrollCount++;
		}
		else if (itemPrice == "Hell to the no, to the no, no, no.")
		{
			tariqTrollCount++;
		}
		else if (itemType == "Hell to the no, to the no, no, no.")
		{
			tariqTrollCount++;
		}
		else if (itemExpirationDate == "Hell to the no, to the no, no, no.")
		{
			tariqTrollCount++;
		}
	}
}
