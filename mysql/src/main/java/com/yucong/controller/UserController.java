package com.yucong.controller;

import com.yucong.bean.User;
import com.yucong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public String getAll(ModelMap map){
        List<User> list = userService.getAll();
        list.forEach(System.out::println);

        map.put("list",list);

        return "index";
    }


}
