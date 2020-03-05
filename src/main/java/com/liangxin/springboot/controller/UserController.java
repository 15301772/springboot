package com.liangxin.springboot.controller;

import com.liangxin.springboot.pojo.User;
import com.liangxin.springboot.serice.UserService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("login")
    public User Login(@RequestBody User user) {
        User loginUser = userService.login(user);
        return loginUser;
    }

    @PostMapping("register")
    public int register(User user) {
        int register = userService.register(user);
        return register;
    }

    @PostMapping("getUserList")
    public Map<String, Object> getUserList() {
        Map<String, Object> map = new HashMap<>();
        int count = userService.selectCount();
        List<User> userList = userService.getUserList();
        map.put("rows", userList);
        map.put("total", count);
        return map;
    }

    @PostMapping("getUserId")
    public User getUserId( String id) {
        return userService.getUserId(id);
    }

    @PostMapping("selectUserName/{userName}")
    public List<User> selectUserName(@PathVariable("userName") String userName) {
        return userService.selectUserName(userName);
    }

    @PostMapping("/delete")
    public Integer delete(String[] ids) {
        List<Integer> ids_l = new ArrayList<>();
        for (String id : ids)
        {
            ids_l.add(Integer.parseInt(id));
        }
        return userService.delete(ids_l);
    }

    @PostMapping("/update")
    public int update(User user) {
        return userService.update(user);
    }

    @PostMapping("getUserListPage")
    public Map <String,Object> getUserListPage(int page,int rows){
        Integer count = userService.selectCount();//记录总数
        int pageStart = (page - 1) * rows;
        int pageSize = rows;
        Map<String,Object> map = new HashMap<>();
        map.put("pageStart",pageStart);
        map.put("pagesize",pageSize);
        List<User> userListPage = userService.getUserListPage(map);
        Map<String,Object> remap = new HashMap<>();
        remap.put("rows",userListPage);
        remap.put("total",count);
        return remap;
    }
    @PostMapping("getUserList1")
    public Map<String,Object> getUserList1(){
        int i = userService.selectCount();
        List<User> list=userService.getUserList1();
        Map<String,Object> map=new HashMap<>();
        map.put("total",i);
        map.put("rows",list);
        return map;
    }

}
