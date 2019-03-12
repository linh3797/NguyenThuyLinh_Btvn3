package Bai2;

import java.util.Random;

public class XeTang {
    Dan dan;
    String tocDoXe;

    public void nhapXe(Dan dan, String tocDoXe) {
        this.dan = dan;
        this.tocDoXe = tocDoXe;
    }

    public void diChuyenXe() {
        System.out.println("Xe dang di chuyen voi toc do : " + tocDoXe);
    }

    public void ban() {
        System.out.println("Xe dang ban voi toc do dan : " + dan.tocDoDan );
    }

    public void ktraTrungDan() {
        Random r = new Random();
        boolean check = r.nextBoolean();
        System.out.println(check);
    }

}
