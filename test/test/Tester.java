/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import passwordgenerator.MainWorker;
import passwordgenerator.NotExcelFileException;
import passwordgenerator.PasswordFactory;
import passwordgenerator.ReadWriter;

/**
 *
 * @author Rustem
 */
public class Tester {
    public static void main(String[] args) throws IOException, InvalidFormatException, FileNotFoundException, NotExcelFileException {
            /*ReadWriter rW = new ReadWriter();
        try {
            rW.uploadToFile("C:\\Users\\Rustem\\Desktop\\development\\tests\\test.xlsx", new String[][]{
                new String[]{"Name", "Surname"},
                new String[]{"Rustem", "Azimov"}
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotExcelFileException ex) {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        /*PasswordFactory pF = new PasswordFactory(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(pF.generatePassword());
        }*/
        /*MainWorker mW = new MainWorker(12, 100, 10, "");
        String[][] data = mW.generateMatrixForFileO();
        for (String[] row : data) {
            for(String item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }*/
    }
}
