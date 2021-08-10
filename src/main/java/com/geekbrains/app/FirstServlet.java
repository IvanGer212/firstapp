package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.geekbrains.app.context.domain.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: GET");
        ArrayList<Product> products = new ArrayList<>();
        final Random random = new Random();
        Stream<Product> stream = products.stream();
        for (int i = 1; i <=10 ; i++) {
            products.add(new Product(i,"Product "+i, round(random.nextDouble()*i*1000)));
        }
        resp.getWriter().printf("<html><body>");
        stream.forEach(p-> {
            try {
                resp.getWriter().printf("<h1>"+p.toString()+"</h1>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        resp.getWriter().printf("</body></html>");
    }

    private static double round (double value){
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
