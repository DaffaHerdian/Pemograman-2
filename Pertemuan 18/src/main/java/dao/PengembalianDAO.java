package dao;

import config.KoneksiDB;
import java.sql.*;

public class PengembalianDAO {

    public boolean simpan(
            String noKembali,
            String noSewa,
            String tanggal,
            double denda,
            double total) {

        try {

            Connection con =
                    KoneksiDB.getConnection();

            String sql =
                    "INSERT INTO pengembalian VALUES(?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, noKembali);
            ps.setString(2, noSewa);
            ps.setString(3, tanggal);
            ps.setDouble(4, denda);
            ps.setDouble(5, total);

            ps.executeUpdate();

            return true;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}