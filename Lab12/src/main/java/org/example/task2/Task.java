package org.example.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class Task<T> {
    private String id;
    private Map<String, String> headers;

    public abstract void apply(T arg, StampingVisitor visitor);

    public void freeze() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    protected void setHeader(String header, String headerValue) {
        if (headers == null) {
            headers = new HashMap<>();
        }
        headers.put(header, headerValue);
    }

    public String getHeader(String header) {
        return headers.get(header);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, Object> accept(StampingVisitor visitor) {
        return visitor.onSignature((Signature<?>) this, getHeaders());
    }
}
