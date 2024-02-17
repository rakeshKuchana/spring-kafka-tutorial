package net.javaguides.springbootkafkatutorial.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.Instant;

@JsonDeserialize(builder=Transaction.Builder.class)
public class Transaction {
    private final String clearCm15;
    private final String merchantIdentifier;
    private final Double transactionAmount;
    private final String transactionCaseStatuscode;
    private final String transactionIdentifier;
    private final String transactionMode;
    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private final Instant transactionTimestamp;
    private final String encryptedCm15;

    private Transaction(Builder builder) {
        clearCm15 = builder.clearCm15;
        merchantIdentifier = builder.merchantIdentifier;
        transactionAmount = builder.transactionAmount;
        transactionCaseStatuscode = builder.transactionCaseStatuscode;
        transactionIdentifier = builder.transactionIdentifier;
        transactionMode = builder.transactionMode;
        transactionTimestamp = builder.transactionTimestamp;
        encryptedCm15 = builder.encryptedCm15;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Transaction copy) {
        Builder builder = new Builder();
        builder.clearCm15 = copy.getClearCm15();
        builder.merchantIdentifier = copy.getMerchantIdentifier();
        builder.transactionAmount = copy.getTransactionAmount();
        builder.transactionCaseStatuscode = copy.getTransactionCaseStatuscode();
        builder.transactionIdentifier = copy.getTransactionIdentifier();
        builder.transactionMode = copy.getTransactionMode();
        builder.transactionTimestamp = copy.getTransactionTimestamp();
        builder.encryptedCm15 = copy.getEncryptedCm15();
        return builder;
    }

    public String getClearCm15() {
        return clearCm15;
    }

    public String getMerchantIdentifier() {
        return merchantIdentifier;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public String getTransactionCaseStatuscode() {
        return transactionCaseStatuscode;
    }

    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public String getTransactionMode() {
        return transactionMode;
    }

    public Instant getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public String getEncryptedCm15() {
        return encryptedCm15;
    }

    public static final class Builder {
        private String clearCm15;
        private String merchantIdentifier;
        private Double transactionAmount;
        private String transactionCaseStatuscode;
        private String transactionIdentifier;
        private String transactionMode;
        private Instant transactionTimestamp;
        private String encryptedCm15;

        private Builder() {
        }



        public Builder withClearCm15(String val) {
            clearCm15 = val;
            return this;
        }

        public Builder withMerchantIdentifier(String val) {
            merchantIdentifier = val;
            return this;
        }

        public Builder withTransactionAmount(Double val) {
            transactionAmount = val;
            return this;
        }

        public Builder withTransactionCaseStatuscode(String val) {
            transactionCaseStatuscode = val;
            return this;
        }

        public Builder withTransactionIdentifier(String val) {
            transactionIdentifier = val;
            return this;
        }

        public Builder withTransactionMode(String val) {
            transactionMode = val;
            return this;
        }

        public Builder withTransactionTimestamp(Instant val) {
            transactionTimestamp = val;
            return this;
        }

        public Builder withEncryptedCm15(String val) {
            encryptedCm15 = val;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}
