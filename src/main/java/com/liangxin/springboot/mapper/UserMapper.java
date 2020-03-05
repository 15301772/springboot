package com.liangxin.springboot.mapper;

import com.liangxin.springboot.pojo.User;
import com.sun.javafx.collections.MappingChange;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {
    //@Select("select * from user where userName = #{username} and password = #{password}")
    public User login(User user);

    public int register(User user);

    //@Select("select * from user")
    public List<User> getUserList();

    public User getUserId(String id);

    public List<User> selectUserName(String userName);

    public Integer delete(List <Integer> ids);

    public int update(User user);

    public int selectCount();

    public List<User> getUserListPage(Map<String,Object> map);

    public List<User> getUserList1();


}
