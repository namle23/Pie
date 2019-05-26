package data;

import beans.Users;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;

public class AccountDB {

    ConnectionPool pool = ConnectionPool.getInstance();

    private Connection conn = pool.getConnection();

    public AccountDB(Connection conn) {
        this.conn = conn;
    }

    public boolean login(String username, String password) throws SQLException {

        boolean st;

        String sql = "SELECT * FROM USERS WHERE username=? AND password=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        st = rs.next();

        rs.close();

        return st;
    }

    public void create(String newusername, String newpassword,
            String newfullname, String newaddress, String newphone) throws SQLException {
        String sql = "INSERT INTO dbs.users (username, password, full_name, address, phone) VALUES (?,?,?,?,?);";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, newusername);
        ps.setString(2, newpassword);
        ps.setString(3, newfullname);
        ps.setString(4, newaddress);
        ps.setString(5, newphone);

        ps.executeUpdate();
        ps.close();
    }

    public void comment(String username, String comment, String photo,
            String strDateFormatted) throws SQLException {
        String sql = "INSERT INTO dbs.comments (username, comment, photo, date) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, comment);
        ps.setString(3, photo);
        ps.setString(4, strDateFormatted);
        ps.executeUpdate();
        ps.close();
    }

    public boolean exists(String username) throws SQLException {
        boolean st;

        String sql = "SELECT * FROM USERS WHERE username=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, username);

        ResultSet rs = ps.executeQuery();

        st = rs.next();

        return st;
    }

    public Users show(String username) throws SQLException {
        Users user = null;

        String sql = "SELECT * FROM USERS WHERE username=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, username);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String fullname = rs.getString("full_name");
            String address = rs.getString("address");
            String phone = rs.getString("phone");

            user = new Users(id, fullname, address, phone);
        }

        return user;
    }
}
