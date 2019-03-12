package Bai2;

public class XeTangDich extends XeTang {
    String loaiXeTang;


    public void nhapXe(Dan dan, String tocDoXe, String loaiXeTang) {
        super.nhapXe(dan, tocDoXe);
        switch (loaiXeTang) {
            case "1" :
                System.out.println("Xe thuong");
                break;
            case "2" :
                System.out.println("Xe boc thep");
                break;
            case "3" :
                System.out.println("Boss");
                break;
        }
        this.loaiXeTang = loaiXeTang;
    }

    @Override
    public void diChuyenXe() {
        super.diChuyenXe();
    }

    @Override
    public void ban() {
        super.ban();
    }

    @Override
    public void ktraTrungDan() {
        super.ktraTrungDan();
    }

    public void phaHuyBot() {
        System.out.println("Xe tang dich su dung dan  " + dan + " , co toc do " + tocDoXe + " va loai xe la " + loaiXeTang );
        System.out.println("Pha huy bot!");
    }
}
