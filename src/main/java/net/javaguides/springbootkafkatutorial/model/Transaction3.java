package net.javaguides.springbootkafkatutorial.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.Instant;

@JsonDeserialize(builder=Transaction3.Builder.class)
public class Transaction3 {

    private final String clearCm15;
    private final String merchantIdentifier;
    private final Double transactionAmount;
    private final Instant transactionTimestamp;
    private final String encryptedCm15;

    private final String transactionIdentifier;

    private Transaction3(Builder builder) {
        clearCm15 = builder.clearCm15;
        merchantIdentifier = builder.merchantIdentifier;
        transactionAmount = builder.transactionAmount;
        transactionTimestamp = builder.transactionTimestamp;
        encryptedCm15 = builder.encryptedCm15;
        transactionIdentifier = builder.transactionIdentifier;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Transaction3 copy) {
        Builder builder = new Builder();
        builder.clearCm15 = copy.getClearCm15();
        builder.merchantIdentifier = copy.getMerchantIdentifier();
        builder.transactionAmount = copy.getTransactionAmount();
        builder.transactionTimestamp = copy.getTransactionTimestamp();
        builder.encryptedCm15 = copy.getEncryptedCm15();
        builder.transactionIdentifier = copy.getTransactionIdentifier();
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

    public Instant getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public String getEncryptedCm15() {
        return encryptedCm15;
    }

    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public static final class Builder {
        private String clearCm15;
        private String merchantIdentifier;
        private Double transactionAmount;
        private Instant transactionTimestamp;
        private String encryptedCm15;
        private String transactionIdentifier;

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

        public Builder withTransactionTimestamp(Instant val) {
            transactionTimestamp = val;
            return this;
        }

        public Builder withEncryptedCm15(String val) {
            encryptedCm15 = val;
            return this;
        }

        public Builder withTransactionIdentifier(String val) {
            transactionIdentifier = val;
            return this;
        }

        public Transaction3 build() {
            return new Transaction3(this);
        }
    }
}
