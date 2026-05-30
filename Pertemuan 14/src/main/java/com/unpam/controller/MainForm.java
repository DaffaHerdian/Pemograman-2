package com.unpam.controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/MainForm")
public class MainForm extends HttpServlet{
protected void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
req.getRequestDispatcher("/view/dashboard.jsp").forward(req,res);
}
}