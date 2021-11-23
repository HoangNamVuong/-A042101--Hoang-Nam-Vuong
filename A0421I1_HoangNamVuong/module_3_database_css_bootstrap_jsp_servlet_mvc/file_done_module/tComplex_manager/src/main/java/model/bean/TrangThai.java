package model.bean;

public class TrangThai {
    private int idTrangThai;
    private String kieuTrangThai;

    public TrangThai(){

    }

    public TrangThai(int idTrangThai, String kieuTrangThai) {
        this.idTrangThai = idTrangThai;
        this.kieuTrangThai = kieuTrangThai;
    }

    public int getIdTrangThai() {
        return idTrangThai;
    }

    public void setIdTrangThai(int idTrangThai) {
        this.idTrangThai = idTrangThai;
    }

    public String getKieuTrangThai() {
        return kieuTrangThai;
    }

    public void setKieuTrangThai(String kieuTrangThai) {
        this.kieuTrangThai = kieuTrangThai;
    }
}
