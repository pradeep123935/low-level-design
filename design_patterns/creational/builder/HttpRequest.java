package design_patterns.creational.builder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    // required
    private final String url;

    // optional
    private final String method;
    private final Map<String, Object> headers;
    private final Map<String, Object> queryParams;
    private final Map<String, Object> body;
    private final int timeout;

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }

    // Getters (optional)
    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public Map<String, Object> getHeaders() {
        return headers;
    }

    public Map<String, Object> getQueryParams() {
        return queryParams;
    }

    public Map<String, Object> getBody() {
        return body;
    }

    public int getTimeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                '}';
    }

    public static class Builder {
        private String url;
        private String method = "GET";
        private Map<String,Object> headers = new HashMap<>();
        private Map<String,Object> queryParams = new HashMap<>();
        private Map<String,Object> body;
        private int timeout = 30000;

        public Builder(String url) {
            this.url = url;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder addHeaders(Map<String,Object> headers) {
            this.headers = headers;
            return this;
        }

        public Builder addQueryParams(Map<String,Object> queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public Builder body(Map<String,Object> body) {
            this.body = body;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }

}
