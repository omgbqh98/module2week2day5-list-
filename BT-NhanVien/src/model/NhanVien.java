package model;

public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;

    }

    public String loaiNhanVien(String loaiNHanVien) {
        return loaiNHanVien;
    }

    public void xuatThongTin() {
        System.out.println("ten: " +ten + ", luong: " + luong);
    }


}
