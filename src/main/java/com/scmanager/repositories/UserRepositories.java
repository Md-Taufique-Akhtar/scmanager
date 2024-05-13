package com.scmanager.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scmanager.entities.User;
@Repository
public interface UserRepositories extends JpaRepository<User, String>{
//extra method DB relatedoperatons
//custom quary method
//custom finder method
Optional<User> findByEmail(String email);
Optional<User> findByEmailAndPassword(String email, String password);
    


}
