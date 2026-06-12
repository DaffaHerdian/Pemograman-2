package model;

public class Sewa {

    private String noSewa;
    private String tglSewa;
    private String idCustomer;
    private String kodeMobil;
    private int lamaSewa;
    private double totalBayar;

    public String getNoSewa() {
        return noSewa;
    }

    public void setNoSewa(String noSewa) {
        this.noSewa = noSewa;
    }

    public String getTglSewa() {
        return tglSewa;
    }

    public void setTglSewa(String tglSewa) {
        this.tglSewa = tglSewa;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getKodeMobil() {
        return kodeMobil;
    }

    public void setKodeMobil(String kodeMobil) {
        this.kodeMobil = kodeMobil;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }
}