package hurtlockertest;

import hurtlocker.ShoppingListItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gregoryfletcher on 6/1/17.
 */
public class ShoppingListItemTest
{
	ShoppingListItem prototype;
	ShoppingListItem cloneOfPrototype;
	ShoppingListItem tariqTroll;

	@Before
	public void startup()
	{
		prototype = new ShoppingListItem("Milk", "1.23", "Food", "2/25/2016");
		cloneOfPrototype = new ShoppingListItem("Milk", "1.23", "Food", "2/25/2016");
		tariqTroll = new ShoppingListItem("Hell to the no, to the no, no, no.", "1.23", "Food", "2/25/2016");
	}

	@Test
	public void testEquals()
	{
		Assert.assertTrue(prototype.equals(cloneOfPrototype));
	}

	@Test
	public void testToString()
	{
		// given
		String expected = "Milk 1.23 Food 2/25/2016";

		// when
		String actual = prototype.toString();

		// then
		Assert.assertEquals("These strings should be identical", expected, actual);
	}

	@Test
	public void testTimesItemNameAppears()
	{
		// given
		int expected = 2;

		// when
		int actual = ShoppingListItem.numberOfMilk;

		// then
		Assert.assertEquals("These values should be equal", expected, actual);
	}

	@Test
	public void testTimesItemPriceAppears()
	{
		// given
		int expected = 2;

		// when
		int actual = ShoppingListItem.cheapMilkPriceCount;

		// then
		Assert.assertEquals("These counts should be equal", expected, actual);
	}

	@Test
	public void testSetTariqTrollCount()
	{
		// given
		int expected = 1;

		// when
		int actual = ShoppingListItem.tariqTrollCount;

		// then
		Assert.assertEquals("These counts should be the same", expected, actual);
	}
}
