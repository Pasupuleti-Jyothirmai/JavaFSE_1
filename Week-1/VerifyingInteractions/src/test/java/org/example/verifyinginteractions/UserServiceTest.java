package org.example.verifyinginteractions;

import org.example.verifyinginteractions.external.NotificationService;
import org.example.verifyinginteractions.service.UserService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testRegisterUser() {

        // Create mock
        NotificationService mockService = mock(NotificationService.class);

        // Inject mock
        UserService userService = new UserService(mockService);

        // Call method
        userService.registerUser("John");

        // Verify interaction
        verify(mockService).sendNotification("Welcome John");
    }
}