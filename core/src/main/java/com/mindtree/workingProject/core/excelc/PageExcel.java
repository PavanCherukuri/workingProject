package com.mindtree.workingProject.core.excelc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PageExcel {

	public List<PagePojo> returnDataToService(String path) throws FileNotFoundException 
	{
		XSSFWorkbook wb = null;
		String pather=""+path;
		FileInputStream readFile = new FileInputStream(pather);
		List<PagePojo> ls=new ArrayList<PagePojo>();
		try {
			wb = new XSSFWorkbook(readFile);
			XSSFSheet sh = wb.getSheetAt(0);
			int firstRow = sh.getFirstRowNum();
			int lastRow = sh.getLastRowNum();
			for (int i = firstRow + 1; i <= lastRow; i++) {
				XSSFRow r = sh.getRow(i);
				String pageName=r.getCell(0).getStringCellValue();
				String pagePath=r.getCell(1).getStringCellValue();
				String templatePath=r.getCell(2).getStringCellValue();
				String pageTitle=r.getCell(3).getStringCellValue();
				String name=r.getCell(4).getStringCellValue();
				String gender=r.getCell(5).getStringCellValue();
			    PagePojo data=new PagePojo(pageName,pagePath,templatePath,pageTitle,name,gender);
				ls.add(data);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
}
}
