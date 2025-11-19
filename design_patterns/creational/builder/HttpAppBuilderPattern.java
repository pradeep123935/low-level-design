package design_patterns.creational.builder;

import java.util.HashMap;
import java.util.Map;

public class HttpAppBuilderPattern {
    public static void main(String[] args) {
        HttpRequest request1 = new HttpRequest.Builder("https://api.example.com/data")
            .build();

        Map<String,Object> headers = new HashMap<>();
        headers.put("abc","abc");

        HttpRequest request2 = new HttpRequest
        .Builder("https://api.example.com/data")
        .timeout(2000)
        .addHeaders(headers)
        .build();

        System.out.println(request1);
        System.out.println(request2);
    }
}
