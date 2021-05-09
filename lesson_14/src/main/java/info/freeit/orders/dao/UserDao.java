package info.freeit.orders.dao;

import info.freeit.orders.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers() throws SQLException;

    User getUserById(Long id) throws SQLException;
}
