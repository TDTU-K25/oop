public class HaiSan extends MatHang {
    private String loaiHaiSan;

    public HaiSan(String maMH, String tenMH, double giaBan, String loaiHaiSan) {
        super(maMH, tenMH, giaBan);
        this.loaiHaiSan = loaiHaiSan;
    }

    @Override
    public double tinhKhuyenMai(int soLuong) {
        if (soLuong > 5) {
            return 0.05 * super.tinhGiaBan(soLuong);
        }
        return 0;
    }
}
