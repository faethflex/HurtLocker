package hurtlocker;

import java.util.regex.Pattern;

/**
 * Created by gregoryfletcher on 5/31/17.
 */
public class JerkSONPatterns
{
	public static Pattern nameCapture = Pattern.compile("[A-z]+?:[A-z]+\\\\*");
	public static Pattern priceCapture = Pattern.compile("[A-z]+?:\\d+^[A-z]+\\\\*");
	public static Pattern typeCapture = Pattern.compile("[A-z]+?:[fF][A-z]+\\b");
	public static Pattern expirationCapture = Pattern.compile("[A-z]+\\d+/\\d+/\\d+\\b");

	public static Pattern[] jerkSonPatternArray = {nameCapture, priceCapture, typeCapture, expirationCapture};

	public static Pattern nameMilk = Pattern.compile("[A-z]{4}");
	public static Pattern nameApples = Pattern.compile("[A-z]{6}");
	public static Pattern nameBread = Pattern.compile("[A-z]{5}");
	public static Pattern nameCookies = Pattern.compile("[A-z,0-9]{7}");

	public static Pattern priceValue23 = Pattern.compile("\\.23");
	public static Pattern priceValue25 = Pattern.compile("\\.25");
	public static Pattern priceValue123 = Pattern.compile("1\\.23");
	public static Pattern priceValue225 = Pattern.compile("2\\.25");
	public static Pattern priceValue323 = Pattern.compile("3\\.23");

}
