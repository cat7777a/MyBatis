package com.yeshen.dao;

import com.yeshen.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Demo Class
 *
 * @author cat77
 * @date 8/25/2020
 */
public interface UserDao {
    List<User> findAll ();

    void add(User user);

    int deleteById(@Param("id")Integer id,String aaa);

    void update(User user);

    List<User> findByFirstWord(String firstName);

    int queryCnt();

    List<User> query();

    List<User> findByIdAndName(@Param("uid") String uid, @Param("username") String username);
}
