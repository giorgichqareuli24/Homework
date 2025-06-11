package dao;

import entity.User;
import java.util.List;

public interface UserDao {
    void create(User user);
    void update(User user);
    User findByUsername(String username);
    User findByIBAN(String iban);
    List<User> findAll();
}
