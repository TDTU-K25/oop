public class NongSan extends MatHang {
    private String loaiNongSan;

    public NongSan(String maMH, String tenMH, double giaBan, String loaiNongSan) {
        super(maMH, tenMH, giaBan);
        this.loaiNongSan = loaiNongSan;
    }

    public double tinhThue() {
        if (loaiNongSan.equals("Bap Cai") || loaiNongSan.equals("Ca Chua")) {
            return 0.1;
        }
        return 0.05;
    }

    @Override
    public double tinhGiaBan(int soLuong) {
        return super.tinhGiaBan(soLuong) + this.tinhThue() * super.tinhGiaBan(soLuong);
    }

    @Override
    public double tinhKhuyenMai(int soLuong) {
        return 0.1 * this.tinhGiaBan(soLuong);
    }
}
