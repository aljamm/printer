package com.aljammal.printer.Printers;

import androidx.annotation.NonNull;

import com.aljammal.printer.PrintData.PrintData;
import com.aljammal.printer.Utils.AppEnums;

import java.util.ArrayList;
import java.util.List;

public class LabelGenerationUtil2 {

    public static byte[] GenerateShelfTagLabelHoneywell_RP4(PrintData printData) {

        byte[] result = new byte[]{0};
        String shelfTagLabel;
        try {


            shelfTagLabel = "\u0002n\r\n" +
                    "\u0002M0500\r\n" +
                    "\u0002KcST" + printData.getSensorType() + ";\r\n" + //Sensor Type R is for bottom black mark T for top black mark
                    "\u0002KcPD66;\r\n" + // Present distance is set to 62
                    // "\u0002F\r\n" +
                    "\u0002KcLW0" + printData.getLabelWidth() + ";\r\n" + // Label width
                    "\u0002KcLR0;\r\n" + // rotate print to 180 degrees
                    "\u0002O0220\r\n" +
                    "\u0002d\r\n" +
                    "\u0002L\r\n" +
                    "D11\r\n" +
                    "ySU8\r\n" + // for UTF-8
                    "A2\r\n" +
                    "3e820210110" + printData.getXaxisBarcode() + "C" + printData.getBarcode() + "\r\n" + // barcode 128 x'axis 0260 y'axis 0115
                    "3911S530123" + printData.getReadableBarcode() + "P009P009" + printData.getBarcode() + "\r\n" + // human readable barcode
                    "3911S5300530260P0" + printData.getHeightName() + "P0" + printData.getWidthName() + // product name
                    printData.getName() + "\r\n" + // name as Ar
                    "3911S5300850265P011P011" + printData.getDate() + "\r\n" +
                    "3911S5300900120P018P018" + printData.getPrice() + " " + printData.getCurrency() + "\r\n" +
                    "Q000" + printData.getPrintCount() + "\r\n" +
                    "E\r\n";


        } catch (Exception e) {
            return null;
        }
        result = addToDataVault(result, shelfTagLabel.getBytes());
        return result;
    }

    public static List<byte[]> GenerateShelfTagLabel(String barcode, int printerType) {

        if (printerType == AppEnums.PrinterType.Honeywell_RP4)
            return GenerateBarcodeLabel(barcode);
        else if (printerType == AppEnums.PrinterType.Intermec_PC43t)
            return GenerateShelfTagLabelDP(barcode);

        return null;
    }

    private static List<byte[]> GenerateBarcodeLabel(String barcode) {
        List<byte[]> returnedResult = new ArrayList<>();
        byte[] result = new byte[]{0};
        try {
            String single;
            String multiple;

            single = "\u0002n\r\n" +
                    "\u0002M0500\r\n" +
                    "\u0002KcSTG;\r\n" +
                    "\u0002KcPD43;\r\n" +
                    // "\u0002F\r\n" +
                    "\u0002KcLW0203;\r\n" +
                    "\u0002KcLR0;\r\n" +
                    "\u0002O0220\r\n" +
                    "\u0002d\r\n" +
                    "\u0002L\r\n" +
                    "D11\r\n" +
                    "ySU8\r\n" +
                    "A2\r\n" +
                    "3e6002400400190C" + barcode + "\r\n" + // barcode 128 x'axis 0260 y'axis 0115
                    "303300000550180" + barcode + "\r\n" + // human readable barcode  x'axis 0240
                    "Q0001\r\n" +
                    "E\r\n";
            result = addToDataVault(result, single.getBytes());
            returnedResult.add(result);


            return returnedResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnedResult;
    }

    private static List<byte[]> GenerateShelfTagLabelDP(@NonNull String barcode) {
        List<byte[]> returnedResult = new ArrayList<>();
        byte[] printData = new byte[]{0};
        printData = addToDataVault(printData, "NEW\r\n".getBytes()); // clear buffer
        printData = addToDataVault(printData, "CLIP ON\r\n".getBytes()); // even if the field goes out of label, print partial
        printData = addToDataVault(printData, "CLIP BARCODE ON\r\n".getBytes()); // even if the barcode goes out of label, print partial

        printData = addToDataVault(printData, "NASC 8\r\n".getBytes());  // set to UTF-8
        printData = addToDataVault(printData, "FONT \"Times New Roman Bold\"\r\n".getBytes()); // set the font

        printData = addToDataVault(printData, "BARTYPE \"CODE128\" :BARRATIO 2,1:BARMAG 3:BARHEIGHT 60:BARFONT OFF\r\n".getBytes());
        printData = addToDataVault(printData, "PP 40,85\r\n".getBytes());
        printData = addToDataVault(printData, ("PB \"" + barcode + "\"\r\n").getBytes());
        printData = addToDataVault(printData, "PP 101,35\r\n".getBytes());
        printData = addToDataVault(printData, ("PT \"" + barcode + "\"\r\n").getBytes());
        // Print feed (PF)
        // 1 = qty of label
        printData = addToDataVault(printData, "PF1\r\n".getBytes());
        returnedResult.add(printData);
        return returnedResult;
    }

    private static byte[] addToDataVault(@NonNull byte[] src, byte[] data) {
        byte[] now;
        if ((src.length == 1) && (src[0] == 0)) {
            now = new byte[data.length];
            System.arraycopy(data, 0, now, 0, data.length);
        } else {
            now = new byte[src.length + data.length];
            System.arraycopy(src, 0, now, 0, src.length);
            System.arraycopy(data, 0, now, src.length, data.length);
        }
        return now;
    }
}
