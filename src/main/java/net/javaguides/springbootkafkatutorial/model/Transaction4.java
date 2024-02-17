package net.javaguides.springbootkafkatutorial.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.Instant;

@JsonDeserialize(builder=Transaction4.Builder.class)
public class Transaction4 {
    private final String clearCm15;
    private final Instant transactionTimestamp;
    private final String encryptedCm15;

    private Transaction4(Builder builder) {
        clearCm15 = builder.clearCm15;
        transactionTimestamp = builder.transactionTimestamp;
        encryptedCm15 = builder.encryptedCm15;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Transaction4 copy) {
        Builder builder = new Builder();
        builder.clearCm15 = copy.getClearCm15();
        builder.transactionTimestamp = copy.getTransactionTimestamp();
        builder.encryptedCm15 = copy.getEncryptedCm15();
        return builder;
    }

    public String getClearCm15() {
        return clearCm15;
    }

    public Instant getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public String getEncryptedCm15() {
        return encryptedCm15;
    }

    public static final class Builder {
        private String clearCm15;
        private Instant transactionTimestamp;
        private String encryptedCm15;

        private Builder() {
        }



        public Builder withClearCm15(String val) {
            clearCm15 = val;
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

        public Transaction4 build() {
            return new Transaction4(this);
        }
    }
}
