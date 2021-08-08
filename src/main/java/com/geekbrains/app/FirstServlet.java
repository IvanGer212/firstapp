package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import product.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: GET");
        ArrayList<Product> products = new ArrayList<>();
        resp.getWriter().printf("<html><body>");
        for (int i = 1; i <=10 ; i++) {
            products.add(new Product(i,"Product "+i, i*1000));
        }
        for (int i = 0; i <10 ; i++) {
            resp.getWriter().printf("<h1>"+products.get(i).toString()+"</h1>");
        }
        resp.getWriter().printf("</body></html>");
    }
}
