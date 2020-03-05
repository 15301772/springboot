package com.liangxin.springboot.serice;

import com.liangxin.springboot.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public User login(User user);

    public int register(User user);

    public List<User> getUserList();

    public User getUserId(String id);

    public List<User> selectUserName(String userName);

    public Integer delete(List <Integer> ids);

    public int update(User user);

    public int selectCount();

    public List<User> getUserListPage(Map<String,Object> map);

    public List<User> getUserList1();
}
