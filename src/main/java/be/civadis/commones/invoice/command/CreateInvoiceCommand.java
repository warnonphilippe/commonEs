package be.civadis.commones.invoice.command;

import java.time.Instant;

import be.civadis.tools.es.BaseCommand;

/**
 * CreateInvoiceCommand
 */
public class CreateInvoiceCommand extends BaseCommand{

    private String code;
    private Instant date;
    private String details;

    public CreateInvoiceCommand(String aggregateId, String contexteId, String code, Instant date, String details) {
        super(aggregateId, contexteId);
        this.code = code;
        this.date = date;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public Instant getDate() {
        return date;
    }

    public String getCode() {
        return code;
    }

}