public class TestSP {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon("HoaDon.txt");
        System.out.println(hd.tinhTongGiaTriHoaDon());
        hd.inThongTinSanPham();
    }
}