package Bai1;

public class HinhHoc {
    String tenHinh;
    double chuVi;
    double dienTich;

    /**
     * initial information for Student
     * @param tenHinh the shape's name
     *
     *
     *
     * */
    void nhap(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    void tinhDienTich() {
        System.out.println("Dien tich " + tenHinh + " là : "+ dienTich);
    }
    void tinhChuVi() {
        System.out.println("Chu vi " + tenHinh + " la : " + chuVi);
    }
}
