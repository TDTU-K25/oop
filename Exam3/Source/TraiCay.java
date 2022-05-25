public class TraiCay extends SanPham {
    private double soLuong;
   
    public TraiCay(String maSanPham, String tenSanPham, String donViTinh, double giaTien, double soLuong) {
        //code here
        super(maSanPham, tenSanPham, donViTinh, giaTien);
        this.soLuong = soLuong;
    }

    public double thanhTien() {
        //code here
        return super.giaTien * this.soLuong; // return this.giaTien * this.soLuong;
    }

    public double tinhThue() {
        //code here
        return 0.05;
    }

    public String toString() {
        return super.toString() + "_" + soLuong;
    }
}