package ListOfGoods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import DataBase.DBConfiq;

public class Goods {
    public ArrayList<String> getListOfGoods(){
        ArrayList<String> list = new ArrayList<>();
        Connection con;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(DBConfiq.URL, DBConfiq.USER,
                    DBConfiq.PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM goods");
            while (rs.next()) {
                list.add(rs.getString("good"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
