package com.spp.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellReference;

public abstract class Excel {
	private String filenm = null; 
	private Sheet ws = null;
	public static String getCellValue(String path,String sheet,int r,int c) {
		
		String value="";
		
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			value=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}
	
	
public static int getRowCount(String path,String sheet) {
		
		int no_r=0;
		
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			no_r=wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return no_r;
		
	}
public Sheet getWs() {
	return ws;
}
public void setValue(int row, String colName, String setValue) {
	Row rw = getWs().getRow(row);
	int str_2 = CellReference.convertColStringToIndex(colName);
	rw.createCell(str_2).setCellValue(setValue);

}

}
