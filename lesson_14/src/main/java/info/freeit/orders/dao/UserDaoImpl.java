package info.freeit.orders.dao;

import info.freeit.orders.model.User;
import info.freeit.orders.util.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private DBUtils dbutils = new DBUtils();

    @Override
    public List<User> getAllUsers() throws SQLException {
        Connection connection = dbutils.getConnection();
        Statement pechkin = connection.createStatement();
        ResultSet rs = pechkin.executeQuery("select id, name, active, created from users");

        return createUsers(rs, connection);
    }

    @Override
    public User getUserById(Long id) throws SQLException {
        Connection connection = dbutils.getConnection();
        PreparedStatement pechkin = connection.prepareStatement("select id, name, active, created from users where id = ?");
        pechkin.setLong(1, id);

        ResultSet rs = pechkin.executeQuery();
        return createUsers(rs, connection).get(0);
    }

    private List<User> createUsers(ResultSet rs, Connection connection) throws SQLException {
        List<User> users = new ArrayList<>();
        while (rs.next()) {
            User u = new User();
            u.setId(rs.getLong(1));
            u.setName(rs.getString(2));
            u.setActive(rs.getBoolean(3));
            u.setCreated(rs.getDate(4));
            users.add(u);
        }
        dbutils.closeConnection(connection);
        return users;
    }

}
