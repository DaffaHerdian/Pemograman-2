package dao;

import config.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MobilDAO {

    public boolean simpan(
            String kode,
            String merk,
            String tipe,
            int tahun,
            String plat,
            double harga,
            String status) {

        try {

            Connection con =
                    KoneksiDB.getConnection();

            String sql =
                    "INSERT INTO mobil VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, kode);
            ps.setString(2, merk);
            ps.setString(3, tipe);
            ps.setInt(4, tahun);
            ps.setString(5, plat);
            ps.setDouble(6, harga);
            ps.setString(7, status);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}