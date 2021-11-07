package service.impl;

import model.bean.User;
import model.repository.UserRepository;
import model.repository.impl.UserRepositoryImpl;
import service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public boolean insertUser(User user){
        return userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public User selectUserByCountry(String country) {
        return userRepository.selectUserByCountry(country);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id){
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user){
        return userRepository.updateUser(user);
    }
}
