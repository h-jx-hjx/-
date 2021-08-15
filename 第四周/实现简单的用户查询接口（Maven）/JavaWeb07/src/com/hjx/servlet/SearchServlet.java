package com.hjx.servlet;

import com.hjx.dao.GoodDao;
import com.hjx.dao.GoodDaoImp1;
import com.hjx.pojo.Good;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID=1l;

    private GoodDao goodDao=new GoodDaoImp1();
public SearchServlet(){
    super();
}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        doPost(request, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
       String keyWords=request.getParameter("kw");
        System.out.println(keyWords);
        List<Good> goods=goodDao.queryByName(keyWords);
        request.setAttribute("list",goods);
        System.out.println("====");
        request.getRequestDispatcher("good.jsp").forward(request,resp);
    }
}
