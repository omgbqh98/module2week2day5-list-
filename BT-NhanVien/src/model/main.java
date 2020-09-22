package model;

import util.Configs;

public class main {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("tran van sep");
        sep.setLoaiChucvu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("nguyen van linh");
        NhanVienFullTime linh2 = new NhanVienFullTime("bui quang linh",3);

        NhanVienPartTime thoivu = new NhanVienPartTime("nguyen van thoi", 240);

        sep.tinhLuongsep();
        linh1.tinhLuongLinh2();
        linh2.tinhLuongLinh();
        thoivu.tinhLuong();

        sep.xuatThongTin();

    }
}
