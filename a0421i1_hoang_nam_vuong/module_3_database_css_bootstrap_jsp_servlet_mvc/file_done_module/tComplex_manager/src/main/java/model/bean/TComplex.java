package model.bean;

import java.util.Date;

public class TComplex {
    private int idMatBang;
    private String maMatBang;
    private String dienTich;
    private int idTrangThai;
    private int idSoTang;
    private int idLoaiMatBang;
    private String giaTien;
    private String ngayBatDau;
    private String ngayKetThuc;

    public TComplex() {
    }

    public TComplex(int idMatBang,
                    String maMatBang,
                    String dienTich,
                    int idTrangThai,
                    int idSoTang,
                    int idLoaiMatBang,
                    String giaTien,
                    String ngayBatDau,
                    String ngayKetThuc) {
        this.idMatBang = idMatBang;
        this.maMatBang = maMatBang;
        this.dienTich = dienTich;
        this.idTrangThai = idTrangThai;
        this.idSoTang = idSoTang;
        this.idLoaiMatBang = idLoaiMatBang;
        this.giaTien = giaTien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public TComplex(String maMatBang,
                    String dienTich,
                    int idTrangThai,
                    int idSoTang,
                    int idLoaiMatBang,
                    String giaTien,
                    String ngayBatDau,
                    String ngayKetThuc) {
        this.maMatBang = maMatBang;
        this.dienTich = dienTich;
        this.idTrangThai = idTrangThai;
        this.idSoTang = idSoTang;
        this.idLoaiMatBang = idLoaiMatBang;
        this.giaTien = giaTien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getIdMatBang() {
        return idMatBang;
    }

    public void setIdMatBang(int idMatBang) {
        this.idMatBang = idMatBang;
    }

    public String getMaMatBang() {
        return maMatBang;
    }

    public void setMaMatBang(String maMatBang) {
        this.maMatBang = maMatBang;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public int getIdTrangThai() {
        return idTrangThai;
    }

    public void setIdTrangThai(int idTrangThai) {
        this.idTrangThai = idTrangThai;
    }

    public int getIdSoTang() {
        return idSoTang;
    }

    public void setIdSoTang(int idSoTang) {
        this.idSoTang = idSoTang;
    }

    public int getIdLoaiMatBang() {
        return idLoaiMatBang;
    }

    public void setIdLoaiMatBang(int idLoaiMatBang) {
        this.idLoaiMatBang = idLoaiMatBang;
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
}
