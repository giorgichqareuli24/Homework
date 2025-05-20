package dao;

import javaClasses.User;
import java.sql.SQLException;

public interface UserDAO {
    void register(User user) throws SQLException;
    boolean login(String username, String password) throws SQLException;
}
