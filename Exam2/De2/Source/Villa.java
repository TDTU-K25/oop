public class Villa extends DichVuLuuTru {
    private String tenVilla;
    private int soPhongNgu;

    public Villa(String viTri, double giaCoBan, String tenVilla, int soPhongNgu) {
        super(viTri, giaCoBan);
        this.tenVilla = tenVilla;
        this.soPhongNgu = soPhongNgu;
    }

    @Override 
    public double tinhGiaThueCoBan() {
        double giaThueCoBan = 0;
        if (this.soPhongNgu <= 2) {
            giaThueCoBan = this.giaCoBan + 3000000;
        }
        if (this.soPhongNgu <= 5) {
            giaThueCoBan = this.giaCoBan + 3000000 + (this.soPhongNgu - 2) * 2000000;
        }
        if (this.soPhongNgu > 5) {
            giaThueCoBan = this.giaCoBan + 3000000 + (this.soPhongNgu - 3) * 2000000 + (this.soPhongNgu - 5) * 1000000;
        }
        return giaThueCoBan;
    }
}
