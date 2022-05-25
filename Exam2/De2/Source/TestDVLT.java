public class TestDVLT{
    public static void main(String[] args){
        DichVuLuuTru ks1 = new KhachSan("Da Lat", 700000, "Rung Thong", 2);
        System.out.println(ks1.tinhGiaThueCoBan());
        DichVuLuuTru ks2 = new KhachSan("Nha Trang", 1000000, "Hong Ngoc", 4);
        System.out.println(ks2.tinhGiaThueCoBan());
        DichVuLuuTru v1 = new Villa("Da Lat", 5000000, "Lan Rung", 4);
        System.out.printf("%.0f\n", v1.tinhGiaThueCoBan());
        DichVuLuuTru v2 = new Villa("Nha Trang", 7000000, "Bien Duong", 7);
        System.out.printf("%.0f\n", v2.tinhGiaThueCoBan());
    }
}