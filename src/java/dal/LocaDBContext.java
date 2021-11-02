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
import model.Location;

/**
 *
 * @author win
 */
public class LocaDBContext extends DBContext {

    public ArrayList<Location> getLocation() {
        ArrayList<Location> location = new ArrayList<>();
        try {
            String sql = "SELECT [LocaID]\n"
                    + "      ,[LocalName]\n"
                    + "  FROM [Location]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Location lc = new Location();
                lc.setLocaID(rs.getString("LocaID"));
                lc.setLocalName(rs.getString("LocalName"));
                location.add(lc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LocaDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return location;
    }
    public static void main(String[] args) {
//        LocaDBContext db = new LocaDBContext();
//        ArrayList<Location> location = db.getLocation();
//        for (Location location1 : location) {
//            System.out.println(location1);
//        }
    }
}
