package service;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDaoImpl();

    public boolean registerUser(String username, String password, String firstName, String lastName) {
        if (userDao.findByUsername(username) != null) return false;

        String iban = generateIBAN();
        User user = new User(firstName, lastName, username, password, iban, 0.0);
        userDao.create(user);
        return true;
    }

    public User login(String username, String password) {
        User user = userDao.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public User findByIban(String iban) {
        return userDao.findByIBAN(iban);
    }

    private String generateIBAN() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder iban = new StringBuilder();
        for (int i = 0; i < 34; i++) {
            int index = (int) (Math.random() * chars.length());
            iban.append(chars.charAt(index));
        }
        return iban.toString();
    }
}
