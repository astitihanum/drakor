package com.example.drakorbyhn.models;

public class GenreDrama {

    private int logo;
    private String name;
    private String RowID;

    public GenreDrama(int logo, String name, String rowID) {
        this.logo = logo;
        this.name = name;
        this.RowID = rowID;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRowID() {
        return RowID;
    }

    public void setRowID(String rowID) {
        RowID = rowID;
    }
}