package webdriver;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReaderToDataProvider {

	public static String [][] getDataFromExcel(String xlsFilePath, String sheetName, String startPoint, String endPoint) throws BiffException, IOException{
		String [][] tabArray=null;
		//open an workbook
		Workbook workbook = Workbook.getWorkbook(new File(xlsFilePath));
		//open a sheet "Login"
		Sheet sheet = workbook.getSheet(sheetName);
		int startRow, startCol, endRow, endCol, ci, cj;
		//find a cell labeled with "StartPoint"
		Cell tableStart=sheet.findCell(startPoint);
		//get a row of that cell
		startRow=tableStart.getRow();
		//get a column of that cell
		startCol=tableStart.getColumn();
		//find a cell#2 labeled with "EndPoint"
		Cell tableEnd=sheet.findCell(endPoint);
		
		//get a row of that cell
		endRow=tableEnd.getRow();
		//get a column of that cell
		endCol=tableEnd.getColumn();
		
		tabArray = new String[endRow-startRow-1][endCol-startCol-1]; 
		for (ci=startRow+1; ci<endRow; ci++){
			for (cj=startCol+1; cj<endCol; cj++){
//				System.out.println("sheet cell ="+sheet.getCell(cj,ci).getContents()+" ci ="+ci+" cj = "+cj);
				int i = ci-startRow-1;
				int j = cj-startCol-1;
				tabArray[i][j]=sheet.getCell(cj,ci).getContents();
//				System.out.println("Value "+tabArray[i][j]);
			}
		}
		return tabArray;
	}
}
