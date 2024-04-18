package com.springbootapp.springbootapp.Services;

import com.springbootapp.springbootapp.Entities.users;

public interface usersService {
    public void saveuser(users users);

    public users validateLogin(String email, String password);
}
