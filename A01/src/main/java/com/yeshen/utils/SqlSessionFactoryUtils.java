package com.yeshen.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Demo Class
 *
 * @author cat77
 * @date 8/25/2020
 */
public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }

    public static void close(SqlSession sqlSession){
       sqlSession.close();
    }
}
