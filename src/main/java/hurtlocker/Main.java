package hurtlocker;

import org.apache.commons.io.IOUtils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
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
		RawDataParser parseData = new RawDataParser();
		Invoice invoice1 = new Invoice();
		FileOutputStream receipt = new FileOutputStream("invoiceCopy.txt");
		BufferedOutputStream filteredReceipt = new BufferedOutputStream(receipt);
		PrintStream printedReceipt = new PrintStream(filteredReceipt, true);
		System.setOut(printedReceipt);


		String output = (new Main()).readRawDataToString();
		List<String[]> shoppingListRaw = parseData.composeNewList(output);
		ShoppingListItem[] realShoppingList = parseData.manifestArrayOfShoppingListItems(shoppingListRaw);
		String printedInvoice = invoice1.printInvoice(realShoppingList);
        System.out.print(printedInvoice);

    }
}
