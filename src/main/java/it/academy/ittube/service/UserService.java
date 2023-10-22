package it.academy.ittube.service;

import it.academy.ittube.model.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

   UserModel create (UserModel userModel);

    ResponseEntity<UserModel> update(Long id, UserModel userModel);

    UserModel getById(Long id);

    List<UserModel> getAll();

    void deleteById(Long id);
}
