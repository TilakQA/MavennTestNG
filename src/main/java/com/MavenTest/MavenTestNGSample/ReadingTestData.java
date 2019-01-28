package com.MavenTest.MavenTestNGSample;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTestData {
	private String cellValue;
/*	public static void main(String[] args) {
		ReadingTestData rtd=new ReadingTestData();
		rtd.testData();
	}*/
	public String getTestData() {
		File xlFile = new File("TestData/TestData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(xlFile);
			Workbook excelFile = new XSSFWorkbook(fis);
			Sheet currentWS = excelFile.getSheetAt(0);
			for (int i = 0; i <= currentWS.getLastRowNum(); i++) {
				Row currentRow = currentWS.getRow(i);

				for (int j = 0; j < currentRow.getLastCellNum(); j++) {
					Cell currentCell = currentRow.getCell(j);
//					System.out.print(currentCell.getStringCellValue() + "\t\t");
					cellValue = currentCell.getStringCellValue();
				}
			}
			excelFile.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cellValue;
	}

}
