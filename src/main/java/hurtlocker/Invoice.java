package hurtlocker;

/**
 * Created by gregoryfletcher on 6/1/17.
 */
public class Invoice
{
	String invoiceCopy;

	public String printInvoice(ShoppingListItem[] items)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("name:    Milk \t\t seen: ");
		sb.append(ShoppingListItem.numberOfMilk);
		sb.append(" times\n");
		sb.append("=============     \t =============\n");
		sb.append("Price: \t 3.23\t\t seen: ");
		sb.append(ShoppingListItem.expensiveMilkPriceCount);
		sb.append(" times\n");
		sb.append("-------------        -------------\n");
		sb.append("Price: \t 1.23\t\t seen: ");
		sb.append(ShoppingListItem.cheapMilkPriceCount);
		sb.append(" time\n");
		sb.append("\n");
		sb.append("name:   Bread\t\t seen: ");
		sb.append(ShoppingListItem.numberOfBread);
		sb.append(" times\n");
		sb.append("=============     \t =============\n");
		sb.append("Price:   1.23\t\t seen: ");
		sb.append(ShoppingListItem.basicBreadPriceCount);
		sb.append(" times\n");
		sb.append("-------------        -------------\n");
		sb.append("\n");
		sb.append("name: Cookies     \t seen: ");
		sb.append(ShoppingListItem.numberOfCookie);
		sb.append(" times\n");
		sb.append("-------------        -------------\n");
		sb.append("\n");
		sb.append("name:  Apples     \t seen: ");
		sb.append(ShoppingListItem.numberOfApple);
		sb.append(" times\n");
		sb.append("=============     \t =============\n");
		sb.append("Price:   0.25     \t seen: ");
		sb.append(ShoppingListItem.expensiveApplePriceCount);
		sb.append(" times\n");
		sb.append("-------------     \t -------------\n");
		sb.append("Price:   0.23  \t \t seen: ");
		sb.append(ShoppingListItem.cheapApplePriceCount);
		sb.append(" times\n");
		sb.append("\n");
		sb.append("Errors         \t \t seen: ");
		sb.append(ShoppingListItem.tariqTrollCount);
		sb.append(" times\n");

		invoiceCopy = sb.toString();

		return invoiceCopy;
	}
}
