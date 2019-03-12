package Bai2;

public class Dan {
    String satthuong ;
    String tocDoDan;

   public void nhapDan(String satthuong, String tocDoDan) {
        this.satthuong = satthuong;
        this.tocDoDan = tocDoDan;
    }

    public void diChuyen() {
        System.out.println("Dan dang di chuyen voi toc do " + tocDoDan);
    }

    public void no() {
        System.out.println("Dan dang no voi luc sat thuong : " + satthuong);
    }

}
