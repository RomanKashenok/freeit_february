package info.freeit.orders.dao;

import info.freeit.orders.model.Order;
import info.freeit.orders.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    private DBUtils dbUtils = new DBUtils();

    @Override
    public List<Order> getOrdersByUserId(Long userId) throws SQLException {
        List<Order> orders = new ArrayList<>();
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement("select id, comment from uorder where user_id = ?");
        ps.setLong(1, userId);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Order o = new Order();
            o.setId(rs.getLong(1));
            o.setComment(rs.getString(2));
            orders.add(o);
        }
        dbUtils.closeConnection(connection);
        return orders;
    }

    @Override
    public boolean updateOrder(Order toUpdate) throws SQLException {
        Connection connection = dbUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement("update uorder set comment = ?, user_id = ? where id = ?");
        ps.setString(1, toUpdate.getComment());
        ps.setLong(2, toUpdate.getUser().getId());
        ps.setLong(3, toUpdate.getId());
        int rowsAffected = ps.executeUpdate();
        if(rowsAffected > 0) {
            return true;
        }
        return false;
    }


}
