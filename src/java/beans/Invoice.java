package beans;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Invoice {

    private List<LineCart> lineCarts;
    private Date invoiceDate;
    int invoiceTotal = 0;

    public List<LineCart> getLineCarts() {
        return lineCarts;
    }

    public void setLineCarts(List<LineCart> lineCarts) {
        this.lineCarts = lineCarts;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceDateDefaultFormat() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String invoiceDateFormatted = dateFormat.format(invoiceDate);
        return invoiceDateFormatted;
    }

    public int getInvoiceTotal() {
        int invoiceTotal = 0;

        for (LineCart cart : lineCarts) {
            invoiceTotal += cart.getCartTotal();
        }
        return invoiceTotal;
    }

    public String getInvoiceTotalCurrencyFormat() {
        int total = this.getInvoiceTotal();
        NumberFormat currency = NumberFormat.getInstance(Locale.FRANCE);
        String formattedTotal = currency.format(total);
        return formattedTotal;
    }
}
