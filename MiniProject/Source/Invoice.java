public class Invoice {
    private String invoiceID;
    private String staffID;
    private String date;

    public Invoice(String invoiceID, String staffID, String date) {
        this.invoiceID = invoiceID;
        this.staffID = staffID;
        this.date = date;
    }

    public String getInvoiceID() {
        return this.invoiceID;
    }

    public String getStaffID() {
        return this.staffID;
    }

    public String getDate() {
        return this.date;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return this.invoiceID + "_" + this.staffID + "_" + this.date;
    }
}
