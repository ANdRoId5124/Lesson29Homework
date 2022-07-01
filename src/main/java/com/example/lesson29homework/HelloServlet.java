package com.example.lesson29homework;

import java.io.*;
import java.util.ArrayList;

import ListOfGoods.Goods;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {


    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Goods good = new Goods();
        ArrayList<String> goods = good.getListOfGoods();

        request.setAttribute("listOfGoods",goods);
        request.getRequestDispatcher("myPage.jsp").forward(request,response);
    }

    public void destroy() {
    }

}