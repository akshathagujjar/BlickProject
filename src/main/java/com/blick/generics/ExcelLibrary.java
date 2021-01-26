package com.blick.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary 
{
	public static String cellValue(String sheet , int row, int cell) throws IOException
	{
		FileInputStream f = new FileInputStream("./testdata/Blick.xlsx");
		XSSFWorkbook xb = new XSSFWorkbook(f);
		String cellVal = xb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellVal;
		
	}
}
