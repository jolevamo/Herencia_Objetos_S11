package com.company;

public class Tv extends Product{
    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    private String screenSize;
    private String resolution;

    public String mostrartV(){
        return "Marca = " + this.getBrand() + "\n"+
                "Nombre = " + this.getName() + "\n"+
                "Referencia = " + this.getReference() + "\n"+
                "Tamaño pantalla = " + this.getScreenSize() + "\n"+
                "Resolución Tv = " + this.getResolution() + "\n";
    }
}
