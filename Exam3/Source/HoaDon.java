import java.util.*;
import java.io.*;

public class HoaDon {
    private ArrayList<SanPham> dsSanPham; // Don't forget to instantiate object

    public HoaDon(String path){
       dsSanPham = docDSSanPham(path);
    }

    public ArrayList<SanPham> docDSSanPham(String path){
        //code here
        ArrayList<SanPham> temp = new ArrayList<SanPham>();
        try {
            File data = new File(path);
            Scanner sc = new Scanner(data);

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] info = line.split(",");
                if(info[0].charAt(0) == 'T') {
                    temp.add(new TraiCay(info[0], info[1], this.layDonViTinh(info[0]), Double.parseDouble(info[2]), Double.parseDouble(info[3])));
                }
                if(info[0].charAt(0) == 'B') {
                    temp.add(new BanhMut(info[0], info[1], this.layDonViTinh(info[0]), Double.parseDouble(info[2]), Integer.parseInt(info[3])));
                }
            }
            
            sc.close();
            return temp;
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return null;
        }
    }

    private String layDonViTinh(String maSP){
        //code here;
        if(maSP.charAt(0) == 'T') {
            return "kg";
        }
        if(maSP.charAt(0) == 'B') {
            return "hop";
        }
        return "";
    }

    public double tinhTongGiaTriHoaDon(){
        //code here
        double tongGiaTriHoaDon = 0;
        for (SanPham sanPham : dsSanPham) {
            tongGiaTriHoaDon += (sanPham.thanhTien() + sanPham.thanhTien() * sanPham.tinhThue());
        }
        return tongGiaTriHoaDon;
    }

    public void inThongTinSanPham(){
        if(dsSanPham == null){
            System.out.println("Khong co san pham");
            return;
        }
        for(SanPham s : dsSanPham){
           System.out.println(s);
        }
    }
}