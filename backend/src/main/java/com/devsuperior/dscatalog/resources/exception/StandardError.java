package com.devsuperior.dscatalog.resources.exception;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class StandardError implements Serializable {

    private Instant Timestamp;

    private Integer status;

    private String error;

    private String message;
    private String path;

    public StandardError() {

    }

    public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
        Timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.message = path;
    }

    public Instant getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        Timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StandardError that = (StandardError) o;
        return Objects.equals(Timestamp, that.Timestamp) && Objects.equals(status, that.status) && Objects.equals(error, that.error) && Objects.equals(message, that.message) && Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Timestamp, status, error, message, path);
    }
}
