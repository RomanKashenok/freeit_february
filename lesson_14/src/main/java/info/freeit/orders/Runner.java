package info.freeit.orders;

import info.freeit.orders.model.Order;
import info.freeit.orders.model.User;
import info.freeit.orders.service.OrderService;
import info.freeit.orders.service.UserService;

import java.util.List;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {

        Random rand = new Random();

        UserService us = new UserService();
        OrderService os = new OrderService();

        List<User> users = us.fetchAllUsers();
        System.out.println(users);

        User randomUser = us.fetchUserById(users.get(rand.nextInt(users.size())).getId());
        System.out.println(randomUser);

        System.out.println("**** **** **** randomUsers orders: ");
        List<Order> userOrders = os.fetchUserOrders(randomUser);
        System.out.println(userOrders);

        Order orderToUpdate = userOrders.get(0);

        orderToUpdate.setComment("TEST COMMENT UPDATE");
        boolean updated = os.updateOrder(orderToUpdate);

        System.out.println("**************  order to update");
        System.out.println(orderToUpdate);
        System.out.println("************** order updated: " + updated);

    }
}
