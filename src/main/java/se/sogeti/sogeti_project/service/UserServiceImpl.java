package se.sogeti.sogeti_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.sogeti.sogeti_project.exception.ResourceNotFoundException;
import se.sogeti.sogeti_project.models.User;
import se.sogeti.sogeti_project.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User create(User user) {
        User saved = userRepository.save(user);
        return saved;
    }

    @Override
    public boolean delete(Integer userId) {
       userRepository.deleteById(userId);
       return !userRepository.existsById(userId);
    }
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Integer id) {
      // Optional<User > user = userRepository.findById(id);
       //if(user.isPresent()){
        // return user.get();
      // }else throw new ResourceNotFoundException("User","Id",id);
        return userRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("User","Id",id));
    }

    @Override
    public User updateUser(User user, Integer id) {
        // first check if user with id  is available or not
        User existingUser = userRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("User","Id",id));
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setTitle(user.getTitle());
        existingUser.setUserLevel(user.getUserLevel());
        existingUser.setPassword(user.getPassword());
        existingUser.setUserName(user.getUserName());

        userRepository.save(existingUser);
        return existingUser;
    }
}
