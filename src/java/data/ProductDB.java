package data;

import beans.Products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    public static Products selectProduct(String prdId) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM products WHERE id =?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, prdId);

            rs = ps.executeQuery();

            if (rs.next()) {
                Products p = new Products();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setBrief(rs.getString("brief"));
                p.setDetail(rs.getString("detail"));
                p.setIngredient(rs.getString("ingredient"));
                p.setPrice(rs.getInt("price"));
                return p;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

//    public static Products selectProduct(String prdName) {
//        ConnectionPool pool = ConnectionPool.getInstance();
//        Connection connection = pool.getConnection();
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//
//        String sql = "SELECT * FROM products WHERE name ='?'";
//
//        try {
//            ps = connection.prepareStatement(sql);
//            ps.setString(1, prdName);
//
//            rs = ps.executeQuery();
//
//            if (rs.next()) {
//                Products p = new Products();
//                p.setId(rs.getInt("id"));
//                p.setName(rs.getString("name"));
//                p.setType(rs.getString("type"));
//                p.setBrief(rs.getString("brief"));
//                p.setDetail(rs.getString("detail"));
//                p.setIngredient(rs.getString("ingredient"));
//                p.setPrice(rs.getInt("price"));
//                return p;
//            } else {
//                return null;
//            }
//        } catch (SQLException e) {
//            System.err.println(e);
//            return null;
//        } finally {
//            DBUtil.closeResultSet(rs);
//            DBUtil.closePreparedStatement(ps);
//            pool.freeConnection(connection);
//        }
//    }
    public static List<Products> selectProducts() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM products";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            ArrayList<Products> products = new ArrayList<>();

            while (rs.next()) {
                Products p = new Products();
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setBrief(rs.getString("brief"));
                p.setDetail(rs.getString("detail"));
                p.setIngredient(rs.getString("ingredient"));
                p.setPrice(rs.getInt("price"));

                products.add(p);
            }
            return products;
        } catch (SQLException e) {
            System.err.print(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
