package info.freeit.orders.service;

import info.freeit.orders.dao.OrderDao;
import info.freeit.orders.dao.OrderDaoImpl;
import info.freeit.orders.model.Order;
import info.freeit.orders.model.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

    private OrderDao orderDao = new OrderDaoImpl();

    public List<Order> fetchUserOrders(User user) {
        List<Order> ordersList = new ArrayList<>();
        try {
            ordersList.addAll(orderDao.getOrdersByUserId(user.getId()));

            ordersList = ordersList.stream()
                    .peek(it -> it.setUser(user))
                    .collect(Collectors.toList());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ordersList;
    }

    public boolean updateOrder(Order toUpdate) {
        boolean successful = false;
        try {
            successful = orderDao.updateOrder(toUpdate);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return successful;
    }
}
