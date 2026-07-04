package controller;

import dao.SewaDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/sewa")
public class SewaServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String no =
                request.getParameter("nosewa");

        String tanggal =
                request.getParameter("tanggal");

        String customer =
                request.getParameter("customer");

        String mobil =
                request.getParameter("mobil");

        int lama =
                Integer.parseInt(
                request.getParameter("lama"));

        double total =
                Double.parseDouble(
                request.getParameter("total"));

        SewaDAO dao = new SewaDAO();

        dao.simpan(
                no,
                tanggal,
                customer,
                mobil,
                lama,
                total);

        response.sendRedirect(
                "sewa.jsp");
    }
}