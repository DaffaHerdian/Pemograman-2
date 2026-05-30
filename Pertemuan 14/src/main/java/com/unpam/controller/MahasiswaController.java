package com.unpam.controller;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.unpam.model.Koneksi;

@WebServlet("/MahasiswaController")
public class MahasiswaController extends HttpServlet{
protected void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
try{
Connection con=Koneksi.getKoneksi();
PreparedStatement ps=con.prepareStatement(
"insert into mahasiswa values(?,?,?,?)");
ps.setString(1,req.getParameter("nim"));
ps.setString(2,req.getParameter("nama"));
ps.setString(3,req.getParameter("jurusan"));
ps.setString(4,req.getParameter("semester"));
ps.executeUpdate();
res.sendRedirect("view/mahasiswa.jsp?sukses=1");
}catch(Exception e){
res.getWriter().println(e);
}
}
}