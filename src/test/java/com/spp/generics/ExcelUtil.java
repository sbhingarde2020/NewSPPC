package com.spp.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.IndexedColors;

public class ExcelUtil {
	private String filenm = null; 
	private Sheet ws = null;
	private FormulaEvaluator evaluator;
	
	public ExcelUtil(String fileName, String sheetName)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		filenm = fileName ;
		setWs(getWorkSheet(fileName, sheetName));
	}
	
	public ExcelUtil(String fileName)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		filenm = fileName ;
		setWs(getWorkSheet(fileName));
	}

	public Sheet getWs() {
		return ws;
	}

	public void setWs(Sheet ws) {
		this.ws = ws;
	}

	public Sheet getWorkSheet(String fileName, String sheetName)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		filenm = fileName ;
		FileInputStream fis = new FileInputStream(new File(fileName));
		Workbook wb = WorkbookFactory.create(fis);
		
		//System.out.println(wb.getAllNames());
		return wb.getSheet(sheetName);
	}
	
	public Sheet getWorkSheet(String fileName)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		filenm = fileName ;
		FileInputStream fis = new FileInputStream(new File(fileName));
		Workbook wb = WorkbookFactory.create(fis);
		//System.out.println(wb.getAllNames());
		
		/******/
		evaluator = wb.getCreationHelper().createFormulaEvaluator();
		//evaluator.evaluateAll();
		
		/************/
		//Row rw = getWs().getRow(row);
		//int str_2 = CellReference.convertColStringToIndex(colName);
		//rw.createCell(str_2).setCellValue(setValue);
		//setValue(1, "A", "ABCD");
		
		//FileOutputStream out = new FileOutputStream(fileName);
        //wb.write(out);
        //out.close();
		/******/
		return wb.getSheetAt(0);
	}

	public int getRowCount() {
		return getWs().getPhysicalNumberOfRows();
	}

	public int getColumnCount() {
		return getWs().getRow(0).getPhysicalNumberOfCells();
	}

	public String getValue(int row, String colName) {
		//DataFormatter df = new DataFormatter();
		Row rw = getWs().getRow(row);
		// String str1=Util.getProperty(col);
		String str1 = colName;
		int str_2 = CellReference.convertColStringToIndex(str1);
		Cell cell = rw.getCell(str_2);
		String cellValue = null;		
		/**************-------*******************/
		
		if (cell != null) {

			CellType cType = cell.getCellTypeEnum() ;
			if (cType.equals(CellType.FORMULA)){
				cType = cell.getCachedFormulaResultTypeEnum() ;
			}
			switch (cType) {

			case NUMERIC:
				//here we are using long instead of double
				long l = (long)cell.getNumericCellValue();
				cellValue = String.valueOf(l);
				break;

			case STRING:
				cellValue = "" + cell.getStringCellValue();
				break;

			case BLANK:
				cellValue = "[BLANK]";
				break;

			case ERROR:
				cellValue = "" + cell.getErrorCellValue();
				break;
			default:
			}
			//System.out.print(value[r][c]);

		}
		
		/***************--------*********************/

		return cellValue;
	}

	public String getValueD(int row, String colName) {
		//DataFormatter df = new DataFormatter();
		Row rw = getWs().getRow(row);
		// String str1=Util.getProperty(col);
		String str1 = colName;
		int str_2 = CellReference.convertColStringToIndex(str1);
		//System.out.println("cname: " + colName + " cidx: " + str_2);
		
		Cell cell = rw.getCell(str_2);
		String cellValue = null;		
		/**************-------*******************/
		
		if (cell != null) {

			CellType cType = cell.getCellTypeEnum() ;
			if (cType.equals(CellType.FORMULA)){
				cType = cell.getCachedFormulaResultTypeEnum() ;
				//System.out.println("formula !");
				cell = evaluator.evaluateInCell(cell) ;
			}
			
			//System.out.println("ctype: " + cType);
			switch (cType) {

			case NUMERIC:
				//here we are using Double instead of long
				double l = cell.getNumericCellValue();
				
				//System.out.println("cvalue: " + l);
				//System.out.println("cvalue: " + cell.getColumnIndex());
				//System.out.println("cvalue: " + cell.getRowIndex());				
				cellValue = String.valueOf(l);
				break;

			case STRING:
				cellValue = "" + cell.getStringCellValue();
				break;

			case BLANK:
				cellValue = "[BLANK]";
				break;

			case ERROR:
				cellValue = "" + cell.getErrorCellValue();
				break;
			default:
			}
			//System.out.print(value[r][c]);

		}
		
		/***************--------*********************/

		return cellValue;
	}
	
	
	public void setValue(int row, String colName, String setValue) {
		Row rw = getWs().getRow(row);
		int str_2 = CellReference.convertColStringToIndex(colName);
		rw.createCell(str_2).setCellValue(setValue);

	}

	// public static String getCellProperty(Row row, String propertyName) {
	// return new
	// DataFormatter().formatCellValue(row.getCell(CellReference.convertColStringToIndex(Util
	// .getProperty(propertyName))));
	// }
	//
	// public static int getCellIndex(String property) {
	// return CellReference.convertColStringToIndex(Util.getProperty(property));
	// }

	public String[][] getArray() {

		// get number of rows from sheet
		int rows = ws.getPhysicalNumberOfRows();
		//int rows = ws.getLastRowNum();
		
		// get number of cell from row
		//int cells = ws.getRow(0).getPhysicalNumberOfCells();
		int cells = ws.getRow(0).getLastCellNum() ;

		String value[][] = new String[rows][cells];
		try {	
			for (int r = 0; r < rows; r++) {
				Row row = ws.getRow(r); // bring row
				if (row != null) {
					for (int c = 0; c < cells; c++) {
						Cell cell = row.getCell(c);
						if (cell != null) {

							CellType cType = cell.getCellTypeEnum() ;
							if (cType.equals(CellType.FORMULA)){
								cType = cell.getCachedFormulaResultTypeEnum() ;
							}

							switch (cType) {

							case NUMERIC:
								long l = (long)cell.getNumericCellValue();
								value[r][c] = String.valueOf(l);
								break;

							case STRING:
								value[r][c] = "" + cell.getStringCellValue();
								break;

							case BLANK:
								value[r][c] = "[BLANK]";
								break;

							case ERROR:
								value[r][c] = "" + cell.getErrorCellValue();
								break;
							default:
							}
							//System.out.print(value[r][c]);

						} else {
							//System.out.print("[null]\t");
						}
					} // for(c)
					//System.out.print("\n");
				}
			}
		}// for(r)

		catch(Exception e)
		{
			e.printStackTrace();
		}

		return value ;
	}
	
	public int[] getRows(String id) {

		// get number of rows from sheet
		//int rows = ws.getPhysicalNumberOfRows();
		int rows = ws.getLastRowNum() ;

		ArrayList<Integer> al = new ArrayList<Integer>() ;
		String s = null ;
		try {	
			for (int r = 0; r <= rows; r++) {
				s = null ; // reset s to null at each iteration
				Row row = ws.getRow(r); // bring row
				if (row != null) {
						Cell cell = row.getCell(0);
						if (cell != null) {

							CellType cType = cell.getCellTypeEnum() ;
							if (cType.equals(CellType.FORMULA)){
								cType = cell.getCachedFormulaResultTypeEnum() ;
							}

							switch (cType) {

							case NUMERIC:
								long l = (long)cell.getNumericCellValue();
								s = String.valueOf(l);
								break;

							case STRING:
								s = "" + cell.getStringCellValue();
								break;

							case BLANK:
								s = "[BLANK]";
								break;

							case ERROR:
								s = "" + cell.getErrorCellValue();
								break;
							default:
							}
							//System.out.print(value[r][c]);

						} else {
							
							//System.out.print("[null]\t");
						}
					}
					if(s != null && s.equalsIgnoreCase(id)) {
						al.add(r) ;
					}
				
				}// for(r)
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		int[] intArray = new int[al.size()];
		for (int i = 0; i < intArray.length; i++) {
		    intArray[i] = al.get(i);
		}
		
		return intArray ;
	}

	public String[] getColumn(String colName) {
		
		// get number of rows from sheet
		int rows = ws.getPhysicalNumberOfRows();
		//int rows = ws.getLastRowNum();
		
		// get number of cell from row
		//int cells = ws.getRow(0).getPhysicalNumberOfCells();
		int cells = ws.getRow(0).getLastCellNum() ;

		int c = CellReference.convertColStringToIndex(colName) ;
		
		if (c > cells) {
			return null ; //colName is beyond the last column with data.
		}
		
		String value[] = new String[rows];
		try {	
			for (int r = 0; r < rows; r++) {
				Row row = ws.getRow(r); // bring row
				if (row != null) {
						Cell cell = row.getCell(c);
						if (cell != null) {

							CellType cType = cell.getCellTypeEnum() ;
							if (cType.equals(CellType.FORMULA)){
								cType = cell.getCachedFormulaResultTypeEnum() ;
							}

							switch (cType) {

							case NUMERIC:
								long l = (long)cell.getNumericCellValue();
								value[r] = String.valueOf(l);
								break;

							case STRING:
								value[r] = "" + cell.getStringCellValue();
								break;

							case BLANK:
								value[r] = "[BLANK]";
								break;

							case ERROR:
								value[r] = "" + cell.getErrorCellValue();
								break;
							default:
							}
							//System.out.print(value[r][c]);

						} else {
							//System.out.print("[null]\t");
						}
				}
			}
		}// for(r)

		catch(Exception e)
		{
			e.printStackTrace();
		}

		return value ;
	}
	
	public void appendInColumn(String colName, ArrayList<String> data) throws IOException {

		// get number of rows from sheet
		//int rows = ws.getPhysicalNumberOfRows();
		int rows = ws.getPhysicalNumberOfRows();

		// get number of cell from row
		//int cells = ws.getRow(0).getPhysicalNumberOfCells();
		//int cells = ws.getRow(0).getLastCellNum() ;

		int c = CellReference.convertColStringToIndex(colName) ;

		//get first row where column data is null
		int firstrow = rows ;
		for (int r = 0; r < rows; r++) {
			Row row = ws.getRow(r); // bring row
			if (row != null) {
				Cell cell = row.getCell(c);
				if (cell == null) {
					firstrow = r ;
					break ;
				} else {
					continue ;
				}
			} else {
				firstrow = r ;
				break ;
			}
		}// for(r)
		
		for (int d1=0, d2 = firstrow; d2 < (firstrow + data.size()) ; d1++, d2++) {
			Row row = ws.getRow(d2); 
			if (row == null) {
				row = ws.createRow(d2) ;
			}
			Cell cell = row.getCell(c);
			if (cell == null) {
				cell = row.createCell(c) ;
			} else {
				System.out.println(cell.getStringCellValue() + " <----");
			}
			cell.setCellValue(data.get(d1));
		}
		
		try {
		    FileOutputStream out = new FileOutputStream(filenm);
		    ws.getWorkbook().write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    //do something
		}
		
	}	
	
	public static void createWorkbook (String fileName) throws IOException {
		
		Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet("Sheet1");
	    
	    FileOutputStream fos =new FileOutputStream(new File(fileName));
	    workbook.write(fos);
	    fos.close();
		
		
	}
	public static void setupWorkSheet (String filename) throws IOException
	{
		Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet("Sheet1");
	    Row row = sheet.createRow(0);

	 
	    CellStyle style = workbook.createCellStyle();
	    
	    style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
	    
	    Cell cell1 = row.createCell(0);
	    cell1.setCellValue("Sr. No.");
	    cell1.setCellStyle(style);
	    
	    Cell cell2 = row.createCell(1);
	    cell2.setCellValue("Regulatory Authority");
	    cell2.setCellStyle(style);
		
	    Cell cell3 = row.createCell(2);
	    cell3.setCellValue("Date");
	    cell3.setCellStyle(style);
	    
	    Cell cell4 = row.createCell(3);
	    cell4.setCellValue("Circular No");
	    cell4.setCellStyle(style);
	    
	    Cell cell5 = row.createCell(4);
	    cell5.setCellValue("Title");
	    cell5.setCellStyle(style);
	    
	    Cell cell6 = row.createCell(5);
	    cell6.setCellValue("Gist");
	    cell6.setCellStyle(style);
	    
	    Cell cell7 = row.createCell(6);
	    cell7.setCellValue("Department");
	    cell7.setCellStyle(style);
	    
	    
	    Cell cell8 = row.createCell(7);
	    cell8.setCellValue("Download Status");
	    cell8.setCellStyle(style);
	    
	    FileOutputStream fos =new FileOutputStream(new File(filename));
	    workbook.write(fos);
	    fos.close();
	    		
	}
	public  String getNeighbourCellValue(String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		Sheet sheet = getWs();

		  for (Row row : sheet) { // For each Row.
		      Cell cell = row.getCell(0);
		      String value=cell.getStringCellValue();
		     
		      if(value.equals(data))
		      {
		    	Row rowNum=  cell.getRow();
		    	String result=rowNum.getCell(1).getStringCellValue();
		    	return result;
		      }
		      
		      
		  }
		return null;
	}
	
	public void setCellValueExistingExcel (int row, int col, String value) throws IOException
	{
		Sheet sheet = getWs();
		 Cell cell = null;

		 cell = sheet.getRow(row).getCell(col);
		 
		 cell.setCellValue(value);
		
		 try {
			    FileOutputStream out = new FileOutputStream(filenm);
			    sheet.getWorkbook().write(out);
			    out.close();
			} catch (FileNotFoundException ex) {
			    //do something
			}
		
	}
	
	
	 public void deleteColumn(int columnToDelete){   
		 Sheet sheet = getWs();
	        int maxColumn = 0;
	        for ( int r=0; r < sheet.getLastRowNum()+1; r++ ){
	            Row row     = sheet.getRow(r);
	 
	            
	            // if no row exists here; then nothing to do; next!
	            if ( row == null )
	                continue;
	 
	            // if the row doesn't have this many columns then we are good; next!
	            int lastColumn = row.getLastCellNum();
	            if ( lastColumn > maxColumn )
	                maxColumn = lastColumn;
	 
	            if ( lastColumn < columnToDelete )
	                continue;
	 
	            for ( int x=columnToDelete+1; x < lastColumn + 1; x++ ){
	                Cell oldCell    = row.getCell(x-1);
	                if ( oldCell != null )
	                    row.removeCell( oldCell );
	                	
	                Cell nextCell   = row.getCell( x );
	                if ( nextCell != null ){
	                  //  Cell newCell    = row.createCell( x-1, nextCell.getCellType() );
	                    Cell newCell    = row.createCell(x-1, nextCell.getCellTypeEnum());
	                    cloneCell(newCell, nextCell);
	                }
	            }
	        }
	    }
	 
	    private void cloneCell( Cell cNew, Cell cOld ){
	        cNew.setCellComment( cOld.getCellComment() );
	        cNew.setCellStyle( cOld.getCellStyle() );
	 
	        switch ( cNew.getCellTypeEnum() ){
	            case BOOLEAN:{
	                cNew.setCellValue( cOld.getBooleanCellValue() );
	                break;
	            }
	            case NUMERIC:{
	                cNew.setCellValue( cOld.getNumericCellValue() );
	                break;
	            }
	            case STRING:{
	                cNew.setCellValue( cOld.getStringCellValue() );
	                break;
	            }
	            case ERROR:{
	                cNew.setCellValue( cOld.getErrorCellValue() );
	                break;
	            }
	            case FORMULA:{
	                cNew.setCellFormula( cOld.getCellFormula() );
	                break;
	            }
	            
	            default: break;
	        }
	 
	    }
	public void deleteColumnInExcel(String colName) throws IOException
	{
		
		Sheet sheet = getWs();
		
		int rows = sheet.getPhysicalNumberOfRows();
		
		// get number of cell from row
		//int cells = ws.getRow(0).getPhysicalNumberOfCells();
		int cells = ws.getRow(0).getLastCellNum() ;

		int c = CellReference.convertColStringToIndex(colName) ;
		
		if (c > cells) {
			return ; //colName is beyond the last column with data.
		}
		
		try {	
			for (int r = 0; r < rows; r++)
			 {
				Row row = ws.getRow(r); // bring row
				if (row != null) 
				{
						Cell cell = row.getCell(c);
						
						row.removeCell(cell);
				
				}		
		
			}

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
		    FileOutputStream out = new FileOutputStream(filenm);
		    sheet.getWorkbook().write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    //do something
		}
	}
	
	public void setColumn(String colName, String[] colData) throws IOException
	{
		int c = CellReference.convertColStringToIndex(colName) ;
		Sheet sheet = getWs();
		try {	
			for (int r = 0; r < colData.length; r++)
			 {
				Row row = ws.getRow(r); // bring row
				if (row != null) 
				{
						Cell cell = row.getCell(c);
						
						cell.setCellValue(colData[c]);
						System.out.println(colData[c]+"   "+cell.getStringCellValue());
				
				}		
		
			}

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
		    FileOutputStream out = new FileOutputStream(filenm);
		    sheet.getWorkbook().write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    //do something
		}
		
	}
	
	public  void setupWorkSheetIlliquidScripts (String filename) throws IOException
	{
		Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet("Sheet1");
	    Row row = sheet.createRow(0);
	    
	    Cell cell1 = row.createCell(0);
	    cell1.setCellValue("Sr. no.");
	    
	    Cell cell2 = row.createCell(1);
	    cell2.setCellValue("Scrip Code");
	    
	    Cell cell3 = row.createCell(2);
	    cell3.setCellValue("Scrip Long Name");
	    
	    FileOutputStream fos =new FileOutputStream(new File(filename));
	    workbook.write(fos);
	    fos.close();
	    
	    
	    
	    
	}
	
	public  void removeRow( int rowIndex) throws IOException 
	{
		
		Sheet sheet = getWs();
		
		Row row = sheet.getRow(rowIndex);
	            sheet.removeRow(row);
	            sheet.shiftRows(rowIndex + 1, sheet.getLastRowNum(), -1);
	            try {
				    FileOutputStream out = new FileOutputStream(filenm);
				    sheet.getWorkbook().write(out);
				    out.close();
				} catch (FileNotFoundException ex) {
				    //do something
				}
	        }
	/*public static void createXLSWorkbook (String fileName, String sheetName) throws IOException, EncryptedDocumentException, InvalidFormatException {

		   FileInputStream fis = new FileInputStream(new File(fileName));
		   HSSFWorkbook workbook = (HSSFWorkbook) WorkbookFactory.create(fis);
		   
		   ws = workbook.getSheet()
				   
		   FileOutputStream fos =new FileOutputStream(new File(fileName));
		   workbook.write(fos);
		   fos.close();
		}*/
	

	   
}	