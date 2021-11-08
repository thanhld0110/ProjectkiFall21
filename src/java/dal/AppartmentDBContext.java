/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Apartment;

/**
 *
 * @author win
 */
public class AppartmentDBContext extends DBContext {

    public ArrayList<Apartment> getAppartmentt() {
        ArrayList<Apartment> apartments = new ArrayList<>();
        try {
            String sql = "SELECT [ApartID] ,[Apartname],[HoseName]\n"
                    + ",[Phone],[Price],[Address],[Description]\n"
                    + ",[Total],[Area],[Image],[Image1],[Image2],[Image3],[TotalNow]\n"
                    + " FROM [Apartment]";
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                Apartment a = new Apartment();
                a.setApartID(rs.getInt("ApartID"));
                a.setApartName(rs.getString("Apartname"));
                a.setHoseName(rs.getString("HoseName"));
                a.setPhone(rs.getString("Phone"));
                a.setPrice(rs.getDouble("Price"));
                a.setAddress(rs.getString("Address"));
                a.setDescription(rs.getString("Description"));

                a.setTotal(rs.getInt("Total"));
                a.setArea(rs.getFloat("Area"));
                a.setImage(rs.getString("Image"));
                a.setImage1(rs.getString("Image1"));
                a.setImage2(rs.getString("Image2"));
                a.setImage3(rs.getString("Image3"));
                a.setTotalNow(rs.getInt("TotalNow"));
                apartments.add(a);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return apartments;
    }
    public ArrayList<Apartment> getAppartmentByID(int aid) {
        ArrayList<Apartment> apartments = new ArrayList<>();
        try {
            String sql = "SELECT [ApartID] ,[Apartname],[HoseName]\n"
                    + ",[Phone],[Price],[Address],[Description]\n"
                    + ",[Total],[Area],[Image],[Image1],[Image2],[Image3],[TotalNow]\n"
                    + " FROM [Apartment] WHERE [ApartID] = ?";
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            stm.setInt(1, aid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                Apartment a = new Apartment();
                a.setApartID(rs.getInt("ApartID"));
                a.setApartName(rs.getString("Apartname"));
                a.setHoseName(rs.getString("HoseName"));
                a.setPhone(rs.getString("Phone"));
                a.setPrice(rs.getDouble("Price"));
                a.setAddress(rs.getString("Address"));
                a.setDescription(rs.getString("Description"));

                a.setTotal(rs.getInt("Total"));
                a.setArea(rs.getFloat("Area"));
                a.setImage(rs.getString("Image"));
                a.setImage1(rs.getString("Image1"));
                a.setImage2(rs.getString("Image2"));
                a.setImage3(rs.getString("Image3"));
                a.setTotalNow(rs.getInt("TotalNow"));
                apartments.add(a);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return apartments;
    }
    public void insertApartment(Apartment apartment) {
        try {
            String sql = "INSERT INTO [Apartment]  values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, apartment.getApartName());
            stm.setString(2, apartment.getHoseName());
            stm.setString(3, apartment.getPhone());
            stm.setDouble(4, apartment.getPrice());
            stm.setString(5, apartment.getAddress());
            stm.setString(6, apartment.getDescription());
            stm.setInt(7, apartment.getTotal());
            stm.setFloat(8, apartment.getArea());
            stm.setString(9, apartment.getImage());
            stm.setString(10, apartment.getImage1());
            stm.setString(11, apartment.getImage2());
            stm.setString(12, apartment.getImage3());
            stm.setInt(13, apartment.getTotal());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateApartment(Apartment apartment) {
        try {
            String sql = "UPDATE [dbo].[Apartment]\n"
                    + "   SET [Apartname] = ?\n"
                    + "      ,[HoseName] = ?\n"
                    + "      ,[Phone] = ?\n"
                    + "      ,[Price] = ?\n"
                    + "      ,[Address] = ?\n"
                    + "      ,[Description] = ?\n"
                    + "      ,[Total] = ?\n"
                    + "      ,[Area] = ?\n"
                    + "      ,[Image] = ?\n"
                    + "      ,[Image1] = ?\n"
                    + "      ,[Image2] = ?\n"
                    + "      ,[Image3] = ?\n"
                    + "      ,[TotalNow] = ?\n"
                    + " WHERE ApartID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setString(1, apartment.getApartName());
            stm.setString(2, apartment.getHoseName());
            stm.setString(3, apartment.getPhone());
            stm.setDouble(4, apartment.getPrice());
            stm.setString(5, apartment.getAddress());
            stm.setString(6, apartment.getDescription());
            stm.setInt(7, apartment.getTotal());
            stm.setFloat(8, apartment.getArea());
            stm.setString(9, apartment.getImage());
            stm.setString(10, apartment.getImage1());
            stm.setString(11, apartment.getImage2());
            stm.setString(12, apartment.getImage3());
            stm.setInt(13, apartment.getTotalNow());
            stm.setInt(14, apartment.getApartID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteApartMent(int id) {
        try {
            String sql = "delete from Apartment where ApartID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        AppartmentDBContext a = new AppartmentDBContext();
        ArrayList<Apartment> ab = a.getAppartmentt();
        for (Apartment apartment : ab) {
            System.out.println(apartment);
        }

    }
}
