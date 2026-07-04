package controller;

import dao.PengembalianDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/pengembalian")
public class PengembalianServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        PengembalianDAO dao =
                new PengembalianDAO();

        dao.simpan(
                request.getParameter("nokembali"),
                request.getParameter("nosewa"),
                request.getParameter("tanggal"),
                Double.parseDouble(
                        request.getParameter("denda")),
                Double.parseDouble(
                        request.getParameter("total"))
        );

        response.sendRedirect(
                "pengembalian.jsp");
    }
}