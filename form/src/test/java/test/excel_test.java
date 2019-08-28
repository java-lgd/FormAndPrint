package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class excel_test {

	@Test
	public void test() throws Exception {
		String fileName = "D:\\Desktop\\XLS.xls";
		InputStream is = new FileInputStream(new File(fileName));
		Workbook hssfWorkbook = null;
		if (fileName.endsWith("xlsx")) {
			hssfWorkbook = new XSSFWorkbook(is);// Excel 2007
		} else if (fileName.endsWith("xls")) {
			hssfWorkbook = new HSSFWorkbook(is);// Excel 2003
		}
		Sheet sheet = hssfWorkbook.getSheetAt(0);
		for (int rowNum = sheet.getFirstRowNum(); rowNum <=sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(0);
			System.out.println(cell.getStringCellValue()); // Ҫ���ж�����
		}
	}
	
	@Test
	public void test2() throws Exception{
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("�ɼ���");
		HSSFRow row=sheet.createRow(0);
		HSSFCell cell=row.createCell(0);
		 //���õ�Ԫ������
		cell.setCellValue("ѧԱ���Գɼ�һ����");
		//�ϲ���Ԫ��CellRangeAddress����������α�ʾ��ʼ�У������У���ʼ�У� ������
		//sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));
		//���Excel�ļ�
		        OutputStream output=new FileOutputStream("D:\\Desktop\\XLS1.xls");
//		        OutputStream output=response.getOutputStream();
//		        response.reset();
//		        response.setHeader("Content-disposition", "attachment; filename=details.xls");
//		        response.setContentType("application/msexcel");
		        wb.write(output);
		        output.close();
	}
	
}
