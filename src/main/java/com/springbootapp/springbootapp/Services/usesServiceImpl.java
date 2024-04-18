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
}