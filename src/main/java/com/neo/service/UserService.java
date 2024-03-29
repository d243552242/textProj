package com.neo.service;

import com.neo.model.User;
import java.util.List;

public interface UserService {
    public User findUserById(long id);
    public void save(User user);
    public void edit(User user);
    public void delete(long id);
    
    List<User> getUserList();
}
