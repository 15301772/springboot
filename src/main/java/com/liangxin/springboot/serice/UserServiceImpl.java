package com.liangxin.springboot.serice;

import com.liangxin.springboot.mapper.UserMapper;
import com.liangxin.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper; //在spring容器中加载mapper实例

    @Override
    public User login(User user) { return userMapper.login(user); }

    @Override
    public int register(User user) { return userMapper.register(user); }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User getUserId(String id) { return userMapper.getUserId(id); }

    @Override
    public List<User> selectUserName(String userName) { return userMapper.selectUserName(userName); }

    @Override
    public Integer delete(List<Integer> ids) { return userMapper.delete(ids); }

    @Override public int update(User user) { return userMapper.update(user); }

    @Override
    public int selectCount() { return userMapper.selectCount(); }

    @Override
    public List<User> getUserListPage(Map<String, Object> map) { return userMapper.getUserListPage(map); }

    @Override
    public List<User> getUserList1() {
        return userMapper.getUserList1();
    }
}
