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
import model.Detail;

/**
 *
 * @author win
 */
public class DetailDBContext extends DBContext {

    public ArrayList<Detail> getDetail(int id) {
        ArrayList<Detail> details = new ArrayList<>();
        try {
            String sql = "select Detail.ApartID,Detail.Image1,Detail.Image2,Detail.Image3 \n"
                    + "from Apartment inner join Detail\n"
                    + "ON Apartment.ApartID= Detail.ApartID\n"
                    + " where Detail.ApartID=?";
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Detail d = new Detail();
                d.setApartID(rs.getInt("ApartID"));
                d.setImage1(rs.getString("Image1"));
                d.setImage2(rs.getString("Image2"));
                d.setImage3(rs.getString("Image3"));
                details.add(d);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetailDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }
//    public static void main(String[] args) {
//        DetailDBContext db = new DetailDBContext();
//        ArrayList<Detail> a = db.getDetail(1);
//        System.out.println(a);
//    }
}
