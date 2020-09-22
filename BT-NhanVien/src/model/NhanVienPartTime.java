package model;

import util.Configs;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec ) {

        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    public void tinhLuong() {
        System.out.println("ten: "+ten + " ,luong: "+ Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO*gioLamViec);
    }

    @Override
    public String loaiNhanVien(String loaiNHanVien) {
        return "nhan viet part time";
    }

}
