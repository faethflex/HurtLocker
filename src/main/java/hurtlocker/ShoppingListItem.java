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
	static int expensiveMilkPriceCount;
	static int cheapMilkPriceCount;
	static int expensiveApplePriceCount;
	static int cheapApplePriceCount;
	static int basicCookiePriceCount;
	static int basicBreadPriceCount;
	static int tariqTrollCount;

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

	}

	private void setTariqTrollCount()
	{

	}
}
