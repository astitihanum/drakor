package com.example.drakorbyhn.models;

public class DramaLogo {
    private int logo;
    private String name;
    private String pemeran;
    private String sinopsis;

    public DramaLogo(int logo, String name, String pemeran, String sinopsis) {
        this.logo = logo;
        this.name = name;
        this.pemeran = pemeran;
        this.sinopsis = sinopsis;
    }

    public DramaLogo(){}

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

    public String getPemeran() {
        return pemeran;
    }

    public void setPemeran(String pemeran) {
        this.pemeran = pemeran;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

}
