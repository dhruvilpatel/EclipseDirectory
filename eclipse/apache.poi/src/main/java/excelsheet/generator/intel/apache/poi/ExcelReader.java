package excelsheet.generator.intel.apache.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static final String SAMPLE_XLSX_FILE_PATH = "/home/dhruvil/Desktop/WW04'18 P1274 TI Schedule Contractor.xls";
	public static final String SAMPLE_XLSX_FILE_DRIVER_READ = "/home/dhruvil/Desktop/F42 P1274 Lateral Worksheet_Rev-0_12_15_2017_3.01.xlsm";
	public static final String fileName = "/home/dhruvil/Desktop/output.csv";
	//CSV file header
	private static final String FILE_HEADER = "Driver, Design Start";
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	static FileWriter fileWriter = null;

	public static void main(String[] args) throws IOException, InvalidFormatException {

		HashMap<String, String> driverMap = new HashMap<String, String>();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		try{
			fileWriter = new FileWriter(fileName);
			//Write the CSV file header    	
			fileWriter.append(FILE_HEADER.toString());
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			FileInputStream inputStream = new FileInputStream(new File(SAMPLE_XLSX_FILE_DRIVER_READ));

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet firstSheet = workbook.getSheetAt(1);

			XSSFRow driverRow;
			XSSFCell driverCell;

			int driverRows;
			driverRows = firstSheet.getPhysicalNumberOfRows();

			int driverCols = 0 ;
			int driverTmp = 0;

			///////////////////////////////////////////////////////////////////////////////////////////////

			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(SAMPLE_XLSX_FILE_PATH));
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(1);
			HSSFRow row;
			HSSFCell driverName, driverDesignStartDate;

			int rows; // No of rows
			rows = sheet.getPhysicalNumberOfRows();

			int cols = 0; // No of columns
			int tmp = 0;

		
			for(int r = 2; r < rows; r++) {
				row = sheet.getRow(r);
				if(row != null) {

					driverName = row.getCell(4);
					driverDesignStartDate = row.getCell(17);

					if(driverName != null) {
						driverMap.put(driverName.toString().trim(),driverDesignStartDate.toString().trim());
					}


				}
			}
			/////////////////////////////////////////////////////////////////////////////////////////////////////


			// This trick ensures that we get the data properly even if it doesn't start from first few rows
		

			for(int r = 1; r < driverRows; r++) {
				driverRow = firstSheet.getRow(r);
				if(driverRow != null) {

					driverCell = driverRow.getCell(25);
					if(driverCell != null) {
						Date date1;
						String[] name = driverCell.toString().split(",");
						String driver = name[0];
						if(driverMap.get(name[0].trim()) != null && driverMap.get(name[0].trim()) != ""){
							date1 = sdf.parse(driverMap.get(name[0].trim()));
						}else{
							date1 = sdf.parse("01-Jan-1900");
						}

						for(int i = 1 ; i < name.length ; i++){
							System.out.println(name[i] + " , "+ driverMap.get(name[i].trim()));
							if(driverMap.get(name[i].trim()) != null && driverMap.get(name[i].trim()) != ""){
								Date date2 = sdf.parse(driverMap.get(name[i].trim()));
								
								if(date1.compareTo(date2)>0){ date1 = date2; driver = name[i];} 
							}
						}
						
					
						if(date1 != sdf.parse("01-Jan-1900")){
							fileWriter.append(String.valueOf(driver.trim()));
							fileWriter.append(COMMA_DELIMITER);
							fileWriter.append(String.valueOf(driverMap.get(driver.trim())));
							fileWriter.append(NEW_LINE_SEPARATOR);
						}else{
							fileWriter.append(String.valueOf(driver));
							fileWriter.append(COMMA_DELIMITER);
							fileWriter.append(NEW_LINE_SEPARATOR);
						}
						System.out.println("driver : " + driver + " , " + date1.toString());
					}
				}
			}

		} catch(Exception ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
	}
}