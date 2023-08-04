package utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class ExcelUtilities {
    public static ArrayList<ArrayList<String>> getDataFromExcel(String path, String sheetName, int columnCount) {
        Sheet sheet;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<ArrayList<String>> returnList = new ArrayList<>();

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> innerList = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                Cell cell = sheet.getRow(i).getCell(j);
                innerList.add(cell.toString());
            }
            returnList.add(innerList);
        }
        return returnList;
    }

    public static void writeInExcel(String path, Scenario scenario, LocalDateTime startTime, LocalDateTime endTime, Duration duration) {
        File file = new File(path);
        Row row;
        if (!file.exists()) { // if file doesn't exist
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Test Results");
            row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getName());
            cell = row.createCell(2);
            cell.setCellValue(scenario.getStatus().toString());
            cell = row.createCell(3);
            cell.setCellValue(startTime.toString());
            cell = row.createCell(4);
            cell.setCellValue(endTime.toString());
            cell = row.createCell(5);
            cell.setCellValue(duration.toString());

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            FileInputStream fileInputStream;
            Workbook workbook;
            Sheet sheet;
            try {
                fileInputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(fileInputStream);
                sheet = workbook.getSheet("Test Results");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            int rowCount = sheet.getPhysicalNumberOfRows();
            row = sheet.createRow(rowCount);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getName());
            cell = row.createCell(2);
            cell.setCellValue(scenario.getStatus().toString());
            cell = row.createCell(3);
            cell.setCellValue(startTime.toString());
            cell = row.createCell(4);
            cell.setCellValue(endTime.toString());
            cell = row.createCell(5);
            cell.setCellValue(duration.toString());

            FileOutputStream outputStream;
            try {
                fileInputStream.close();
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static String generateRandomString(int length) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String randomChar;
            if (i % 2 == 0) {
                randomChar = consonants[random.nextInt(consonants.length)];
            } else {
                randomChar = vowels[random.nextInt(vowels.length)];
            }
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString.substring(0,1).toUpperCase() + randomString.substring(1);
    }
}
