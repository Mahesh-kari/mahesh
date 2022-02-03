package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Singlewrite 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream fis=new FileInputStream("./Excel/trail.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet s = book.getSheet("Sheet1");
Row r = s.createRow(1);
Cell c = r.createCell(1);
c.setCellValue("hey");
FileOutputStream fout = new FileOutputStream("./Excel/trail.xlsx");
book.write(fout);
}
}

