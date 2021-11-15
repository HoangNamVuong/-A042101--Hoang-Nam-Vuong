package model.bean;

public class TComplex {
    private int maMatBang;
    private String trangThai;
    private int dienTich;
    private int soTang;
    private String loaiMatBang;
    private String giaTien;
    private String ngayBatDau;
    private String ngayKetThuc;

    public TComplex() {

    }

    public TComplex(int maMatBang,
                    String trangThai,
                    int dienTich,
                    int soTang,
                    String loaiMatBang,
                    String giaTien,
                    String ngayBatDau,
                    String ngayKetThuc) {
        this.maMatBang = maMatBang;
        this.trangThai = trangThai;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.loaiMatBang = loaiMatBang;
        this.giaTien = giaTien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getMaMatBang() {
        return maMatBang;
    }

    public void setMaMatBang(int maMatBang) {
        this.maMatBang = maMatBang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public String getLoaiMatBang() {
        return loaiMatBang;
    }

    public void setLoaiMatBang(String loaiMatBang) {
        this.loaiMatBang = loaiMatBang;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "TComplex{" +
                "maMatBang=" + maMatBang +
                ", trangThai='" + trangThai + '\'' +
                ", dienTich=" + dienTich +
                ", soTang=" + soTang +
                ", loaiMatBang='" + loaiMatBang + '\'' +
                ", giaTien='" + giaTien + '\'' +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                '}';
    }
}
