package com.scmanager.services;

import java.util.List;
import java.util.Optional;

import com.scmanager.entities.User;

public interface UserService {
User SaveUser(User user);
Optional<User> getUserById(String id);
Optional<User>  updateUser(User user);
void deleteUser(String id);
boolean isUserExist(String userId);
boolean isUserExistByEmail(String email);
List<User> getAllUsers();

}
