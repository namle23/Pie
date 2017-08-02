package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShopAction {

    private Connection conn;

    private int limit = 6;

    public ShopAction(Connection conn) {
        this.conn = conn;
    }

    //calculate number of page should be displayed
    public int numberOfPage(int count) {
        int numberOfPage = (int) (count / limit);

        if (numberOfPage == 0 || (count % limit) != 0) {
            numberOfPage = numberOfPage + 1;
        }

        return numberOfPage;
    }

    //display product with type
    public void displayWithType(int start_prd, String prd_type) {
        try {
            //count the product with type
            String sql1 = "SELECT * FROM products WHERE type =" + "'" + prd_type + "'";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ResultSet rs1 = ps1.executeQuery();
            int count = rs1.last() ? rs1.getRow() : 0;
            rs1.beforeFirst();

            //get number of page when display limit product per page
            String sql2 = "SELECT * FROM products WHERE type =" + "'" + prd_type + "'" + "ORDER BY id DESC LIMIT " + start_prd + "," + limit;
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ResultSet rs2 = ps2.executeQuery();

            numberOfPage(count);

            rs1.close();
            rs2.close();
        } catch (SQLException ex) {
            System.out.println("Error display with type");
        }
    }

    public void displayWithSearch(String searchKeyword, int start_prd) {
        try {
            //count products without search result
            String sql1 = "SELECT * FROM products WHERE name LIKE " + "'%" + searchKeyword + "%'";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ResultSet rs1 = ps1.executeQuery();
            int count = rs1.last() ? rs1.getRow() : 0;
            rs1.beforeFirst();

            //get number of page when display litmit product per page
            String sql2 = "SELECT * FROM products WHERE name LIKE " + "'%" + searchKeyword + "%'" + "ORDER BY id DESC LIMIT " + start_prd + "," + limit;
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ResultSet rs2 = ps2.executeQuery();

            numberOfPage(count);

            rs1.close();
            rs2.close();
        } catch (SQLException ex) {
            System.out.println("Error display with search");
        }
    }

    public void display(int start_prd) {
        try {
            String sql1 = "SELECT * FROM products";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ResultSet rs1 = ps1.executeQuery();
            int count = rs1.last() ? rs1.getRow() : 0;
            rs1.beforeFirst();

            //get number of page when display litmit product per page
            String sql2 = "SELECT *FROM products ORDER BY id DESC LIMIT " + start_prd + "," + limit;
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ResultSet rs2 = ps2.executeQuery();

            numberOfPage(count);

            rs1.close();
            rs2.close();
        } catch (SQLException ex) {
            System.out.println("Error display with search");
        }
    }
}
