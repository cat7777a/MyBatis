package cn.itcast.test;

import cn.itcast.test.bean.Result;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Demo Class
 *
 * @author cat77
 * @date 8/27/2020
 */
@WebServlet("/ServletDemo01")
public class ServletDemo01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Result result = JsonUtils.parseJSON2Object(request, Result.class);


            response.getWriter().write("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
