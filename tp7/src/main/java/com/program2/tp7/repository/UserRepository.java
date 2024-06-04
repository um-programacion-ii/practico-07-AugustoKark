package com.program2.tp7.repository;


import com.program2.tp7.Model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.LogManager;

@Repository
public class UserRepository {
    private Map<Long, User> database= new HashMap<>();
    private Long id=1L;

    public User save(User user){
        if (user.getId()==null){
            user.setId(id++);
        }
        database.put(user.getId(), user);
        return user;
    }
    public String delete(Long id){
        try {
            database.remove(id);
            return "User deleted";
        }catch (Exception e){
            return "User not found";
        }

    }
}
