package controller;

import dao.MobilDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/mobil")
public class MobilServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String kode =
                request.getParameter("kode");

        String merk =
                request.getParameter("merk");

        String tipe =
                request.getParameter("tipe");

        int tahun =
                Integer.parseInt(
                        request.getParameter("tahun"));

        String plat =
                request.getParameter("plat");

        double harga =
                Double.parseDouble(
                        request.getParameter("harga"));

        String status =
                request.getParameter("status");

        MobilDAO dao = new MobilDAO();

        dao.simpan(
                kode,
                merk,
                tipe,
                tahun,
                plat,
                harga,
                status);

        response.sendRedirect("mobil.jsp");
    }
}