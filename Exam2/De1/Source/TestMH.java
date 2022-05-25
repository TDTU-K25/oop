public class TestMH {
    public static void main(String[] args) {
        MatHang mh1 = new NongSan("MH1", "Bap Cai Tim", 20000, "Bap Cai");
        System.out.println(mh1.tinhTongGiaBan(1));
        MatHang mh2 = new NongSan("MH2", "Khoai Tay Da Lat", 30000, "Khoai Tay");
        System.out.println(mh2.tinhTongGiaBan(4));
        MatHang mh3 = new HaiSan("MH3", "Cua Hoang De", 3000000, "Cua");
        System.out.println(mh3.tinhTongGiaBan(1));
        System.out.printf("%.0f\n", mh3.tinhTongGiaBan(6));
    }
}