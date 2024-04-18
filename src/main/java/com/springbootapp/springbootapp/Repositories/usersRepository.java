package com.springbootapp.springbootapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springbootapp.springbootapp.Entities.users;

@Repository
public interface usersRepository extends JpaRepository<users, Integer> {
    users findByEmail(String email);
}
