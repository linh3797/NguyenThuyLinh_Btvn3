package Bai2;

public class XeTangTa extends XeTang {
    int soMang;

    public void nhapXe(Dan dan, String tocDoXe, int soMang) {
        super.nhapXe(dan, tocDoXe);
        this.soMang = soMang;
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

    public void baoVeBot() {
        System.out.println("Xe tang ta su dung dan  cos toc do dan : "  + dan.tocDoDan + ", co toc do xe " + tocDoXe + " va co so mang la : " + soMang );
        System.out.println("Bao ve bot!");
    }
}
