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
    private int apartId;
    private String apartName;
    private double price; 
    private String address;
    private String description;
    
    private int total;
    private double area;
    private String image;
    private int totalNow;

    public int getApartId() {
        return apartId;
    }

    public void setApartId(int apartId) {
        this.apartId = apartId;
    }

    public String getApartName() {
        return apartName;
    }

    public void setApartName(String apartName) {
        this.apartName = apartName;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getTotalNow() {
        return totalNow;
    }

    public void setTotalNow(int totalNow) {
        this.totalNow = totalNow;
    }

    @Override
    public String toString() {
        return "Apartment{" + "apartId=" + apartId + ", apartName=" + apartName + ", price=" + price + ", address=" + address + ", description=" + description + ", total=" + total + ", area=" + area + ", image=" + image + ", totalNow=" + totalNow + '}';
    }

    

    
    
}
