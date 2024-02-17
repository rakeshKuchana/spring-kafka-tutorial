package net.javaguides.springbootkafkatutorial.model;

import java.time.Instant;

public class Transaction2 {
    private String clearCm15;
    private String merchantIdentifier;
    private Double transactionAmount;
    private String transactionCaseStatuscode;
    private String transactionIdentifier;
    private String transactionMode;
    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Instant transactionTimestamp;

    public String getClearCm15() {
        return clearCm15;
    }

    public void setClearCm15(String clearCm15) {
        this.clearCm15 = clearCm15;
    }

    public String getMerchantIdentifier() {
        return merchantIdentifier;
    }

    public void setMerchantIdentifier(String merchantIdentifier) {
        this.merchantIdentifier = merchantIdentifier;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionCaseStatuscode() {
        return transactionCaseStatuscode;
    }

    public void setTransactionCaseStatuscode(String transactionCaseStatuscode) {
        this.transactionCaseStatuscode = transactionCaseStatuscode;
    }

    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    public String getTransactionMode() {
        return transactionMode;
    }

    public void setTransactionMode(String transactionMode) {
        this.transactionMode = transactionMode;
    }

    public Instant getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public void setTransactionTimestamp(Instant transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }
}
