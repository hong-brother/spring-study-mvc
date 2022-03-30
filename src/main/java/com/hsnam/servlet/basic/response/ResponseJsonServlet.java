package com.hsnam.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsnam.servlet.basic.HelloData;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Content-Type: application/json
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        HelloData helloData = new HelloData();
        helloData.setAge(20);
        helloData.setUsername("kim");

        String json = objectMapper.writeValueAsString(helloData);
        PrintWriter writer = response.getWriter();
        writer.write(json);
    }
}
