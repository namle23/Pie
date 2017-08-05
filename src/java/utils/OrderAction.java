package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderAction {

    private Connection conn;

    public OrderAction(Connection conn) {
        this.conn = conn;
    }

    public void addOrderLogged(int usr_id, String usr_fullname, String usr_address, String usr_phone,
            int prdId, String prdName, String prdQuantity, int prdPrice) throws SQLException {

        String sql = "INSERT INTO dbs.order('user_id','full_name','address','phone','prd_id','prd_name','prd_quan','prd_cost') "
                + "VALUES(?,?,?,?,?,?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, usr_id);
        ps.setString(2, usr_fullname);
        ps.setString(3, usr_address);
        ps.setString(4, usr_phone);

        ps.setInt(5, prdId);
        ps.setString(6, prdName);
        ps.setString(7, prdQuantity);
        ps.setInt(8, prdPrice);

        ps.executeUpdate();

        ps.close();
    }

    public void addOrderNoLogged(String customername, String address, String phone,
            int prdId, String prdName, String prdQuantity, int prdPrice) throws SQLException {

        String sql = "INSERT INTO dbs.order('full_name','address','phone','prd_id','prd_name','prd_quan','prd_cost') "
                + "VALUES(?,?,?,?,?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, customername);
        ps.setString(2, address);
        ps.setString(3, phone);

        ps.setInt(4, prdId);
        ps.setString(5, prdName);
        ps.setString(6, prdQuantity);
        ps.setInt(7, prdPrice);

        ps.executeUpdate();

        ps.close();
    }
}
