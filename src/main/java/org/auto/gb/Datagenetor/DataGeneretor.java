package org.auto.gb.Datagenetor;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

import io.netty.handler.codec.MessageToMessageDecoder;

public class DataGeneretor {

	
	@DataProvider(name = "LoginData")
	public static Object[][] testDataGenerator(java.lang.reflect.Method met) throws IOException {
		
		if(met.getName().equalsIgnoreCase("tc_gblogin_001")) {
		FileInputStream file = new FileInputStream("./TestData/GBTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginSheet = workbook.getSheet("login");
		int numberOfDataInRow = loginSheet.getPhysicalNumberOfRows();

		Object[][] testdata = new Object[numberOfDataInRow][2];// 2-no.of.cloumn

		for (int i = 0; i < numberOfDataInRow; i++) {
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testdata[i][0] = username.getStringCellValue();
			testdata[i][1] = password.getStringCellValue();

		}
		return testdata;
	}
		else if(met.getName().equalsIgnoreCase("tc_GBNewCust_002")) 
		{
			
				FileInputStream file = new FileInputStream("./TestData/GBTestData.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet loginSheet = workbook.getSheet("NewCoust");
				int numberOfDataInRow = loginSheet.getPhysicalNumberOfRows();

				Object[][] testdata = new Object[numberOfDataInRow][3];// 2-no.of.cloumn

				for (int i = 0; i < numberOfDataInRow; i++) {
					XSSFRow row = loginSheet.getRow(i);
					XSSFCell Newcust = row.getCell(0);
					XSSFCell Add = row.getCell(1);
					XSSFCell city = row.getCell(2);
					testdata[i][0] = Newcust.getStringCellValue();
					testdata[i][1] = Add.getStringCellValue();
					testdata[i][2] = city.getStringCellValue();

				}
				return testdata;
			}else {
				Object[][] testData=new Object[2][3];
				return testData;
			}
		
		}
	}

