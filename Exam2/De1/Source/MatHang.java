public abstract class MatHang {
    private String maMH;
    private String tenMH;
    private double giaMH;

    public MatHang(String maMH, String tenMH, double giaMH) {
        this.maMH = maMH;
        this.giaMH = giaMH;
        this.tenMH = tenMH;
    }

    public double tinhGiaBan(int soLuong) {
        return this.giaMH * soLuong;
    }

    public abstract double tinhKhuyenMai(int soLuong);

    public double tinhTongGiaBan(int soLuong) {
        return this.tinhGiaBan(soLuong) - this.tinhKhuyenMai(soLuong);
    }
}
