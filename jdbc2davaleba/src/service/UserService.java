package service;

import dao.UserDAO;
import dao.UserDAOImpl;
import javaClasses.User;

import java.sql.SQLException;

public class UserService {
    private UserDAO userDAO = new UserDAOImpl();

    public void register(String username, String password, String firstName, String lastName) {
        User user = new User(username, password, firstName, lastName);
        try {
            userDAO.register(user);
            System.out.println("რეგისტრაცია წარმატებულია!");
        } catch (SQLException e) {
            System.out.println("რეგისტრაციის შეცდომა: " + e.getMessage());
        }
    }

    public void login(String username, String password) {
        try {
            if (userDAO.login(username, password)) {
                System.out.println("ავტორიზაცია წარმატებულია!");
            } else {
                System.out.println("არასწორი მონაცემები!");
            }
        } catch (SQLException e) {
            System.out.println("შეცდომა ავტორიზაციისას: " + e.getMessage());
        }
    }
}
