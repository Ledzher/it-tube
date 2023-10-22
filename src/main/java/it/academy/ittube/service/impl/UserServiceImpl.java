package it.academy.ittube.service.impl;


import it.academy.ittube.model.UserModel;
import it.academy.ittube.repository.UserRepository;
import it.academy.ittube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserModel create(UserModel userModel) {
        return null;
    }

    @Override
    public ResponseEntity<UserModel> update(Long id, UserModel userModel) {
        return null;
    }

    @Override
    public UserModel getById(Long id) {
        return null;
    }

    @Override
    public List<UserModel> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
