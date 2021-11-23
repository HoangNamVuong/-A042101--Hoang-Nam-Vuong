package model.bean;

public class LoaiMatBang {
    private int idLoaiMatBang;
    private String kieuMatBang;

    public LoaiMatBang() {

    }

    public LoaiMatBang(int idLoaiMatBang, String kieuMatBang) {
        this.idLoaiMatBang = idLoaiMatBang;
        this.kieuMatBang = kieuMatBang;
    }

    public int getIdLoaiMatBang() {
        return idLoaiMatBang;
    }

    public void setIdLoaiMatBang(int idLoaiMatBang) {
        this.idLoaiMatBang = idLoaiMatBang;
    }

    public String getKieuMatBang() {
        return kieuMatBang;
    }

    public void setKieuMatBang(String kieuMatBang) {
        this.kieuMatBang = kieuMatBang;
    }
}
