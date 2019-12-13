package mytest;

import entiity.MercStlAccount;
import entiity.Urmtminf;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.FilledUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;
public class ExcelService {
    
     private static void writeMerFileBody(StringBuffer fileBody, Urmtminf urmtminf, MercStlAccount accountInfo, int n){
         fileBody.append(FilledUtil.fillZeroAtLeft(n, 8) + "|");
         fileBody.append(FilledUtil.fillBlankAtRight(urmtminf.getMercId(), 16) + "|");
         fileBody.append(FilledUtil.fillChineseAtRight(urmtminf.getMercCnm(), 256) + "|");    //null
         fileBody.append(FilledUtil.fillChineseAtRight(urmtminf.getMercAbbr(), 128) + "|");
         fileBody.append(FilledUtil.fillZeroAtLeft(Long.parseLong(urmtminf.getMercSts()), 2) + "|"); //商户状态
         fileBody.append(urmtminf.getCreDt() + "|");  //注册日期
         fileBody.append(urmtminf.getUpdDt() + "|");  //商户信息修改日期
         fileBody.append(urmtminf.getClrFlg() + "|");  // 商户交易清分标识 urmtminf.getClrFlg()  null
         fileBody.append(FilledUtil.fillBlankAtRight(urmtminf.getMercType(), 2) + "|");  //证照类型
         fileBody.append(FilledUtil.fillBlankAtRight(urmtminf.getRegId(), 32) + "|");
         fileBody.append(FilledUtil.fillChineseAtRight(urmtminf.getCrpNm(), 128) + "|"); //法人名称
         fileBody.append(FilledUtil.fillBlankAtRight(urmtminf.getCrpIdNo(), 32) + "|");
         fileBody.append(urmtminf.getRegType() + "|");  //开户行标识
         fileBody.append(FilledUtil.fillBlankAtRight("", 16) + "|");  //开户行代码
         fileBody.append(FilledUtil.fillChineseAtRight("", 128) + "|");  //开户行名称
         fileBody.append(accountInfo.getAccountType() + "|");  //结算账户性质
         fileBody.append(FilledUtil.fillChineseAtRight("", 128) + "|");  //结算账户名称
         fileBody.append(FilledUtil.fillBlankAtRight(accountInfo.getAccountNo(), 32) + "|");  //结算账户账户号 必填项
         fileBody.append(FilledUtil.fillBlankAtRight("", 8) + "|");
         fileBody.append(FilledUtil.fillChineseAtRight("", 128) + "|");
         fileBody.append(FilledUtil.fillBlankAtRight("", 128) + "|");
         fileBody.append(FilledUtil.fillBlankAtRight("", 128));
         fileBody.append("\n");
         System.out.println("生成一行：" + n);
     }

    public static void main(String[] args) {

        // excel文件路径
        String excelPath = "D:/readExcel/邮政pos-3月到11月数据--重庆.xlsx";

        try {
            // String encoding = "GBK";
            File excel = new File(excelPath);
            if (excel.isFile() && excel.exists()) { // 判断文件是否存在

                String[] split = excel.getName().split("\\."); // .是特殊字符，需要转义！！！！！
                // System.out.println(split[1]);
                Workbook wb = null;
                // 根据文件后缀（xls/xlsx）进行判断
                FileInputStream fis = new FileInputStream(excel); // 文件流对象
                if ("xls".equals(split[1])) {
                    wb = new HSSFWorkbook(fis);
                } else if ("xlsx".equals(split[1])) {
                    wb = new XSSFWorkbook(fis);
                } else {
                    System.out.println("文件类型错误!");
                    return;
                }

                // 开始解析
                Sheet sheet = wb.getSheetAt(0); // 读取sheet 0

                int firstRowIndex = sheet.getFirstRowNum(); // 第一行是列名，所以不读
                int lastRowIndex = sheet.getLastRowNum();
                // System.out.println("firstRowIndex: " + firstRowIndex);
                // System.out.println("lastRowIndex: " + lastRowIndex);
                StringBuffer fileBody = new StringBuffer();
                for (int rIndex = firstRowIndex + 1; rIndex <= lastRowIndex; rIndex++) { // 遍历行
                    // System.out.println("rIndex: " + rIndex);

                    Row row = sheet.getRow(rIndex);
                    if (row != null) {
                        Urmtminf urmtminf = new Urmtminf();
                        urmtminf.setMercId(row.getCell(0).toString().trim());
                        urmtminf.setMercCnm(row.getCell(1).toString().trim());
                        urmtminf.setMercAbbr(row.getCell(2).toString().trim());
                        urmtminf.setMercSts(row.getCell(3).toString().trim());
                        urmtminf.setCreDt(row.getCell(4).toString().trim());
                        urmtminf.setUpdDt(row.getCell(5).toString().trim());
                        urmtminf.setClrFlg(row.getCell(6).toString().trim());
                        urmtminf.setMercType(row.getCell(7).toString().trim());//证照类型
                        urmtminf.setRegId(row.getCell(8).toString().trim());
                        urmtminf.setCrpNm(row.getCell(9).toString().trim());
                        urmtminf.setCrpIdNo(row.getCell(10).toString().trim());
                        urmtminf.setRegType(row.getCell(11).toString().trim());//开户行标志
                        MercStlAccount accountInfo = new MercStlAccount();
                        accountInfo.setAccountType(row.getCell(12).toString().trim());
                        accountInfo.setAccountNo(row.getCell(13).toString().trim());
                        writeMerFileBody(fileBody,urmtminf,accountInfo,rIndex);
                    }
                }
                try {
                    FileUtils.write(new File("D:/readExcel/testExcel.txt"),fileBody.toString(), Charset.forName("UTF-8"),true);
                } catch (IOException e) {
                    System.out.println("写入失败");
                    e.printStackTrace();
                }
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println(1111);
            e.printStackTrace();
        }
    }

}