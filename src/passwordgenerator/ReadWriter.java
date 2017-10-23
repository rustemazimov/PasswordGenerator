/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Rustem Azimov
 */
public class ReadWriter {
    public void uploadToFile(String path, String[][] data) throws FileNotFoundException/*, NotExcelFileException*/, IOException, InvalidFormatException, NotExcelFileException {
        if(!path.endsWith(".xlsx"))
        {
            throw new NotExcelFileException();
        }
       //Create new workbook and tab
      Workbook wb = new XSSFWorkbook();//WorkbookFactory.create(new File(path));
      FileOutputStream fileOut = new FileOutputStream(path);
      Sheet sheet = wb.createSheet("Sheet");

      //Create 2D Cell Array
      Row[] row = new Row[data.length];
      Cell[][] cell = new Cell[row.length][];

      //Define and Assign Cell Data from Given
      for(int i = 0; i < row.length; i ++)
      {
          row[i] = sheet.createRow(i);
          cell[i] = new Cell[data[i].length];

          for(int j = 0; j < cell[i].length; j ++)
          {
              cell[i][j] = row[i].createCell(j);
              cell[i][j].setCellValue(data[i][j]);
              sheet.autoSizeColumn(cell[i][j].getColumnIndex());
          }
      }
      wb.write(fileOut);
      fileOut.flush();
      fileOut.close();
    }
}
