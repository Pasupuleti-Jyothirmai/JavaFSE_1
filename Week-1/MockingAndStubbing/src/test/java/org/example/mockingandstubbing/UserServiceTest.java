package org.example.mockingandstubbing;

import org.example.mockingandstubbing.external.ExternalApi;
import org.example.mockingandstubbing.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testFetchData() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        UserService service = new UserService(mockApi);

        // Verify result
        assertEquals("Mock Data", service.fetchData());

        // Verify interaction
        verify(mockApi).getData();
    }
}