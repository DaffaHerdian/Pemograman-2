package controller;

import dao.CustomerDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        CustomerDAO dao =
                new CustomerDAO();

        dao.simpan(
                request.getParameter("id"),
                request.getParameter("nama"),
                request.getParameter("alamat"),
                request.getParameter("hp"),
                request.getParameter("ktp")
        );

        response.sendRedirect(
                "customer.jsp");
    }
}