package com.magic.happypi.utils;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POIUtils {

    private static final Logger logger = Logger.getLogger(POIUtils.class);

    /**
     * 读取解析excel表数据
     *
     * @param filePath 目标数据文件路径
     */
    public static List<Map<String, String>> readExcel(String filePath) {
        File file = new File(filePath);
        String fileName = file.getName();
        String prefix = fileName.substring(fileName.lastIndexOf(".") + 1);
        List<Map<String, String>> sheetList = new ArrayList<Map<String, String>>();
        InputStream is = null;
        Workbook wb = null;
        try {
            is = new FileInputStream(file);
            if ("xlsx".equals(prefix)) {//2007版本
                wb = new XSSFWorkbook(is);
            } else if ("xls".equals(prefix)) {//2003版本
                wb = new HSSFWorkbook(is);
            }
            if (null != wb) {
                if (wb.getNumberOfSheets() > 0) {
                    Sheet sheet = wb.getSheetAt(0);
                    sheetList = readDataSheet(sheet);
                }
            }
        } catch (Exception e) {
            logger.error("读取 excel 文件异常：" + e.getMessage(), e);
            throw new RuntimeException("读取 excel 文件异常");
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    logger.error("关闭读取 excel 文件流失败：" + e.getMessage(), e);
                }
            }
        }
        return sheetList;
    }

    /**
     * 读取sheet表格数据
     */
    public static List<Map<String, String>> readDataSheet(Sheet sheet) throws Exception {
        //获取行数
        int rows = sheet.getLastRowNum() + 1;
        List<Map<String, String>> sheetList = new ArrayList<Map<String, String>>();
        try {
            List<String> titles = new ArrayList<String>();//放置所有的标题
            if (rows > 0) {
                for (int i = 1; i < rows; i++) {
                    Row row = sheet.getRow(i);
                    if (row == null) {//略过空行
                        continue;
                    }
                    int cellSize = row.getLastCellNum();//行中有多少个单元格，也就是有多少列
                    if (cellSize > 0) {//第一行是标题行
                        Map<String, String> rowMap = new HashMap<String, String>();//对应一个数据行
                        for (int k = 1; k < cellSize; k++) {
                            int snum = k;
                            Cell cell = row.getCell(k);
                            String key = "column" + snum;
                            String value = null;
                            if (null != cell) {
                                value = getCellValue(cell);
                            }
                            rowMap.put(key, value);
                        }
                        sheetList.add(rowMap);
                    }
                }
            }
        } catch (Exception e) {
            logger.error("读取 excel sheet 页异常：" + e.getMessage(), e);
            throw new Exception("读取 excel sheet 页异常");
        }
        return sheetList;
    }

    public static String getCellValue(Cell cell) {
        String cellValue = "";
        // 以下是判断数据的类型
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_NUMERIC: // 数字
                if (DateUtil.isCellDateFormatted(cell)) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    cellValue = sdf.format(DateUtil.getJavaDate(cell.getNumericCellValue())).toString();
                } else {
                    DataFormatter dataFormatter = new DataFormatter();
                    cellValue = dataFormatter.formatCellValue(cell);
                }
                break;
            case Cell.CELL_TYPE_STRING: // 字符串
                cellValue = cell.getStringCellValue();
                break;
            case Cell.CELL_TYPE_BOOLEAN: // Boolean
                cellValue = cell.getBooleanCellValue() + "";
                break;
            case Cell.CELL_TYPE_FORMULA: // 公式
                cellValue = cell.getCellFormula() + "";
                break;
            case Cell.CELL_TYPE_BLANK: // 空值
                cellValue = "";
                break;
            case Cell.CELL_TYPE_ERROR: // 故障
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }

    /**
     * excel添加下拉数据校验
     *
     * @param sheet      哪个 sheet 页添加校验
     * @param dataSource 数据源数组
     * @param col        第几列校验（0开始）
     * @return
     */
    public static DataValidation createDataValidation(Sheet sheet, String[] dataSource, int col) {
        CellRangeAddressList cellRangeAddressList = new CellRangeAddressList(1, 65535, col, col);

        DataValidationHelper helper = sheet.getDataValidationHelper();
        DataValidationConstraint constraint = helper.createExplicitListConstraint(dataSource);

        DataValidation dataValidation = helper.createValidation(constraint, cellRangeAddressList);


        //处理Excel兼容性问题
        if (dataValidation instanceof XSSFDataValidation) {
            dataValidation.setSuppressDropDownArrow(true);
            dataValidation.setShowErrorBox(true);
        } else {
            dataValidation.setSuppressDropDownArrow(false);
        }

        dataValidation.setEmptyCellAllowed(true);
        dataValidation.setShowPromptBox(true);
        dataValidation.createPromptBox("提示", "只能选择下拉框里面的数据");
        return dataValidation;
    }

    /**
     * 下拉列表元素很多的情况 (255以上的下拉)
     *
     * @param strFormula
     * @param firstRow   起始行
     * @param endRow     终止行
     * @param firstCol   起始列
     * @param endCol     终止列
     * @return
     */
    public static HSSFDataValidation setDataValidation(String strFormula, int firstRow, int endRow, int firstCol, int endCol) {

        // 设置数据有效性加载在哪个单元格上。四个参数分别是：起始行、终止行、起始列、终止列
        CellRangeAddressList regions = new CellRangeAddressList(firstRow, endRow, firstCol, endCol);
        DVConstraint constraint = DVConstraint.createFormulaListConstraint(strFormula);
        HSSFDataValidation dataValidation = new HSSFDataValidation(regions, constraint);

        dataValidation.createErrorBox("Error", "Error");
        dataValidation.createPromptBox("", null);

        return dataValidation;
    }
}
