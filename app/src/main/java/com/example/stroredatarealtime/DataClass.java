package com.example.stroredatarealtime;

public class DataClass {
    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public String getDatalang() {
        return datalang;
    }

    public String getDataImg() {
        return dataImg;
    }

    private String dataTitle;
   private String dataDesc;
   private String datalang;
   private String dataImg;


    public DataClass(String dataTitle, String dataDesc, String datalang, String dataImg) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.datalang = datalang;
        this.dataImg = dataImg;
    }

}
