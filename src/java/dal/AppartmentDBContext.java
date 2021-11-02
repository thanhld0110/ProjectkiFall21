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

    public ArrayList<Apartment> getAppartment() {
        ArrayList<Apartment> apartments = new ArrayList<>();
        try {
            String sql = "SELECT [ApartID]\n"
                    + "      ,[Apartname]\n"
                    + "      ,[Price]\n"
                    + "      ,[Address]\n"
                    + "      ,[Description]\n"
                    + "      ,[Total]\n"
                    + "      ,[Area]\n"
                    + "      ,[Image]\n"
                    + "      ,[TotalNow]\n"
                    + "  FROM [Apartment]";
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Apartment a = new Apartment();
                a.setApartId(rs.getInt("ApartID"));
                a.setApartName(rs.getString("Apartname"));
                a.setPrice(rs.getDouble("Price"));
                a.setAddress(rs.getString("Address"));
                a.setDescription(rs.getString("Description"));

                a.setTotal(rs.getInt("Total"));
                a.setArea(rs.getFloat("Area"));
                a.setImage(rs.getString("Image"));
                a.setTotalNow(rs.getInt("TotalNow"));
                apartments.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return apartments;
    }

    public ArrayList<Apartment> getAppartmentById(int id) {
        ArrayList<Apartment> apartments = new ArrayList<>();
        try {
            String sql = "SELECT [ApartID]\n"
                    + "      ,[Apartname]\n"
                    + "      ,[Price]\n"
                    + "      ,[Address]\n"
                    + "      ,[Description]\n"
                    + "      ,[Total]\n"
                    + "      ,[Area]\n"
                    + "      ,[Image]\n"
                    + "      ,[TotalNow]\n"
                    + "  FROM [Apartment] where ApartID=?";
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Apartment a = new Apartment();
                a.setApartId(rs.getInt("ApartID"));
                a.setApartName(rs.getString("Apartname"));
                a.setPrice(rs.getDouble("Price"));
                a.setAddress(rs.getString("Address"));
                a.setDescription(rs.getString("Description"));
                a.setTotal(rs.getInt("Total"));
                a.setArea(rs.getFloat("Area"));
                a.setImage(rs.getString("Image"));
                a.setTotalNow(rs.getInt("TotalNow"));
                apartments.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return apartments;
    }

    public ArrayList<Apartment> pagging(int pagesize, int pageindex) {
        ArrayList<Apartment> apartments = new ArrayList<>();
        try {
            String sql = "SELECT ApartID, Image From (SELECT ROW_NUMBER() OVER (ORDER BY ApartID asc)\n"
                    + "as rownum, ApartID, Image FROM Apartment) a\n"
                    + "WHERE rownum >= (?-1) * ? + 1 AND rownum <= ? * ?";
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            stm.setInt(1, pageindex);
            stm.setInt(2, pagesize);
            stm.setInt(3, pageindex);
            stm.setInt(4, pagesize);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Apartment a = new Apartment();
                a.setApartId(rs.getInt("ApartID"));
                a.setImage(rs.getString("Image"));
                apartments.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return apartments;
    }
    public int getRowCount(){
        try {
            String sql = "SELECT COUNT(*) as Total FROM Apartment";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppartmentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

//    public static void main(String[] args) {
//        AppartmentDBContext a = new AppartmentDBContext();
////        ArrayList<Apartment> ab = a.getAppartment();
////        for (Apartment apartment : ab) {
////            System.out.println(apartment);
////        }
//        ArrayList<Apartment> ab = a.getAppartmentById(0);
//        System.out.println(ab);
//    }
}
