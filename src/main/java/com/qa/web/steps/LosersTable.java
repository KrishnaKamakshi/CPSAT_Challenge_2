package com.qa.web.steps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import com.qa.config.BasicConfigChromeTestNG;

public class LosersTable extends BasicConfigChromeTestNG {

	public void testNamesSymbol() throws IOException

	{
		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet("LosersNSE");

		int rowCountName = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td/a")).size();
		System.out.println(rowCountName);
		for (int i = 0; i < rowCountName; i++) {
			String valueOfSymbol = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td/a")).get(i)
					.getText();

			Row rowAtV = sheet.createRow(i);
			Cell cellV = rowAtV.createCell(0);
			cellV.setCellValue(valueOfSymbol);

			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();

			;

		}

	}

	public void testDates() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[10]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolN = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[10]")).get(i)
					.getText();
			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVN = sheet.getRow(i);

			Cell cellVN = rowAtVN.createCell(9);
			cellVN.setCellValue(valueOfSymbolN);

			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();
		}
	}

	public void testLTP() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[2]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[2]")).get(i)
					.getText();

			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);

			Cell cellVN = rowAtVPer.createCell(1);
			cellVN.setCellValue(valueOfSymbolPerce);

			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();
		}
	}

	public void testPerChange() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[3]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[3]")).get(i)
					.getText();
			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);

			Cell cellVN = rowAtVPer.createCell(2);
			cellVN.setCellValue(valueOfSymbolPerce);

			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();
		}

	}

	public void testTradeQty() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[4]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[4]")).get(i)
					.getText();
			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);

			Cell cellVN = rowAtVPer.createCell(3);
			cellVN.setCellValue(valueOfSymbolPerce);

			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();
		}

	}

	public void testValues() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[5]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[5]")).get(i)
					.getText();
			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);
			Cell cellVN = rowAtVPer.createCell(4);
			cellVN.setCellValue(valueOfSymbolPerce);
			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();
		}

	}

	public void testOpen() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[6]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[6]")).get(i)
					.getText();
			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);
			Cell cellVN = rowAtVPer.createCell(5);
			cellVN.setCellValue(valueOfSymbolPerce);
			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();
		}

	}

	public void testHigh() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[7]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[7]")).get(i)
					.getText();
			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);
			Cell cellVN = rowAtVPer.createCell(6);
			cellVN.setCellValue(valueOfSymbolPerce);
			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();
		}

	}

	public void testLow() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("GainersNSETest");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[8]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[8]")).get(i)
					.getText();
			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);
			Cell cellVN = rowAtVPer.createCell(7);
			cellVN.setCellValue(valueOfSymbolPerce);
			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();
		}

	}

	public void testPreviousClose() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[9]")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[9]")).get(i)
					.getText();
			System.out.println(valueOfSymbolPerce);

			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);

			Cell cellVN = rowAtVPer.createCell(8);
			cellVN.setCellValue(valueOfSymbolPerce);

			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();

			System.out.println("Sheet Created");
		}

	}

	public void testCA() throws Exception {

		FileInputStream fis = new FileInputStream("src/main/resources/CompanyNames.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFSheet sheet = workbook.getSheet("LosersNSE");
		int rowCountNameNew = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[11]/img")).size();
		System.out.println(rowCountNameNew);
		for (int i = 0; i < rowCountNameNew; i++) {
			String valueOfSymbolPerce = driver.findElements(By.xpath("//table[@id='topLosers']/tbody/tr/td[11]/img"))
					.get(i).getAttribute("src");
			System.out.println(valueOfSymbolPerce);

			// Row rowAtVN = sheet.createRow(i);
			Row rowAtVPer = sheet.getRow(i);

			Cell cellVN = rowAtVPer.createCell(10);
			cellVN.setCellValue(valueOfSymbolPerce);

			FileOutputStream fos = new FileOutputStream("src/main/resources/CompanyNames.xlsx");
			workbook.write(fos);
			fos.close();

			System.out.println("Sheet Created");
		}

	}

}
