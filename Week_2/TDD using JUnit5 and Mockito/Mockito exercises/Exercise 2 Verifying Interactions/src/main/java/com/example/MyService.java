package com.example;

/**
 * MyService depends on ExternalApi to fetch data.
 */
public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
