package io.java.DB.Importer.View;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import io.java.DB.Importer.models.Product;

public class ExcelView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=\"product.xls\"");

		@SuppressWarnings("unchecked")
		List<Product> products = (List<Product>) model.get("Product");

		// create excel xls sheet
		Sheet sheet = workbook.createSheet("Product Detail");
		sheet.setDefaultColumnWidth(30);

		// create style for header cells
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.BLUE.index);
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		font.setBold(true);
		font.setColor(HSSFColor.WHITE.index);
		style.setFont(font);

		// create header row
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Id");
		header.getCell(0).setCellStyle(style);
		header.createCell(1).setCellValue("Name");
		header.getCell(1).setCellStyle(style);
		header.createCell(2).setCellValue("Type");
		header.getCell(2).setCellStyle(style);
		header.createCell(3).setCellValue("Location");
		header.getCell(3).setCellStyle(style);
		header.createCell(4).setCellValue("Attributes");
		header.getCell(4).setCellStyle(style);
		header.createCell(5).setCellValue("Comments");
		header.getCell(5).setCellStyle(style);
		header.createCell(6).setCellValue("Availability");
		header.getCell(6).setCellStyle(style);
		header.createCell(7).setCellValue("Production");
		header.getCell(7).setCellStyle(style);
		header.createCell(8).setCellValue("Requriment");
		header.getCell(8).setCellStyle(style);
		header.createCell(9).setCellValue("Review");
		header.getCell(9).setCellStyle(style);
		header.createCell(10).setCellValue("Quantity");
		header.getCell(10).setCellStyle(style);
		header.createCell(11).setCellValue("Quality");
		header.getCell(11).setCellStyle(style);
		header.createCell(12).setCellValue("Rate");
		header.getCell(12).setCellStyle(style);
		header.createCell(13).setCellValue("Price");
		header.getCell(13).setCellStyle(style);
		header.createCell(14).setCellValue("Discount");
		header.getCell(14).setCellStyle(style);

		int rowCount = 1;

		for (Product p : products) {
			Row userRow = sheet.createRow(rowCount++);
			userRow.createCell(0).setCellValue(p.getId());
			userRow.createCell(1).setCellValue(p.getName());
			userRow.createCell(2).setCellValue(p.getType());
			userRow.createCell(3).setCellValue(p.getLocation());
			userRow.createCell(4).setCellValue(p.getAttributes());
			userRow.createCell(5).setCellValue(p.getComments());
			userRow.createCell(6).setCellValue(p.getAvailability());
			userRow.createCell(7).setCellValue(p.getProduction());
			userRow.createCell(9).setCellValue(p.getRequirement());
			userRow.createCell(10).setCellValue(p.getReview());
			userRow.createCell(11).setCellValue(p.getQuantity());
			userRow.createCell(12).setCellValue(p.getQuality());
			userRow.createCell(13).setCellValue(p.getRate());
			userRow.createCell(14).setCellValue(p.getPrice());
			userRow.createCell(15).setCellValue(p.getDiscount());

		}
	}

}

//response.setHeader("Content-Disposition", "attachment; filename=\"my-xls-file.xls\"");
