package se.sogeti.sogeti_project.service;

import se.sogeti.sogeti_project.models.User;

import java.util.List;

public interface UserService {

    User create (User user);
    boolean delete (Integer userId);

    List<User> findAllUsers();
    User findUserById(Integer id);
    User updateUser(User user,Integer id);
}
