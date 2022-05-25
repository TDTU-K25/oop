public class KhachSan extends DichVuLuuTru {
    private String tenKS;
    private int soSao;

    public KhachSan(String viTri, double giaCoBan, String tenKS, int soSao) {
        super(viTri, giaCoBan);
        this.tenKS = tenKS;
        this.soSao = soSao;
    }

    @Override 
    public double tinhGiaThueCoBan() {
        double giaThue = 0;
        if (this.soSao <= 2) {
            giaThue = this.giaCoBan;
        }
        if (this.soSao >= 3) {
            giaThue = this.giaCoBan * 1.1;
        }
        return giaThue + this.tinhThue() * giaThue;
    }
}
