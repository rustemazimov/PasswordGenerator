package passwordgenerator;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class MainWorker {
	private int passwordLength;
	private int passwordCount;
	private int coloumnCount;
	private String path;
	public MainWorker(int passwordLength, int passwordCount, int coloumnCount, String path) throws FileNotFoundException, NotExcelFileException, IOException, InvalidFormatException {
		//Initialize fields
		this.passwordLength = passwordLength;
		this.passwordCount = passwordCount;
		this.coloumnCount = coloumnCount;
		this.path = path;
		work();
	}
	private void work() throws FileNotFoundException, NotExcelFileException, IOException, InvalidFormatException {
		new ReadWriter().uploadToFile(this.path, generateMatrixForFileO());
		
	}
	private String[][] generateMatrixForFileO() {
		PasswordFactory passwordFactory = new PasswordFactory(this.passwordLength);
		String[][] data = new String[this.passwordCount][this.coloumnCount];
		for (int i = 0; i < data.length ; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = passwordFactory.generatePassword();
			}
		}
		return data;
	}
}
