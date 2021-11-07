package service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public boolean insertUser(User user);

    public User selectUser(int id);

    public User selectUserByCountry(String country);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id);

    public boolean updateUser(User user);
}
