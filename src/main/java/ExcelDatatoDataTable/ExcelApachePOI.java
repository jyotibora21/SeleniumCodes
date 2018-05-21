package ExcelDatatoDataTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import edu.emory.mathcs.backport.java.util.Collections;

public class ExcelApachePOI {

	public  List<List<String>>  getsheetData () throws IOException {
		// TODO Auto-generated method stub

		String excelFilePath = "C:\\Users\\boraajyo\\Documents\\Wkspc\\WebDriverTestCucumber\\target\\ExcelFile\\NewTask.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
         
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Task");
        int rowcount = sheet.getLastRowNum();
        List<List<String>> outerList = new LinkedList<List<String>>();
        for (int i =sheet.getFirstRowNum() ;i <rowcount;i++)
        {
        	 List<String> innerList =  new LinkedList<String>();
        	XSSFRow xssfrow = sheet.getRow(i);
        	for(int j =xssfrow.getFirstCellNum();j<xssfrow.getLastCellNum();j++)
        	{
        		innerList.add(xssfrow.getCell(j).getStringCellValue());
        				
        	}
        	outerList.add(Collections.unmodifiableList(innerList));
        }
        return outerList;
	}

}
