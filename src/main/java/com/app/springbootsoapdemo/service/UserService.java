package com.app.springbootsoapdemo.service;

import com.dickaspring.spring_boot_soap_demo.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initializer(){

        User user1 = new User();
        user1.setEmpId(1);
        user1.setName("Muhammad Dicka Nirwansyah");
        user1.setSalary(800000);

        User user2 = new User();
        user2.setEmpId(2);
        user2.setName("Eko Khannedy");
        user2.setSalary(500000);

        User user3 = new User();
        user3.setEmpId(3);
        user3.setName("Denada Rosa Florina");
        user3.setSalary(7000000);

        users.put(user1.getName(), user1);
        users.put(user2.getName(), user2);
        users.put(user3.getName(), user3);

    }

    public User getUsers(String name){
        return users.get(name);
    }

}
