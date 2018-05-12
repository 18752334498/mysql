package com.yucong.service;

import com.yucong.bean.User;
import com.yucong.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService implements UserClient{

    @Autowired
    private UserClient userClient;

    @Override
    public List<User> getAll() {
        return userClient.getAll();
    }
}
