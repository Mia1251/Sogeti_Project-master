package se.sogeti.sogeti_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.sogeti.sogeti_project.models.User;
import se.sogeti.sogeti_project.service.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/event/api/v1/users")
@CrossOrigin("*")
public class UserController {


    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User createForm){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(createForm));
    }
@GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }
@DeleteMapping("{id}")
public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        userService.delete(id);
        return new ResponseEntity<String>("User deleted successfully",HttpStatus.NO_CONTENT);
}
@GetMapping("{id}")
public ResponseEntity<User> findUserById( @PathVariable("id") Integer id){
        return ResponseEntity.ok(userService.findUserById(id));
}
@PutMapping("{id}")
public ResponseEntity<User> updateUser( @PathVariable("id") Integer id, @RequestBody User user){
return new ResponseEntity<User>(userService.updateUser(user,id),HttpStatus.OK);

}
}
