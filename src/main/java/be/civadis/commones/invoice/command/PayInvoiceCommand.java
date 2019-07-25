package be.civadis.commones.invoice.command;

import java.math.BigDecimal;
import java.time.Instant;

import be.civadis.tools.es.BaseCommand;

/**
 * PayInvoice
 */
public class PayInvoiceCommand extends BaseCommand{

    private Instant paymentDate;
    private BigDecimal paymentAmount;

    public PayInvoiceCommand(String aggregateId, String contexteId, Instant paymentDate, BigDecimal paymentAmount) {
        super(aggregateId, contexteId);
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public Instant getPaymentDate() {
        return paymentDate;
    }
    
}