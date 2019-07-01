package com.aljammal.printer.PrintData;

public class PrintData {

    private String Barcode;
    private String XaxisBarcode;
    private String HeightBarcode;
    private String WidthBarcode;
    private String ReadableBarcode;


    private String Name;
    private String XaxisName;
    private String HeightName;
    private String WidthName;


    private String Price;
    private String XaxisPrice;
    private String HeightPrice;
    private String WidthPrice;

    private String Currency;
    private String XaxisCurrency;
    private String HeightCurrency;
    private String WidthCurrency;

    private String Date;
    private String XaxisDate;
    private String HeightDate;
    private String WidthDate;

    private String PrintCount;
    private String SensorType;
    private String LabelWidth;

    private PrintData(String barcode, String xaxisBarcode, String heightBarcode, String widthBarcode,String readableBarcode, String name, String xaxisName, String heightName, String widthName, String price, String xaxisPrice, String heightPrice, String widthPrice, String currency, String xaxisCurrency, String heightCurrency, String widthCurrency, String date, String xaxisDate, String heightDate, String widthDate, String printCount, String sensorType, String labelWidth) {
        Barcode = barcode;
        XaxisBarcode = xaxisBarcode;
        HeightBarcode = heightBarcode;
        WidthBarcode = widthBarcode;
        Name = name;
        XaxisName = xaxisName;
        HeightName = heightName;
        WidthName = widthName;
        Price = price;
        XaxisPrice = xaxisPrice;
        HeightPrice = heightPrice;
        WidthPrice = widthPrice;
        Currency = currency;
        XaxisCurrency = xaxisCurrency;
        HeightCurrency = heightCurrency;
        WidthCurrency = widthCurrency;
        Date = date;
        XaxisDate = xaxisDate;
        HeightDate = heightDate;
        WidthDate = widthDate;
        PrintCount = printCount;
        SensorType = sensorType;
        LabelWidth = labelWidth;
        ReadableBarcode = readableBarcode;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public String getXaxisBarcode() {
        return XaxisBarcode;
    }

    public void setXaxisBarcode(String xaxisBarcode) {
        XaxisBarcode = xaxisBarcode;
    }

    public String getHeightBarcode() {
        return HeightBarcode;
    }

    public void setHeightBarcode(String heightBarcode) {
        HeightBarcode = heightBarcode;
    }

    public String getWidthBarcode() {
        return WidthBarcode;
    }

    public void setWidthBarcode(String widthBarcode) {
        WidthBarcode = widthBarcode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getXaxisName() {
        return XaxisName;
    }

    public void setXaxisName(String xaxisName) {
        XaxisName = xaxisName;
    }

    public String getHeightName() {
        return HeightName;
    }

    public void setHeightName(String heightName) {
        HeightName = heightName;
    }

    public String getWidthName() {
        return WidthName;
    }

    public void setWidthName(String widthName) {
        WidthName = widthName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getXaxisPrice() {
        return XaxisPrice;
    }

    public void setXaxisPrice(String xaxisPrice) {
        XaxisPrice = xaxisPrice;
    }

    public String getHeightPrice() {
        return HeightPrice;
    }

    public void setHeightPrice(String heightPrice) {
        HeightPrice = heightPrice;
    }

    public String getWidthPrice() {
        return WidthPrice;
    }

    public void setWidthPrice(String widthPrice) {
        WidthPrice = widthPrice;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getXaxisCurrency() {
        return XaxisCurrency;
    }

    public void setXaxisCurrency(String xaxisCurrency) {
        XaxisCurrency = xaxisCurrency;
    }

    public String getHeightCurrency() {
        return HeightCurrency;
    }

    public void setHeightCurrency(String heightCurrency) {
        HeightCurrency = heightCurrency;
    }

    public String getWidthCurrency() {
        return WidthCurrency;
    }

    public void setWidthCurrency(String widthCurrency) {
        WidthCurrency = widthCurrency;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getXaxisDate() {
        return XaxisDate;
    }

    public void setXaxisDate(String xaxisDate) {
        XaxisDate = xaxisDate;
    }

    public String getHeightDate() {
        return HeightDate;
    }

    public void setHeightDate(String heightDate) {
        HeightDate = heightDate;
    }

    public String getWidthDate() {
        return WidthDate;
    }

    public void setWidthDate(String widthDate) {
        WidthDate = widthDate;
    }

    public String getPrintCount() {
        return PrintCount;
    }

    public void setPrintCount(String printCount) {
        PrintCount = printCount;
    }

    public String getSensorType() {
        return SensorType;
    }

    public void setSensorType(String sensorType) {
        SensorType = sensorType;
    }

    public String getLabelWidth() {
        return LabelWidth;
    }

    public void setLabelWidth(String labelWidth) {
        LabelWidth = labelWidth;
    }

    public String getReadableBarcode() {
        return ReadableBarcode;
    }

    public void setReadableBarcode(String readableBarcode) {
        ReadableBarcode = readableBarcode;
    }

    public static class Builder {

        private String Barcode;
        private String XaxisBarcode;
        private String HeightBarcode;
        private String WidthBarcode;
        private String ReadableBarcode;


        private String Name;
        private String XaxisName;
        private String HeightName;
        private String WidthName;


        private String Price;
        private String XaxisPrice;
        private String HeightPrice;
        private String WidthPrice;

        private String Currency;
        private String XaxisCurrency;
        private String HeightCurrency;
        private String WidthCurrency;

        private String Date;
        private String XaxisDate;
        private String HeightDate;
        private String WidthDate;

        private String PrintCount;
        private String SensorType;
        private String LabelWidth;

        public Builder() {
        }

        public Builder setBarcode(String barcode) {
            Barcode = barcode;
            return this;
        }

        public Builder setXaxisBarcode(String xaxisBarcode) {
            XaxisBarcode = xaxisBarcode;
            return this;

        }

        public Builder setHeightBarcode(String heightBarcode) {
            HeightBarcode = heightBarcode;
            return this;

        }

        public Builder setWidthBarcode(String widthBarcode) {
            WidthBarcode = widthBarcode;
            return this;

        }

        public Builder setName(String name) {
            Name = name;
            return this;

        }

        public Builder setXaxisName(String xaxisName) {
            XaxisName = xaxisName;
            return this;

        }

        public Builder setHeightName(String heightName) {
            HeightName = heightName;
            return this;

        }

        public Builder setWidthName(String widthName) {
            WidthName = widthName;
            return this;

        }

        public Builder setPrice(String price) {
            Price = price;
            return this;

        }

        public Builder setXaxisPrice(String xaxisPrice) {
            XaxisPrice = xaxisPrice;
            return this;

        }

        public Builder setHeightPrice(String heightPrice) {
            HeightPrice = heightPrice;
            return this;

        }

        public Builder setWidthPrice(String widthPrice) {
            WidthPrice = widthPrice;
            return this;

        }

        public Builder setCurrency(String currency) {
            Currency = currency;
            return this;

        }

        public Builder setXaxisCurrency(String xaxisCurrency) {
            XaxisCurrency = xaxisCurrency;
            return this;

        }

        public Builder setHeightCurrency(String heightCurrency) {
            HeightCurrency = heightCurrency;
            return this;

        }

        public Builder setWidthCurrency(String widthCurrency) {
            WidthCurrency = widthCurrency;
            return this;

        }

        public Builder setDate(String date) {
            Date = date;
            return this;

        }

        public Builder setXaxisDate(String xaxisDate) {
            XaxisDate = xaxisDate;
            return this;

        }

        public Builder setHeightDate(String heightDate) {
            HeightDate = heightDate;
            return this;

        }

        public Builder setWidthDate(String widthDate) {
            WidthDate = widthDate;
            return this;

        }

        public Builder setPrintCount(String printCount) {
            PrintCount = printCount;
            return this;

        }

        public Builder setSensorType(String sensorType) {
            SensorType = sensorType;
            return this;

        }

        public Builder setLabelWidth(String labelWidth) {
            LabelWidth = labelWidth;
            return this;

        }

        public Builder setReadableBarcode(String readableBarcode) {
            ReadableBarcode = readableBarcode;
            return this;
        }

        public PrintData build() {
            return new PrintData(Barcode, XaxisBarcode, HeightBarcode, WidthBarcode,ReadableBarcode,
                    Name, XaxisName, HeightName, WidthName,
                    Price, XaxisPrice, HeightPrice, WidthPrice,
                    Currency, XaxisCurrency, HeightCurrency, WidthCurrency,
                    Date, XaxisDate, HeightDate, WidthDate, PrintCount, SensorType, LabelWidth);
        }
    }
}
