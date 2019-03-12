package Bai1;

public class HinhVuong extends HinhHoc {
    int b = 4;
    double a;

    void nhap(String tenHinh, double a) {
        super.nhap(tenHinh);
        this.a = a;
        System.out.println("Hinh vuong " + tenHinh + " co " + b + " canh.");
    }

    @Override
    void tinhChuVi() {
        chuVi = a * 4;
        super.tinhChuVi();
    }

    @Override
    void tinhDienTich() {
        dienTich = Math.pow(a, 2);
        super.tinhDienTich();
    }

    void tinhTongCDai() {
        double c = chuVi + 2 * (Math.sqrt(2)) * a;
        System.out.println("Tong can tinh la : " + c);
    }
}
