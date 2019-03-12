package Bai1;

public class HinhTron extends HinhHoc {
    double banKinh;
    double pi = Math.PI;

    void nhap(String tenHinh, double banKinh) {
        super.nhap(tenHinh);
        this.banKinh = banKinh;
    }

    @Override
    void tinhChuVi() {
        chuVi = 2 * pi * banKinh;
        super.tinhChuVi();
    }

    @Override
    void tinhDienTich() {
        dienTich = pi * banKinh * banKinh;
        super.tinhDienTich();
    }

    void tinhSTGVC() {
        dienTich = pi*pi*banKinh/4;
        System.out.println("Dien tich tam giac vuong can noi tiep duong tron la : " + dienTich);
    }
}
