package com.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {

	public String execute() {
		try {
			String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
			File fileToCreate = new File(filePath, this.excelDataFileName);
			FileUtils.copyFile(this.excelData, fileToCreate);
			UploadExcel obj = new UploadExcel();
			obj.readExcel(excelData.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return INPUT;
		}
		return SUCCESS;
	}


	public void readExcel(String filePath) {
		try {
			FileInputStream file = new FileInputStream(new File(filePath));

			// Getting the instance for XLS file
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			// Get First sheet from the workbook
			HSSFSheet sheet = workbook.getSheetAt(0);

			ArrayList myList = new ArrayList();
			// Iterate start from the first sheet of the uploaded excel file
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				if (row.getRowNum() == 0) {
					continue;// skip to read the first row of file
				}

				// For each row, iterate through each coulumns
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if (cell.getColumnIndex() == 0) {
						continue;
					}
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t\t");
						// myList.add(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t\t");
						// myList.add(cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t\t");
						// myList.add(cell.getStringCellValue());
						break;
					}

				}
				System.out.println("");

			}
			file.close();
			FileOutputStream out = new FileOutputStream(new File(filePath));

			workbook.write(out);
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
