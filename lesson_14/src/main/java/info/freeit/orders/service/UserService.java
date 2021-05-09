package info.freeit.orders.service;

import info.freeit.orders.dao.UserDao;
import info.freeit.orders.dao.UserDaoImpl;
import info.freeit.orders.model.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public List<User> fetchAllUsers() {
        List<User> usersList = new ArrayList<>();
        try {
            List<User> allUsers = userDao.getAllUsers();
            usersList.addAll(allUsers);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usersList;
    }

    public User fetchUserById(Long id) {
        try {
            return userDao.getUserById(id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
