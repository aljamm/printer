package com.aljammal.printer.Utils;

public class Constants {

    public static final int Success_PrintingDone = 99;
    public static final int Error_InvalidBarcode = 100;
    public static final int Error_InvalidPrinterMAC = 101;
    public static final int Error_PrintingError = 102;
    public static final int Error_Invalid_Media = 103;
    public static final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 1024;

    public static final String SHARED_PREFERENCES_PRINTER_IP_ADDRESS = "PRINTER_IP_ADDRESS";
    public static final String SHARED_PREFERENCES_PRINTER_CONNECTIONS_TYPE = "CONNECTIONS_TYPE";
    public static final String SHARED_PREFERENCES_PRINTER_TYPE = "PRINTER_TYPE";

    public static final String Printer_Status_Ready = "NNNNNNNN:NNNNNNNN:YNNNNNNN\r";
}
