package com.qa.web.page.locators;

public class NseIndiaPO {
	public static String URL = "https://www.nseindia.com/";
	public static String marketValueText = "//ul[@class='advanceTab']/li/p";
	public static String markentValueValues = "//ul[@class='advanceTab']/li/span";
	public static String keyWord = "keyword";
	public static String faceValue = "//span[@id='faceValue']";
	public static String high52 = "//span[@id='high52']/font";
	public static String low52 = "//span[@id='low52']/font";
	public static String liveMarket = "//a[text()='Live Market']";
	public static String topTenGainers = "//a[contains(text(),'Top Ten Gainers / Losers')]";
	public static String topGainers = "//table[@id='topGainers']";
	public static String topLosers = "//table[@id='topLosers']";
	public static String getDateNSE = "//span[@id='dataTime']";
	public static String clickOnLosers = "//a[@id='tab8']";
	public static String mouseOverOnLive = "//a[text()='Live Market']";
	public static String topGainersLosers = "//*[@id='main_liveany_ttg']/a";
	public static String clickOnGainer = "//a[@id='tab7']";
}
