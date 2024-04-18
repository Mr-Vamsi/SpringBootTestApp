package com.springbootapp.springbootapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapp.springbootapp.Entities.*;
import com.springbootapp.springbootapp.Repositories.usersRepository;

@Service
public class usesServiceImpl implements usersService {

    @Autowired
    private usersRepository repository;

    @Override
    public void saveuser(users users) {
        repository.save(users);
    }

    @Override
    public users validateLogin(String email, String password) {
        users userData = repository.findByEmail(email);
        if (userData != null && userData.getEmail().equals(email) && userData.getPassword().equals(password)) {
            System.out.println(userData.getEmail());
            System.out.println(userData.getName());
            System.out.println(userData.getPhone());
            return userData;
        } else {
            return null;
        }
    }
}