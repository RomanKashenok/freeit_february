package info.freeit.orders.dao;

import info.freeit.orders.model.Order;

import java.sql.SQLException;
import java.util.List;

public interface OrderDao {
    List<Order> getOrdersByUserId(Long userId) throws SQLException;

    boolean updateOrder(Order toUpdate) throws SQLException;
}
