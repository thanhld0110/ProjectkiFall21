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
public class Apartment {

    //11 thuoc tinh
    private int apartID;
    private String apartName;
    private String hoseName;
    private String phone;
    private double price;
    private String address;
    private String description;
    private int total;
    private float area;
    private String image;
    private String image1;
    private String image2;
    private String image3;
    private int totalNow;

    public int getApartID() {
        return apartID;
    }

    public void setApartID(int apartID) {
        this.apartID = apartID;
    }

    public String getApartName() {
        return apartName;
    }

    public void setApartName(String apartName) {
        this.apartName = apartName;
    }

    public String getHoseName() {
        return hoseName;
    }

    public void setHoseName(String hoseName) {
        this.hoseName = hoseName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public int getTotalNow() {
        return totalNow;
    }

    public void setTotalNow(int totalNow) {
        this.totalNow = totalNow;
    }

    @Override
    public String toString() {
        return "Apartment{" + "apartID=" + apartID + ", apartName=" + apartName + ", hoseName=" + hoseName + ", phone=" + phone + ", price=" + price + ", address=" + address + ", description=" + description + ", total=" + total + ", area=" + area + ", image=" + image + ", image1=" + image1 + ", image2=" + image2 + ", image3=" + image3 + ", totalNow=" + totalNow + '}';
    }

}
