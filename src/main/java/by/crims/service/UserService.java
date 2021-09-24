package by.crims.service;

import by.crims.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> userList = new ArrayList<>();

    public void save(User user){
        userList.add(user);
    }

    public User findByUsername(String username){
        for (User user : userList) {
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
}