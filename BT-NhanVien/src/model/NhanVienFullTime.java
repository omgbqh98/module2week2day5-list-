package model;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucvu;

    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }


    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.ngayLamThem = ngayLamThem;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }

    public int getLoaiChucvu() {
        return loaiChucvu;
    }

    public void setLoaiChucvu(int loaiChucvu) {
        this.loaiChucvu = loaiChucvu;
    }

    @Override
    public String loaiNhanVien(String loaiNHanVien) {
        return "nhan vien full time";
    }

    public void tinhLuongsep() {
        System.out.println("ten: " + ten + " ,luong: " + Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP);
    }

    public void tinhLuongLinh() {
//        if (loaiChucvu == Configs.NHAN_VIEN_LINH) {
//            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
//        }else if (loaiChucvu == Configs.NHAN_VIEN_SEP)
        System.out.println("ten: " + ten + " ,luong: " + (Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY));
    }

    public void tinhLuongLinh2() {
        System.out.println("ten: " + ten + " ,luong: " + Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH);
    }

//
    @Override
    public void xuatThongTin() {
        System.out.println("loai nhan vien " );
    }
}
