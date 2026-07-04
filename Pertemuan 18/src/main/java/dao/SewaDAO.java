package dao;

import config.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SewaDAO {

    public boolean simpan(
            String noSewa,
            String tglSewa,
            String customer,
            String mobil,
            int lama,
            double total) {

        try {

            Connection con =
                    KoneksiDB.getConnection();

            String sql =
                    "INSERT INTO sewa VALUES(?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, noSewa);
            ps.setString(2, tglSewa);
            ps.setString(3, customer);
            ps.setString(4, mobil);
            ps.setInt(5, lama);
            ps.setDouble(6, total);

            ps.executeUpdate();

            PreparedStatement update =
                    con.prepareStatement(
                    "UPDATE mobil SET status='Disewa' WHERE kode_mobil=?");

            update.setString(1, mobil);

            update.executeUpdate();

            return true;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}