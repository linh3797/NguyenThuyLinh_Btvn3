package Bai1;

import Bai2.Dan;
import Bai2.XeTangDich;
import Bai2.XeTangTa;

public class Main {
    public static void main(String[] args) {
        HinhTron c1 = new HinhTron();
        c1.nhap("c1", 4.5d);
        c1.tinhChuVi();
        c1.tinhDienTich();
        c1.tinhSTGVC();
        System.out.println("===============================");

        HinhVuong v1 = new HinhVuong();
        v1.nhap("v1", 4.0d);
        v1.tinhChuVi();
        v1.tinhDienTich();
        v1.tinhTongCDai();
        System.out.println("===============================");

        Dan d1 = new Dan();
        d1.nhapDan("lon", "180km/h");
        XeTangTa xtt = new XeTangTa();
        xtt.nhapXe(d1, "40km/h", 3);
        xtt.diChuyenXe();
        xtt.ban();
        xtt.ktraTrungDan();
        xtt.baoVeBot();
        System.out.println("===============================");

        XeTangDich xtd = new XeTangDich();
        xtd.nhapXe(d1, "50km/h", "1");
        xtd.diChuyenXe();
        xtd.ban();
        xtd.ktraTrungDan();
        xtd.phaHuyBot();

    }
}
