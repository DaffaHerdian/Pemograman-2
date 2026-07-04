package model;

public class Pengembalian {

    private String noKembali;
    private String noSewa;
    private String tglKembali;
    private double denda;
    private double totalBayar;

    public String getNoKembali() {
        return noKembali;
    }

    public void setNoKembali(String noKembali) {
        this.noKembali = noKembali;
    }

    public String getNoSewa() {
        return noSewa;
    }

    public void setNoSewa(String noSewa) {
        this.noSewa = noSewa;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }
}