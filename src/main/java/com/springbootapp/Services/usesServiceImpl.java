package com.springbootapp.Services;

import org.springframework.stereotype.Service;
import com.springbootapp.Entities.users;
import com.springbootapp.Repositories.usersRepository;

@Service
public class usesServiceImpl implements usersService {

    private usersRepository repo;

    @Override
    public void saveuser(users users) {
        repo.save(users);
    }
}
