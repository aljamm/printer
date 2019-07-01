package com.aljammal.printer.PrintData;

public class WIFIAddress extends ConnectionsPrinter {

    private String WIFIAddress;

    public WIFIAddress(String WIFIAddress) {
        this.WIFIAddress = WIFIAddress;
    }

    @Override
    public Integer connections(byte[] printData) {

        return 0;
    }
}
