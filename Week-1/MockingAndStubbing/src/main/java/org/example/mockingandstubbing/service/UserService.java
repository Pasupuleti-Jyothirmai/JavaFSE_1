package org.example.mockingandstubbing.service;

import org.example.mockingandstubbing.external.ExternalApi;

public class UserService {

    private ExternalApi externalApi;

    public UserService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}