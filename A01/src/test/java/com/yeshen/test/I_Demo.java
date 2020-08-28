package com.yeshen.test;

import com.yeshen.bean.User;
import com.yeshen.dao.UserDao;
import com.yeshen.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.omg.CORBA.UShortSeqHelper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Demo Class
 *
 * @author cat77
 * @date 8/25/2020
 */
public class I_Demo {
    @Test
    public void test() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> users =userDao.findAll();

        System.out.println(users);

        sqlSession.close();

    }
    @Test
    public void testAdd() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = new User();

        user.setUsername("zsdfsdf");

        user.setSex("男");

        userDao.add(user);

        List<User> all = userDao.findAll();
        sqlSession.commit();
        System.out.println(all);

        sqlSession.close();
    }

    @Test
    public void testDeleteByID(){

        SqlSession sqlSession = SqlSessionFactoryUtils.getSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        userDao.deleteById(11,"dsfjsldj");

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = new User();

        user.setUid(1);
        Date date = new Date();
        date.setTime(435345534);
        user.setBirthday(date);
        user.setUsername("不知道叫啥憨憨");
        userDao.update(user);

        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testFindByFirstName(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> users = userDao.findByFirstWord("z");

        System.out.println(users);
    }

    @Test
    public void testCnt(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSession();

        UserDao us = sqlSession.getMapper(UserDao.class);
        System.out.println(us.queryCnt());

    }

    @Test
    public void query(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSession();

        UserDao us = sqlSession.getMapper(UserDao.class);

        List<User> userList = us.query();

        System.out.println(userList);
    }

    @Test
    public void queryByIdAndUserName(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSession();

        UserDao us = sqlSession.getMapper(UserDao.class);

        User user = new User();

        user.setUsername("sdfsd");



    }

}
