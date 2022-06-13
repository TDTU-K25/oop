public class InvoiceDetails {
    private String invoiceID;
    private String dName;
    private int qty;

    public InvoiceDetails(String invoiceID, String dName, int qty) {
        this.invoiceID = invoiceID;
        this.dName = dName;
        this.qty = qty;
    }

    public String getInvoiceID() {
        return this.invoiceID;
    }

    public String getDName() {
        return this.dName;
    }

    public int getAmount() {
        return this.qty;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }

    public void setAmount(int amount) {
        this.qty = amount;
    }

    @Override
    public String toString() {
        return this.invoiceID + "_" + this.dName + "_" + this.qty;
    }
}
