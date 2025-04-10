package br.com.dio.barbershopui.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class ProblemResponse {

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    @JsonProperty("message")
    private String message;

    public ProblemResponse() {}

    public ProblemResponse(Integer status, OffsetDateTime timestamp, String message) {
        this.status = status;
        this.timestamp = timestamp;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Builder manual
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer status;
        private OffsetDateTime timestamp;
        private String message;

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ProblemResponse build() {
            return new ProblemResponse(status, timestamp, message);
        }
    }
}
