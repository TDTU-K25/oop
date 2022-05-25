public abstract class SanPham {
    protected String maSanPham;
    protected String tenSanPham;
    protected String donViTinh;
    protected double giaTien;

    public SanPham(String maSanPham, String tenSanPham, String donViTinh, double giaTien) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donViTinh = donViTinh;
        this.giaTien = giaTien;
    }

    public String getDonViTinh() {
        return this.donViTinh;
    }

    public abstract double thanhTien();

    public abstract double tinhThue();  

    public String toString() {
        return this.tenSanPham + "_" + this.donViTinh + "_" + this.giaTien;
    }
}