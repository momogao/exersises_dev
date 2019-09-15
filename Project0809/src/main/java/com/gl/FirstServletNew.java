package com.gl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServletNew extends javax.servlet.http.HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");
            response.setCharacterEncoding("GBK");
            PrintWriter out =response.getWriter();
            out.println("<THML>");
            out.println("<HEAD><TITLE>Servlet实例</TITLE></HEAD>");
            out.println("<BODY>");
            out.print("Servlet实列：");
            out.print(this.getClass());
            out.println("</BODY>");
            out.println("</HTML>");
            out.flush();
            out.close();
    }
}
