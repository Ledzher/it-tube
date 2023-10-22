package it.academy.ittube.controller;

import it.academy.ittube.model.UserModel;
import it.academy.ittube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/create")
    public ResponseEntity<UserModel> create(@RequestBody UserModel userModel){
    return ResponseEntity.ok(userService.create(userModel));
    }

    @GetMapping
    public ResponseEntity<UserModel> getUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.getById(id));
    }

    @GetMapping
    public List<UserModel> getAll(){
        return userService.getAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserModel> update(@PathVariable Long id, @RequestBody UserModel userModel){
        return userService.update(id, userModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }

}
