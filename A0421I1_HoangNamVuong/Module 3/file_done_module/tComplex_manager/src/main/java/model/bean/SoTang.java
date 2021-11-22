package model.bean;

public class SoTang {
    private int idSoTang;
    private String tenTang;

    public SoTang() {

    }

    public SoTang(int idSoTang, String tenTang) {
        this.idSoTang = idSoTang;
        this.tenTang = tenTang;
    }

    public int getIdSoTang() {
        return idSoTang;
    }

    public void setIdSoTang(int idSoTang) {
        this.idSoTang = idSoTang;
    }

    public String getTenTang() {
        return tenTang;
    }

    public void setTenTang(String tenTang) {
        this.tenTang = tenTang;
    }
}
