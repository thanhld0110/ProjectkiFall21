/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author win
 */
public class Detail {
    private int ApartID;
    private String Image1;
    private String Image2;
    private String Image3;

    public int getApartID() {
        return ApartID;
    }

    public void setApartID(int ApartID) {
        this.ApartID = ApartID;
    }

    public String getImage1() {
        return Image1;
    }

    public void setImage1(String Image1) {
        this.Image1 = Image1;
    }

    public String getImage2() {
        return Image2;
    }

    public void setImage2(String Image2) {
        this.Image2 = Image2;
    }

    public String getImage3() {
        return Image3;
    }

    public void setImage3(String Image3) {
        this.Image3 = Image3;
    }

    @Override
    public String toString() {
        return "Detail{" + "ApartID=" + ApartID + ", Image1=" + Image1 + ", Image2=" + Image2 + ", Image3=" + Image3 + '}';
    }
    
}
